import java.util.Scanner;

public class Plate {
    private static Scanner scanner = new Scanner(System.in);
    private int food;
    private boolean isFood = false;

    public Plate (int food) {  // обязательно должно быть внесено начальное значение
        this.food = food;
    }



    public int getFood () {
        return food;
    }

    public void setFood (int food) {
        this.food = food;
    }

    public void decreaseFood (int n) {

do {
    if (food >= n) {
        food -= n;
    } else {
        System.out.println(" Еды не достаточно наполните миску");
        fillingThePlate(food);

    }
}while ((food < n));





    }


    public void info () {
        System.out.println("plate: " + food);

    }

    public  int fillingThePlate ( int x){
        System.out.println("Наполните миску едой ( емкость тарелки от 0 до 100 )  "); // максимальная емкость тарелки

        food = getFodPlate(0, 100);
        return food;
    }

    public static int getFodPlate (int min, int max) {
        int x;
        do {
            x = scanner.nextInt();
            System.out.println("Наполните миску едой от 0 до 100");
        } while (x <= -1 || x >= 100);
        return x;
    }
}