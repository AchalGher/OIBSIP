
//Number Guessing Game Using Java
import java.util.*;

class task1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Getting random number using random function from math library..
        int mynumber = (int)(Math.random()*100); 
        
        int guess ;
        int attempt=0; 
        int repeat=1;

        do{
            System.out.print("Guess the number : ");
            //Taking input of number
            guess = sc.nextInt();

            if(guess == mynumber){
                System.out.println("Congrats!..You guess the right number.\n");
                System.out.print("You have guess the number in ");
                System.out.print(attempt);
                System.out.println(" attempts..");

                attempt = 0;
                System.out.print("Do you want to play again(1/0) : ");
                
                repeat = sc.nextInt();
                mynumber = (int)(Math.random()*100);

                System.out.println();
            }

            else if(guess > mynumber)
                System.out.println("Your number is too large.\n");

            else
                System.out.println("Your number is too small.\n");

            attempt++;

        }while(repeat != 0);

        System.out.println("THANKS FOR PLAYING");
        sc.close();
    }
}
