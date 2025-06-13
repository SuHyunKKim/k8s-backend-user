package com.welab.k8sbackenduser.secret.jwt.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(value = "jwt", ignoreUnknownFields = true)
public class JwtConfigProperties {

    private Integer expiresIn;
    private Integer mobileExpiresIn;
    private Integer tabletExpiresIn;
    private String secretKey;

}
