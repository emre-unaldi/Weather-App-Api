package patika.weatherapplicationapi.utils.messages;

import java.time.LocalDateTime;

/**
 * Copyright (c) 2024
 * All rights reserved.
 *
 * @author Emre Ünaldı
 * @since 14.06.2024
 */
public record GeneralErrorMessages(LocalDateTime date, String message, String description) {

}
