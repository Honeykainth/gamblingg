/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// Name: Honey
// Student ID: 201906725
// Date Submitted:19 March 2021
// Class IN2203  Section Number G1
// Name of work: Assignment 1: The Gambling Game

package javaapplication7;
import java.util.*;
/**
 *
 * @author Guest01
 */
public class JavaApplication7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Casino c = new Casino();
        c.OrganiseNewGame();
       
    }
}
class Casino{
    Player p1 = new Player();
    Game g1= new Game();
    String userAnswer;
    Scanner sc = new Scanner(System.in);
    int x;
    public void OrganiseNewGame(){
        
         for(x=1;x<=5;x++){
         System.out.println("Welcome to out Casino: Would you like to play a game? (y/n)");
         userAnswer=sc.nextLine();
         
            if(userAnswer.equals("y")){
                System.out.println("Let's get started");
                g1.PlayGame();
            }
           
            else if (userAnswer.equals("n")){
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else{
            p1.endgame();
             
            }
            
        }
    }
}
class Game{
    Random rand = new Random();    
    private int ComputerGuess = 0;
    
    public void PlayGame(){
        System.out.println("      Guess a number from 1 to 100");
        System.out.println("      And I will guess a Game");
        System.out.println("(If your guess is within 20 of my guess: you win! Else, I win!)");
        ComputerGuess = ComputerGuess();
        
        int user;
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        user=sc.nextInt();
        System.out.println("User Guess is : " + user);
             if  ((ComputerGuess-10) <= user && (ComputerGuess+10) >= user){
                 System.out.println(" Congratulation, You win !");}
            else{System.out.println("Alas!!You Lose !");}
      //System.out.println("Computer Guess is : " + ComputerGuess);
     }
    public int ComputerGuess(){
        int ProgramGuess = rand.nextInt(100);
        return ProgramGuess;
    }
}
class Player{
    public void endgame(){
        System.out.println("Invalid Entry!!");
      
    }
}
