package com.magadiflo.app.models;

import lombok.ToString;

/**
 * @ToString, Crea una implementación del método toString(). De forma predeterminada, no incluirá ningún campo estático
 * en la implementación de toString(). Además, podemos excluir el campo específico en la implementación de toString()
 * utilizando el parámetro opcional 'exclude'. También podemos incluir la salida del método toString() de la
 * superclase estableciendo el parámetro opcional 'callSuper' en true.
 */

@ToString(callSuper = true, exclude = {"author"})
public class Notebook {

    private static String id;
    private String title;
    private double price;
    private String author;
    private boolean available;

}
