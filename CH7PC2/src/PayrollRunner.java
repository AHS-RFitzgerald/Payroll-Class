/**
 * Richard Fitzgerald
 * CH7PC2 - Payroll Class
 * Programming III - AP
 * 12/20/18
 */
public class PayrollRunner {

   
    public static void main(String[] args) {
        // Constructor and variables for main method
        Payroll wages = new Payroll();
        int[] employeeId = new int[7];
        double[] wage = new double[7];
        // Calls information from the class and stores it in variables
        wages.GetInfo();
        wages.CalcWage();
        wage = wages.getWages();
        employeeId = wages.getEmployeeId();
        // Prints out the data gathered
        System.out.println("PAYROLL DATA");
        System.out.println("=============");
        
        for(int x = 0; x < 7; x++){
            System.out.println("Employee Id: " + employeeId[x]);
            System.out.println("Wages: " + wage[x]);
            System.out.println("");
        }
    }

}
