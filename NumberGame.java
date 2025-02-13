import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();


        int score = 0;
        int roundsplayed = 0;
        System.out.println("Welcome To Number Guessing Game !! Lets Startttt!!!!!");
        while(true){
            int guessnumber = rand.nextInt(101);
            int attemptsleft = 10;
            int currentscore= 0;
           
            roundsplayed++;
            System.out.println(" \n #Round "+roundsplayed+" you have only "+attemptsleft+"attempts");
            
            while(attemptsleft > 0){
                System.out.println("->Enter your guess betweeen 1 to 100 :");
                int guess = s.nextInt();
                s.nextLine();
                attemptsleft--;
                if(guess <1 || guess>100){
                    System.out.println("!!Please enter the number between 1 to 100");
                    continue;
                }
              
                if(guess < guessnumber){
                    System.out.println("its lower !! than the answer -> Try again");
                }
                else if(guess > guessnumber){
                    System.out.println("its higher !! than the answer -> Try again");
                }
               else{
                currentscore = attemptsleft +2 ;
                System.out.println("Congrats !! you guessed the correct answer");
                break;
               }
               System.out.println("Attempts left"+" : "+ attemptsleft);
                
            }
            if(attemptsleft == 0){
                System.out.println("out of attempts"+"-"+ " and the answer is:- "+guessnumber);
            }
            score += currentscore;
            System.out.println("Congrats your score for this round : "+currentscore);
            System.out.println(" your total score is : "+score);


            System.out.println("\n Do you want to play again ");
            String playagain = s.nextLine().trim().toLowerCase();
            
            if(!playagain.equals("yes")){
                System.out.println(" \n Thanks for playing | and your final score is : "+ score);
                break;
            }

        }
        s.close();


    }
    
}
