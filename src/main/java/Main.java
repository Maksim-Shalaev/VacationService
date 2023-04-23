import ru.netology.vacationtime.services.VacationService;

public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService(); // создание объекта для расчета отпуска
        int count = service.calculate(1_000, 0, 11_000); // вызов метод и ввод исходных данных
        System.out.println("При текущих данных, общее количество отпуска составит: " + count + " мес");
    }
}