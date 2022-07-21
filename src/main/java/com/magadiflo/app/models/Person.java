package com.magadiflo.app.models;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private String email;
    private Integer edad;

}
