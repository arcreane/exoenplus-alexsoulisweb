package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int randomNumber;
        Random  rand = new Random();
        randomNumber = rand.nextInt(10)+1;

        while(true){
            System.out.print("User Input:");

            int userInput = sc.nextInt();


            if(userInput==randomNumber){
                System.out.println("Congratulation");
                //break;
            }else if(userInput>randomNumber){
                System.out.println("Guess Lower");
            }else{
                System.out.println("Guess Higher");
            }
        }
    }
}
