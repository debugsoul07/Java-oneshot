package functions;

import java.util.Scanner;

public class function_03 {


    public static int MultiplyValues(int a, int b) {


        int multiply = a * b;
        System.out.println("The Enter  no multiplication is : " + multiply);
        return multiply;

    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int a = input.nextInt();


        System.out.println("Enter the value of b : ");
        int b = input.nextInt();


        MultiplyValues(a, b);


    }
}

