package com.company;

public class Artifacts {

    int number;
    String culture;
    int century;

    Artifacts(int number) {
        this.number = number;
    }

    Artifacts(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    Artifacts(int number, String culture, int century) {
        this.number = number;
        this.culture = culture;
        this.century = century;

    }
}
