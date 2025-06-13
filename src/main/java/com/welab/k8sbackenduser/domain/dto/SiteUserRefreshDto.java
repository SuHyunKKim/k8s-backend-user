package com.welab.k8sbackenduser.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SiteUserRefreshDto {

    @NotBlank(message = "리프레시 토큰을 입력하세요.")
    private String token;
}
