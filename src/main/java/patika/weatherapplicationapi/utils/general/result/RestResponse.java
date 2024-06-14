package patika.weatherapplicationapi.utils.general.result;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 14.06.2024
 */
@Getter
@Setter
public class RestResponse<T> {
    private T data;
    private LocalDateTime responseDate;
    private boolean isSuccess;
    private String message;

    public RestResponse(T data, boolean isSuccess){
        this.data = data;
        this.isSuccess = isSuccess;
        this.responseDate = LocalDateTime.now();
    }

    public RestResponse(T data, boolean isSuccess, String message){
        this.data = data;
        this.message = message;
        this.isSuccess = isSuccess;
        this.responseDate = LocalDateTime.now();
    }

    public static <T> RestResponse<T> of(T t){
        return new RestResponse<>(t, true);
    }

    public static <T> RestResponse<T> of(T t, String message){
        return new RestResponse<>(t, true, message);
    }

    public static <T> RestResponse<T> error(T t){
        return new RestResponse<>(t, false);
    }

    public static <T> RestResponse<T> empty(){
        return new RestResponse<>(null, true);
    }
}
