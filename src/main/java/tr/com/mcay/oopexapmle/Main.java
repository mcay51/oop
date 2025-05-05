package tr.com.mcay.oopexapmle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car("Sedan");
        boolean cond = true;
        Scanner sn = new Scanner(System.in);
        int input = 0;
// a basic oop usage with a car class
// car can accelerate / decelerate
// using functions only.
// it is not logical to directly modify
// the position or velocity of the car
// it is only dependent to pedals
        while (cond)
        {
            input = sn.nextInt();
            if (input == 8)
            {
                car1.accelerate();
                System.out.println(car1.getVelocity());
                System.out.println(car1.getPosition());
            }
            else if (input == 2)
            {
                car1.brake();
                System.out.println(car1.getVelocity());
                System.out.println(car1.getPosition());
            }
            else
                cond = false;
        }
    }

}
