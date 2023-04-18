import ru.netology.services.ScheduleService;

public class Main {
    public static void main(String[] args) {

        ScheduleService service = new ScheduleService();
        int count = service.calculate(10_000, 3000, 20_000);
        System.out.println(count);
    }
}