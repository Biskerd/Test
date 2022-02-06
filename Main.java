import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        final int contInTrack = 12;
        final int boxInCont = 27;
        int yas = scr.nextInt();
        int cargo = 1;
        int cont = 1;
        int box = 0;
        if (yas > 0)
        {
            System.out.println("Грузовик " + cargo + ":");
            System.out.println("Контейнер " + cont + ":");
            while (box < yas)
            {
                System.out.println("\tЯщик " + ++box);
                if ((cont % contInTrack == 0) && (box % boxInCont == 0))
                {
                    System.out.println("Грузовик " + ++cargo + ":");
                }
                if ((box % boxInCont == 0) && ((yas - box) > 0))

                {
                    System.out.println("Контейнер " + ++cont + ":");
                }
            }
        }
        else
        {
            System.out.println("Ящиков нет!");
        }


    }
}
