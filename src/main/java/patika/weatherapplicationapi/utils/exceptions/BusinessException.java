package patika.weatherapplicationapi.utils.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
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
@Getter
@Setter
@RequiredArgsConstructor
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BusinessException extends RuntimeException {
    private final BaseErrorMessage baseErrorMessage;
}
