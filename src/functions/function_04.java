package functions;

import java.util.Scanner;

public class function_04 {

    public  static  void Factorial(int n){

        int factoriL = 1;
       for(int i =n; i>=1;i--){
      factoriL = factoriL*i;
       }

        System.out.println(factoriL);

    }



//     we will find the factorial of any no

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Factorial(n);

    }
}
