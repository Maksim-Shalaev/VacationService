package ru.netology.vacationtime.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.vacationtime.services.VacationService;

public class VacationServiceTest {

    @Test
    public void testFromTask1() {
        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFromTask2() {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWithoutIncome() {
        VacationService service = new VacationService();

        int expected = 0;
        int actual = service.calculate(0, 10_000, 30_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWithoutExpense() {
        VacationService service = new VacationService();

        int expected = 1;
        int actual = service.calculate(1_000, 0, 11_000);
        Assertions.assertEquals(expected, actual);
    }
}
