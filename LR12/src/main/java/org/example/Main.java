package org.example;

public class Main {
    public static void main(String[] args) {
        Tester testers1 = new Tester("Иван", "Иванов");
        Tester testers2 = new Tester("Анна", "Смирнова", 5);
        Tester testers3 = new Tester("Борис", "Петров", 10, "Продвинутый", 5000.0);

        testers1.showInfo();
        testers2.showInfo(true);
        testers3.showInfo("Старший тестировщик:");
        Tester.companyPolicy();
    }
}
