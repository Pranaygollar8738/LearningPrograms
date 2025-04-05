package logicalPrograms;

import java.util.Scanner;

public class Number_Positive_OR_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();




        if(  number > 0)
        {
            System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
