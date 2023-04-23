package ru.netology.vacationtime.services;

public class VacationService {

    public int calculate(int income, int expense, int threshold) {

        int count = 0; // счетчик кол-ва месяцев беззаботного отдыха
        int money = 0; // первоначальной остаток средств на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (int) (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}
