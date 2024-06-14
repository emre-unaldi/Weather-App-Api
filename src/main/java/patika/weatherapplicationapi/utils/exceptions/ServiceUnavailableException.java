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
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnavailableException extends BusinessException{
    public ServiceUnavailableException(BaseErrorMessage baseErrorMessage) {
        super(baseErrorMessage);
    }
}
