package com.magadiflo.app;

import com.magadiflo.app.models.Animal;
import com.magadiflo.app.models.Book;
import com.magadiflo.app.models.Person;

public class Test {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Martín");
        p.setEmail("marti_df@hotmail.com");
        p.setEdad(25);
        System.out.println(p);
        //===================================

        Person p2 = new Person("Susan", "susan@gmail.com", 18, 65.50D);
        System.out.println(p2);

        //===================================
        Animal animal = new Animal();
        animal.setId(1L);
        animal.setName("Peluchina");
        animal.setRace("Criollo");
        System.out.println(animal);

        //===================================
        Book bookNoArgs = new Book();
        Book bookWithId = new Book(2L);
        Book bookWithAllArgs = new Book(1L, "Cien años de soledad", "Libro emblemático");

    }

}
