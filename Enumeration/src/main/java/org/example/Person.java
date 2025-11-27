package org.example;

public class Person {
    private String name;
    private String surname;
    private CivState civilState;
    private String identityNumber;
    private int age;


    public Person (String name, String surname, CivState civilState, String identityNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.civilState = civilState;
        this.identityNumber = identityNumber;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public CivState getCivilState () {
        return civilState;
    }

    public void setCivilState (CivState civilState) {
        this.civilState = civilState;
    }

    public String getIdentityNumber () {
        return identityNumber;
    }

    public void setIdentityNumber (String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void greetings () {
        System.out.println("Hola, soy " + name + " " + surname + " y mi DNI/NIF es " + identityNumber);
    }

    public void farewell () {
        System.out.println("¡Hasta la próxima! Firmado: " + name);
    }

}
