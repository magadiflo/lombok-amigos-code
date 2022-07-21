package com.magadiflo.app.models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder //Crear los objetos según los constructores que se necesiten
public class Client {

    private String firstName;
    private String lastName;
    private Integer age;

}
