package functions;

import java.util.Scanner;

public class functionn_01 {

    /*

    how we are writting a function

    returnType functionName (type arg 1 , type arg2 ){
//     operations

    }




if we are using void soo there is no return



     */

    public  static  void printMyName(String name){
        System.out.println("the enter name is : "+name);
        return;
    }



    public static void main(String[] args) {

//        Lets Take an Example of Function


        Scanner input = new Scanner(System.in);

        String name = input.next();

        printMyName(name);


// function main ke andar call hoga



    }
}
