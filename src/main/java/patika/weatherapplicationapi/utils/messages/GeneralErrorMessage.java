package patika.weatherapplicationapi.utils.messages;

import lombok.Getter;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 14.06.2024
 */
@Getter
public enum GeneralErrorMessage implements BaseErrorMessage {
    ITEM_NOT_FOUND("Item not found !"),
    BAD_REQUEST("Bad request !"),
    SERVICE_UNAVAIBLE_EXCEPTION("Service not available error !");

    private final String message;

    GeneralErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
