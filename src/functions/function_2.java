package functions;

import java.util.Scanner;

public class function_2 {

    public  static  int addSum(int a, int b){


         int sum = a+b;
        System.out.println("The Enter  no sum is : "+sum);
        return  sum;

    }





    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int a = input.nextInt();



        System.out.println("Enter the value of b : ");
        int b = input.nextInt();



        addSum(a,b);


    }
}
