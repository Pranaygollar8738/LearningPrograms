package logicalPrograms;

import java.util.Scanner;

public class Even_Odd_By_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Number");
        int number = sc.nextInt();

        if (number%2 ==0)
        {
            System.out.println(number + " Number is Even");
        }
        else
        {
            System.out.println(number + " Number is Odd");
        }
    }
}