package com.magadiflo.app.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Animal {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String race;

}
