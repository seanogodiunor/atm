import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*

        Account Number: 123456
        Password:       1140

*/


        int attemps = 0;


        double balance = 100000.05;
        double withdraw = 0;
        double deposit = 0;

        int kontoNumber = 123456; // Database stored Account Number
        int passWordd = 1140; // Datebase stored Password

        Scanner input = new Scanner(System.in);

// ______________________________________________________________________

        do {
            System.out.println("___________________________________");

            for (attemps = 3; attemps > 0; attemps = attemps--) {

                switch (attemps) {


                    case 3:
                        System.out.println("You have 3 Attempts");

                        System.out.println(" ");
                        System.out.println(" ");

                        System.out.println(attemps + " out of " + attemps + " attempts");
                        break;

                    case 2:
                        System.out.println("Wrong Password");
                        System.out.println(" ");


                        System.out.println(attemps + " out of 3 attempts");

                        break;

                    case 1:
                        System.out.println("Wrong Password");
                        System.out.println(" ");

                        System.out.println(attemps + " out of 3 attempts");
                        break;


                    case 0:
                        System.out.println("Goodbye!");

                        System.out.println(" ");
                        System.out.println("You have " + attemps + " Tries left");
                        break;


                }

                attemps--;


                System.out.print("Input konto number: ");
                int typedkonto = input.nextInt();

                System.out.print("Input password: ");
                int typedpass = input.nextInt();

                System.out.println(" ");


                System.out.println(" ");


                if (typedpass == passWordd && typedkonto == kontoNumber) {

                    System.out.println("___________________________________");

                    System.out.println("     WELCOME TO BANK OF AMERICA    ");

                    System.out.println("___________________________________");

                    System.out.println(" ");


                    while (true) {
                        System.out.println("Chose one of the following options: ");
                        System.out.println("____________________________________");


                        System.out.println("Chose 1: Withdraw");
                        System.out.println("Chose 2: Deposit");
                        System.out.println("Chose 3: Balance");
                        System.out.println("Chose 4: Exit");

                        System.out.print(":");

                        int eingabe = input.nextInt();


                        switch (eingabe) {

                            case 1:
                                System.out.println("Enter Amount to withdraw: ");

                                System.out.print(":");

                                withdraw = input.nextDouble();

                                if (balance >= withdraw) {
                                    balance = (int) balance - withdraw;
                                    System.out.println("You can now collect your money");
                                    System.out.println("Your current balance is now: " + balance + " Euro");

                                } else {
                                    System.out.println("Insufficent amount of money ");
                                }
                                System.out.println(" ");
                                break;

                            case 2:
                                System.out.println("Enter Amout to deposit: ");

                                System.out.print(":");

                                deposit = input.nextDouble();

                                balance = balance + deposit;
                                System.out.println("Money sursessfully Deposited");
                                System.out.println("Your new Credit is now: " + balance + " Euro");
                                System.out.println(" ");
                                break;

                            case 3:

                                if (balance < 0) {
                                    System.out.println("You are broke as fuck");

                                    System.out.println("Your balance is: " + balance + " Euro");


                                } else {
                                    System.out.println("Your balance is: " + balance + " Euro");
                                }
                                System.out.println(" ");
                                break;

                            case 4:
                                System.out.println("Goodbye and see you soon");
                                System.exit(0);


                        }

                    }

                }


            }


        } while (attemps < 0);

    }
}