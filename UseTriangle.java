
package TrianglePackage;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.System.*;

/**
 * Created by Gabe on 9/12/2016.
 */
public class UseTriangle {
    public static void main(String[] args) {

        System.out.println("Enter Three Integers, Press L to exit");
        double red = 10;
        Triangle triangle1 = new Triangle(red, red, red);
        Scanner input = new Scanner(System.in);
        String L = "g";

        String inputLine = "";
        while (!(inputLine = input.nextLine()).equals("L")) {
            String[] inputs = inputLine.split("\\s");
            if (inputs.length != 3) {
                System.out.println("Please enter 3 numbers!");
                continue;
            }

            double[] vars = new double[3];
            for (int i = 0; i < 3; i++) {
                try {
                    vars[i] = Double.parseDouble(inputs[i]);
                    //System.out.println("num: "+vars[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                    continue;
                }
            }

            triangle1.setTriangle(vars[0], vars[1], vars[2]);
            String triType = "";
            //triangle1.getTriangle();

            if (triangle1.isTrueTriangle()) {
                System.out.println("This is a true triangle");
                if (triangle1.isEquilateral(triangle1) == true) {
                    triType = "Equilateral";
                } else if (triangle1.isIsosceles(triangle1) == true)
                    triType = "Isosceles";

                else if (triangle1.isScalene(triangle1) == true)
                    triType = "Scalene";

                else
                    triType = " not a valid triangle";


                System.out.println("your triangle is of the triangle type " + triType);
            }
            if (!triangle1.isTrueTriangle()) {
                System.out.println("This is not a valid triangle.");
            }
            System.out.println("Press any key to continue. Press L to quit.");

        }
        /*
        while (!(L.equals("L"))){
            double[] vars = new double[3];
            for (int i = 0; i < 3; i++) {
                try {
                    vars[i] = input.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    continue;
                }
            }

            triangle1.setTriangle(vars[0], vars[1], vars[2]);
            String triType = "";
            //triangle1.getTriangle();

            if (triangle1.trueTriangle(triangle1) == true) {
                //System.out.print("true");
            }

            if (triangle1.isEquilateral(triangle1) == true)
                triType = "Equilateral";

            else if (triangle1.isIsosceles(triangle1) == true)
                triType = "Isosceles";

            else if (triangle1.isScalene(triangle1) == true)
                triType = "Scalene";

            else
                triType = " not a valid triangle";
            System.out.println("your triangle is of the triangle type " + triType);
            System.out.println("Press any key to continue. Press L to quit.");

            L = input.nextLine();

        }*/
    }

}


       /* System.out.println("Enter Three Integers");
        vars = new double[3];
        for (int i = 0; i < 3; i++) {
            vars[i] = triangle.nextDouble();
            System.out.println(vars[i]);
        }
        triangle1.setTriangle(vars[0], vars[1], vars[2]);
*/


