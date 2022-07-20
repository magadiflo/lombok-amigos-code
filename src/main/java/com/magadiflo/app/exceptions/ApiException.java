package com.magadiflo.app.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

/**
 * @Data, es una anotación de lombok especial, reune varias anotaciones:
 * - Crea un constructor requerido, puede ser un constructor vacío o un constructor
 *   con parámetros cuyos atributos son finales. Ahora, si queremos que un atributo
 *   no final también forme parte del constructor, debemos complementarle con
 *   la anotación @AllArgsConstructor
 * - Setters y Getters de los atributos
 * - Equals y HashCode
 * - ToString
 */
@Data
public class ApiException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;

    private String name;

}
