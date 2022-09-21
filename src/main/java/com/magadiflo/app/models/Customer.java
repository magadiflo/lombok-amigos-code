package com.magadiflo.app.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @AllArgsConstructor, Nos permite agregar un constructor con todos los atributos declarados.
 * Ahora, si queremos crear un constructor manteniendo todos los atributos excepto el "id", lombok
 * no lo podrá hacer, actualmente no es soportado esa funcionalidad, así que tendríamos que crearlo
 * como tradicionalmente se crea un constructor.
 * @NoArgsConstructor, Permite crear un constructor vacío.
 *
 * @EqualsAndHashCode
 * Esta anotación crea los métodos equals() y hashCode(), ya que ambos están unidos por el contrato hashCode.
 * De forma predeterminada, ambos métodos incluirán todos los campos, excepto los estáticos y transitorios.
 * Al igual que el parámetro 'exclude' del @ToString impide que un campo se incluya en los métodos implementados.
 * También como @ToString podemos incluir opcionalmente el parámetro 'callSuper'.
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Slf4j
public class Customer {

    private Long id;
    private String name;
    private String password;
    private String email;

    public Customer(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;

        log.info("Initializing customer's constructor!");
    }
}
