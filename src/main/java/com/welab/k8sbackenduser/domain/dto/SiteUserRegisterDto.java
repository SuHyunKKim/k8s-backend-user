package com.welab.k8sbackenduser.domain.dto;

import jakarta.validation.constraints.NotBlank;
import com.welab.k8sbackenduser.domain.SiteUser;
import com.welab.k8sbackenduser.secret.hash.SecureHashUtils;
import lombok.Data;

@Data
public class SiteUserRegisterDto {

    @NotBlank(message = "아이디를 입력하세요.")
    private String userId;

    @NotBlank(message = "비밀번호를 입력하세요.")
    private String password;

    @NotBlank(message = "전화번호를 입력하세요.")
    private String phoneNumber;

    public SiteUser toEntity() {
        SiteUser siteUser = new SiteUser();

        siteUser.setUserId(this.userId);
        siteUser.setPassword(SecureHashUtils.hash(this.password));
        siteUser.setPhoneNumber(this.phoneNumber);

        return siteUser;
    }
}
