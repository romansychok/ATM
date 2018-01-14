package atm;

import java.util.Scanner;

public class ATM {

    int ballance = 100000;
    int passValidCounter = 0;


    public void showBallance(){
        System.out.println(ballance);
    }

    public void getCash(){
        System.out.println("How much money do you want to take?");
        int output = new Scanner(System.in).nextInt();
        if (ballance> output){
            ballance-=output;
        }
        else {
            System.out.println("Not Enough money to get ");
        }

        System.out.println("Ballance: ");
        showBallance();
    }

    public void putCash(){
        System.out.println("How much money you want to put?");
        int input = new Scanner(System.in).nextInt();
            ballance+=input;
        System.out.println("Ballance: ");
        showBallance();
    }

    public void endOperation(){
        System.out.println("Good bye");
    }


    public boolean pass(){
        System.out.println("Please enter password");
        int pin = 1111;
        if (pin == new Scanner(System.in).nextInt()){
            System.out.println("OK!!!");
            return true;
        }
        else {
            System.out.println("Error");
            return false;
        }
    }

    public void passValidCounter(){
        if (pass()){
            Main.menu();
        }
        else {
            if (passValidCounter < 2 ){
                passValidCounter++;
                passValidCounter();
            }
        }
    }

}
