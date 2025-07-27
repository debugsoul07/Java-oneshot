package lecture1;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {

//         taking an input from the user

        Scanner input = new Scanner(System.in);

        System.out.println("please entered ur name buddy : ");
            String name = input.next();

        System.out.println("Entered name is : "+name);



//         so lets take an baisc example in which user have to enter 2 value a and b and we will print the sum of it


        System.out.println("enter the value of a  : ");
        int no1 = input.nextInt();

        System.out.println("enter the value of b : ");
        int no2 = input.nextInt();

        int add = no1+no2;

        System.out.println("the sum of this no's are : " +add);


    }
}
