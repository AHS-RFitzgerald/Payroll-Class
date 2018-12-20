/**
 * Richard Fitzgerald
 * 12/19/18
 * CH7PC2 - Payroll Class
 * APCS
 */
import java.util.Scanner;
public class Payroll {
    // arrays for program
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] rate = new double[7];
    private double[] wages = new double[7];
    
    public Payroll(){
        
    }
    
    public void GetInfo(){
          Scanner keyboard = new Scanner(System.in);
          // gathers info for the hours and rate of pay
          for(int x = 0; x < 7; x++){
              System.out.println("How many hours did employee " + employeeId[x] + " work?");
              hours[x] = keyboard.nextInt();
              // validation for a positive number
              if(hours[x] < 0){
                  System.out.println("Please enter a positive number");
                  x -= 1;
              }
                  
          }
          for(int y = 0; y < 7; y++){
              System.out.println("What is the rate of " + employeeId[y] + "?");
              rate[y] = keyboard.nextDouble();
              // validation for a number greater than 6.00
              if(rate[y] < 6.00){
                  System.out.println("Pleate enter a rate greater than 6.00");
                  y -= 1;
              }
          }
    }
    // Calculates the wages for each employee
    public void CalcWage(){
        for(int z = 0; z < 7; z++){
            wages[z] = rate[z] * hours[z];
        }
    }
    // returns the value of the wages array to the main method
    public double[] getWages(){
        return wages;
    }
    //returns the Id's of the employes to the main method
    public int[] getEmployeeId(){
        return employeeId;
    }
}
