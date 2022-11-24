import java.util.Scanner;

public class Elevator {
    private int minFloor;
    private int maxFloor;
    private int currentFloor = 1;

    public int getCurrentFloor(){
        return currentFloor;
    }
    public void moveUp(int floor) {
        while (currentFloor != floor) {
            currentFloor = currentFloor + 1;
            //currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
            System.out.println("Текущий этаж:");
            System.out.println(currentFloor);
        }
    }
    public void moveDown(int floor){

        while (currentFloor != floor) {
            currentFloor = currentFloor - 1;
            System.out.println("Текущий этаж:");
            System.out.println(currentFloor);
        }
//        System.out.println(currentFloor > minFloor);
//        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public void move(int floor){

        if (floor == currentFloor) {
            System.out.println("Ты и так на этом этажэ");
            return;
        }

        if (floor < minFloor) {
            System.out.println("Такого этажа не существует");
            return;
        }

        if (floor < currentFloor) {
            this.moveDown(floor);
        }
        if (floor > currentFloor){
            this.moveUp(floor);
        }
        if (floor > maxFloor){
            System.out.println("Такого этажа не существует");
            return;
        }
        //if (moveUp();) else moveDown();
        //this.minFloor = Elevator.class

        //this.floor = currentFloor;
        //currentFloor >= minFloor;
        //if (moveUp();){ else moveDown();
        //this.currentFloor = currentFloor;
        //floor = moveUp() ? moveDown(): move();
        //currentFloor = (currentFloor > 1) ? currentFloor : - 1;
    }

    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

        //this.moveDown() = moveDown();
        //if (moveUp();moveDown();)
        getCurrentFloor();

    }
}
