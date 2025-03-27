package org.example;
class Tester {
    private String name;
    private String surname;
    private int yearsOfExperience;
    private String levelEnglish;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Неизвестно", 0.0);
    }

    public Tester(String name, String surname, int yearsOfExperience) {
        this(name, surname, yearsOfExperience, "Неизвестно", 5000.0);
    }

    public Tester(String name, String surname, int yearsOfExperience, String levelEnglish, double salary) {
        this.name = name;
        this.surname = surname;
        this.yearsOfExperience = yearsOfExperience;
        this.levelEnglish = levelEnglish;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Тестировщик: " + name + " " + surname);
    }

    public void showInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Тестировщик: " + name + " " + surname + ", Опыт: " + yearsOfExperience + " лет, Английский: " + levelEnglish + ", salary: " + salary);
        } else {
            showInfo();
        }
    }

    public void showInfo(String prefix) {
        System.out.println(prefix + " " + name + " " + surname);
    }

    public static void companyPolicy() {
        System.out.println("Все тестировщики должны проходить ежегодную аттестацию.");
    }
}