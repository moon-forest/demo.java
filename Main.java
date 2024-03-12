//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import methods.*;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello and welcome!");

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = input.nextInt();

        System.out.print("The calculation is: "+ calculations.addition(num1, num2));

    }




}