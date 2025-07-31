package loops;

import java.util.Scanner;

public class example {


//     print the sum of the first n natural numbers
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no between 1 to 1000 ");

        int n = input.nextInt();
        int sum = 0;
        for(int i =0 ; i<=n;i++){
            sum = sum+n;

        }
        System.out.println(sum);
    }
}
