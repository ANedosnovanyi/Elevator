import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true){
//            System.out.println("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }

        Dimensions dimensions = new Dimensions(1,2,3);
        dimensions = dimensions.setHight(2500);
        dimensions = dimensions.setLendt(3500);
        dimensions = dimensions.setWight(150);
        Cargo cargo = new Cargo(1,"Murmansk, Severnava 37b", true, true, "A505MB51",dimensions, 1,2, 3);
        cargo = cargo.setWight(111);
        System.out.println(dimensions);

        System.out.println(cargo);
    }
}
