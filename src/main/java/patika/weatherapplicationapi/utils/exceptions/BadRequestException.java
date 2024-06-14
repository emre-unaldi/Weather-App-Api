package patika.weatherapplicationapi.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import patika.weatherapplicationapi.utils.messages.BaseErrorMessage;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 14.06.2024
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends BusinessException{
    public BadRequestException(BaseErrorMessage baseErrorMessage) {
        super(baseErrorMessage);
    }
}