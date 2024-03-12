//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number:");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number:");
        int num2 = input.nextInt();

        calculations(num1, num2);

        System.out.print("The 2nd calculation is: "+calc2(num1, num2));

    }

    public static int calc2(int no1, int no2){
        return no1+no2;
    }

    public static void calculations(int num1, int num2) {
        int calc = num1 + num2;
        System.out.println("The calculation is: " + calc);
    }

}