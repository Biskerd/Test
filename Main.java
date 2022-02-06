import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        final int contInTruck = 12;
        final int boxInCont = 27;
        int inBox = scr.nextInt();
        int truck = 1;
        int container = 1;
        int boxCount = 0;
        if (inBox > 0)
        {
            System.out.println("Грузовик " + truck + ":");
            System.out.println("Контейнер " + container + ":");
            while (boxCount < inBox)
            {
                System.out.println("\tЯщик " + ++boxCount);
                if ((container % contInTruck == 0) && (boxCount % boxInCont == 0))
                {
                    System.out.println("Грузовик " + ++truck + ":");
                }
                if ((boxCount % boxInCont == 0) && ((inBox - boxCount) > 0))

                {
                    System.out.println("Контейнер " + ++container + ":");
                }
            }
        }
        else
        {
            System.out.println("Ящиков нет!");
        }
    }
}
