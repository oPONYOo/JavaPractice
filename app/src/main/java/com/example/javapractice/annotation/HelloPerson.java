package com.example.javapractice.annotation;

import java.lang.annotation.Annotation;

public class HelloPerson {

    public static void main(String[] args) {
        HelloPerson person = new HelloPerson();

        person.printHello(new Person("jina", 24));
        person.printHello(new Person("ponyo", 5));

    }

    public void printHello(Person person) {

        Annotation[] annotations = Person.class.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Hello) {
                Hello hello = (Hello) annotation;
                System.out.println(person.getName() + "says" + hello.mention());
            }
        }
    }
}
