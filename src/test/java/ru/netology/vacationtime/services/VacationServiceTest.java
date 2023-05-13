package ru.netology.vacationtime.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "2, 100000, 60000, 150000",
            "3, 10000, 3000, 20000",
            "0, 0, 10000, 30000",
            "1, 1000, 0, 11000"
    })
    public void testFromTask1(int expected, int income, int expense, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testFromTask1() {
//        VacationService service = new VacationService();
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFromTask2() {
//        VacationService service = new VacationService();
//
//        int expected = 3;
//        int actual = service.calculate(10_000, 3_000, 20_000);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testWithoutIncome() {
//        VacationService service = new VacationService();
//
//        int expected = 0;
//        int actual = service.calculate(0, 10_000, 30_000);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testWithoutExpense() {
//        VacationService service = new VacationService();
//
//        int expected = 1;
//        int actual = service.calculate(1_000, 0, 11_000);
//        Assertions.assertEquals(expected, actual);
//    }
}
