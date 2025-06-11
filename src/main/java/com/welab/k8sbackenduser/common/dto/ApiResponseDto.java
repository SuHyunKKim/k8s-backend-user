package com.welab.k8sbackenduser.common.dto;

import lombok.Data;

@Data
public class ApiResponseDto<T> {
    private String code;
    private String message;
    private T data;

    // private로 만듦. 밖에서 따로 생성하지 않겠다.
    private ApiResponseDto(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private ApiResponseDto(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // public으로 만들어서, 아래의 것들을 밖에서 쓰겠다.
    public static <T> ApiResponseDto<T> createOk(T data) {
        return new ApiResponseDto<>("OK", "요청이 성공하였습니다.", data);
    }

    public static ApiResponseDto<String> defaultOk() {
        return ApiResponseDto.createOk(null);
    }

    public static ApiResponseDto<String> createError(String code, String message) {
        return new ApiResponseDto<>(code, message);
    }
}