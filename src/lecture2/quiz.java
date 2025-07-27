package lecture2;

import java.util.Scanner;

public class quiz {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Surprise Greeting program");
        System.out.println("Press 1 \n Press 2 \n Press 3");

        int no = input.nextInt();

        if(no==1){
            System.out.println("Hello");
        } else if (no==2) {

            System.out.println("Namaste");

        } else if (no==3) {
            System.out.println("Bonjour");

        }

        else{
            System.out.println("please press only one of the option which is 1,2,3");
        }

    }
}
