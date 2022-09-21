package com.magadiflo.app.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @NonNull
 * Cuando la anotación @NonNull se coloca antes de un parámetro de método o parámetro constructor,
 * significa que este método no aceptará null como argumento. Si le pasa un objeto null, el método generará
 * automáticamente una excepción NullPointerException. De hecho, al usar esta anotación, evita tener que comprobar
 * manualmente y generar manualmente NullPointerException. Generalmente, esta anotación es utilizada
 * por @RequiredArgsConstructor para indicar que la variable está seleccionada para la creación de
 * constructores parametrizados.
 *
 * @RequiredArgsConstructor
 * Utilizamos esta anotación para proporcionar campos seleccionados como parámetros dentro del constructor, es decir,
 * Constructor parametrizado. También el campo debe seleccionarse mediante @NonNull anotación. Además, si ningún campo
 * tiene esta anotación, entonces se selecciona el campo cero y solo genera el constructor predeterminado.
 * Esto también incluirá campos en la creación del constructor que se declaran finales.
 */

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {

    private @NonNull Long id;
    private String title;
    private String description;

}
