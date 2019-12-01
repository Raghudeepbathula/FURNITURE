package sample;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int count;
        String message;

        System.out.print("Enter a message :");
        message =input.nextLine();
        System.out.print("Enter the count :");
        count =input.nextInt();

       // for (int i=0;i<count;i++){
         //   System.out.println(message);
        //}

        while (count>0){
            System.out.println(message);
            count--;
            ;

        }
    }
}
