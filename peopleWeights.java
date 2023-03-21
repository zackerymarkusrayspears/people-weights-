package totalWeight;

import java.util.Scanner;

public class peopleWeights {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int WEIGHTS = 5;
        double [] userWeights = new double [WEIGHTS];
        double totalWeight = 0;
        double averageWeight = 0;
        double maxWeight;
        int i;
        
        System.out.println("Enter 5 weights");
        //This for loops get the user entered weights and stores in the array
        for (i = 0; i < userWeights.length; ++i){
           userWeights[i] = scnr.nextDouble();
        }
        
        //This for loop prints out each 
        for (i = 0; i < userWeights.length; ++i) {
           System.out.println("Enter weight " + (i + 1) + ": " + userWeights[i]);  
        }
        //Print a space between enter weight and next for loop
        System.out.println("");
        
        //Prints out the user enter in the same line so it not printed multiply times 
        System.out.print("You entered: ");
        
        //Print out each user input in a single line
        for (i = 0; i < userWeights.length; ++i){
           //Adds a space between each user import
           if(i != 0){
              System.out.print(" ");
           }
           System.out.print(userWeights[i]);
        }
        //Makes totalWeight print on a new line
        System.out.println("");
          
        //Loops over each of user weight entered and returns the total weight  
        for (i = 0; i < userWeights.length; ++i) {
           totalWeight = totalWeight + userWeights[i];
        } 
        //Print out the total weight to the user
        System.out.println("Total weight: " + totalWeight);
        
        /*Get the average weight of each of user input by 
        taking the total weight and dividing by the amount 
        of elements in the array
        */
        averageWeight = totalWeight / WEIGHTS;
        //Prints out the Average weight
        System.out.println("Average weight " + averageWeight);
        
        //Initialize the maxWeight variable to userWeights at index 0 
        maxWeight = userWeights[0];
        //This is a for loop to get the maximum value you from the user entered weight
        for (i = 0; i < userWeights.length; ++i) {
           if (userWeights[i] > maxWeight) {
              maxWeight = userWeights[i];
           }
        }
        //Prints out the max weight 
        System.out.println("Max weight: " + maxWeight);
        return;
    }
}
