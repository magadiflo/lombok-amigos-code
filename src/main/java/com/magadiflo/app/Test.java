package com.magadiflo.app;

import com.magadiflo.app.models.Person;

public class Test {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Martín");
        p.setEmail("marti_df@hotmail.com");
        p.setEdad(25);
        System.out.println(p);
        //===================================

        Person p2 = new Person("Susan", "susan@gmail.com", 18);
        System.out.println(p2);

    }

}
