package Patterns;

import java.util.Scanner;

public class solid_rectangle {

    public static void main(String[] args) {


/*

 soo we have print this pattern

           * * * * *
           * * * * *
           * * * * *
           * * * * *

*/
        Scanner input = new Scanner(System.in);

        System.out.println("enter the no of rows : ");
       int n= input.nextInt();

        System.out.println("enter the no of columns");
       int m = input.nextInt();

// outer loop
       for(int i =1; i<=n;i++){

//           inner loop

           for(int j =1; j<=m;j++){
               System.out.print("*");
           }
           System.out.println();
       }

















    }
}
