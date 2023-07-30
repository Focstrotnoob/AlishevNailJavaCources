package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);

        Task1.businessProcess(picker1);
        Task1.businessProcess(courier1);

        System.out.println(warehouse1);
        System.out.println(courier1.getSalary());
        System.out.println(picker1.getSalary());

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker( warehouse2);

        System.out.println(warehouse2);
        System.out.println(courier2);
        System.out.println(picker2);
    }
    static void businessProcess(Worker worker){
        for (int i = 0; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
