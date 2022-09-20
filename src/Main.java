import java.awt.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Polymorphisme
        Car car = new Car();
        bicycle bicycle = new bicycle();

        vehicule[] racers ={car,bicycle};
        //car.go();
        //bicycle.go();

        for ( vehicule x : racers)
        {
            x.go();
        }

    }
}
/*
    Point point1 = new Point(1,2);
    Point point2 = point1;
        point1.x = 2;
                System.out.println("Test1");
                //System.out.println(point1);
                //System.out.println(point2);

                //================== String Test ==================
                //use backslash to specify " "

                String message = " Coucou \"Monsieur\"";
                //System.out.println(message);

                // Read Input
                Scanner scanner = new Scanner(System.in);
                String bonjour = "What's your name ?";
                System.out.println(bonjour);
                String name = scanner.nextLine();
                System.out.println("Your name is " + name);


 */