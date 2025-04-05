package logicalPrograms;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        int Balance = 10000;


Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withdrawal Amount");
        int W_a = sc.nextInt();

        int N_Balance = Balance - W_a;

if ( W_a>0 && W_a%100==0 && W_a<=Balance)
   {
    System.out.println("New Updated Balance " + N_Balance);
    }

   else
    {
        System.out.println("ERROR : Please Enter Valid Amount");
    }


    }
}
