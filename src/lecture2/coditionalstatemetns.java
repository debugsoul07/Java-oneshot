package lecture2;

import java.util.Scanner;

public class coditionalstatemetns {

/*   ✅ Java Conditional Statements (Short Summary)
      Java uses conditional statements to make decisions in code:

1. if Statement

if (condition) {
    // code runs if condition is true
    }






2. if-else Statement

if (condition) {
    // if true
} else {
    // if false
}









3. else if Ladder

if (condition1) {
    // if condition1 is true
} else if (condition2) {
    // if condition2 is true
} else {
    // if none are true
}





4. Nested if

if (condition1) {
    if (condition2) {
        // both conditions are true
    }
}






5. switch Statement
Used for multiple conditions (better than many if-else for fixed values)

switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code


}*/


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        System.out.println("enter your age ");
        int age = input.nextInt();

//         checking the age
        if(age>=18){
            System.out.println("u are greater than 18");
        }

        else{
            System.out.println("u are less than 18 ");
        }



//       checking the entered no is odd or even
        System.out.println("enter any no to check whether it is odd or even ");
        int no =input.nextInt();

        if(no%2==0){
            System.out.println("entered no is even ");
        }
        else{
            System.out.println("enter no is odd ");
        }




//         now we will check whether the no is equal ,greater than, less than

        System.out.println("enter one no : ");
        int a1 = input.nextInt();

        System.out.println("enter second no ");
        int a2 = input.nextInt();

        if(a1==a2){
            System.out.println("enter no is equal ");
        }

        else if (a1>a2) {

            System.out.println("entered no is " +a1 +" greater than "+a2);

        } else if (a1<a2) {
            System.out.println("enter no is  " +a1+  " smaller than"+a2);

        }
        else{
            System.out.println("you have not entered a no soo entered a no ");
        }

    }

}
