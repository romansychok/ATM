package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.passValidCounter();


    }
    public static void menu(){
        System.out.println("Enter 1 to see ballance");
        System.out.println("Enter 2 to take cash");
        System.out.println("Enter 3 to put cash");
        System.out.println("Enter 4 to end operations");
        ATM atm = new ATM();
        while (true){
            switch (new Scanner(System.in).nextInt()){

                case 1:
                    atm.showBallance();
                    break;
                case 2:
                    atm.getCash();
                    break;
                case 3:
                    atm.putCash();
                    break;
                case 4:
                    atm.endOperation();
                    return;
                default:
                    break;

            }
        }
    }
}
