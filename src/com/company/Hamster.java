package com.company;

class Hamster {
    // Объявили поля, но не присвоили им значения
    String name;  // Имя
    int age;      // Возраст
    int weight;   // Вес в граммах
    String color; // Цвет

    // Конструктор № 1 создаёт только рыжих хомяков
    Hamster(String hamsterName, int hamsterAge, int hamsterWeight) {
        name = hamsterName;// присваеваем полю объекта значение полученное из конструктора
        age = hamsterAge;// присваеваем полю объекта значение полученное из конструктора
        weight = hamsterWeight;// присваеваем полю объекта значение полученное из конструктора
        color = "Рыжий"; // Закрепили за переменной постоянное значение
    }
    Hamster(String name, int hamsterAge, int hamsterWeight, String hamsterColor) {
            this.name = name;// присваеваем полю объекта значение полученное из конструктора
            age = hamsterAge;// присваеваем полю объекта значение полученное из конструктора
            weight = hamsterWeight;// присваеваем полю объекта значение полученное из конструктора
            color = hamsterColor;// присваеваем полю объекта значение полученное из конструктора
        }
}

