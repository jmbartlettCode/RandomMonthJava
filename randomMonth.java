/*
 * Josh Bartlett
 * Purpose: To generate a random number between 1 and 12 and display month name
 * April 27, 2019
 * Bellevue University
 * randomMonth.java
 */

public class randomMonth {
    public static void main (String[] args){
        
        // declare variable random, generate random number between 1 and 12
        int random = (int)(Math.random() * (13 - 1) + 1);
        
        // if chain uses random number generated and displays month name
        if (random == 1){
            System.out.println("January");
        }
        else if(random == 2){
            System.out.println("Febuary");
        }
        else if(random == 3){
            System.out.println("March");
        }
        else if(random == 4){
            System.out.println("April");
        }
        else if(random == 5){
            System.out.println("May");
        }
        else if(random == 6){
            System.out.println("June");
        }
        else if(random == 7){
            System.out.println("July");
        }
        else if(random == 8){
            System.out.println("August");
        }
        else if(random == 9){
            System.out.println("September");
        }
        else if(random == 10){
            System.out.println("October");
        }
        else if(random == 11){
            System.out.println("November");
        }
        else{
            System.out.println("December");
        }
    }
}
