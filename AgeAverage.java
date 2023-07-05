import java.util.Scanner;
public class AgeAverage_DagohoyMacaldoVillanueva {

    public static void main(String[] args) {
    	String[] names = new String[5]; // array to store student names
      double[] gwagrades = new double[5]; // array to store student GWA grades
      Scanner input = new Scanner(System.in);

      // Input student names and GWA grades
      for(int i = 0; i < 5; i++) {
         System.out.print("Enter student name: ");
         names[i] = input.nextLine();
         System.out.print("Enter student GWA grade: ");
         gwagrades[i] = input.nextDouble();
         input.nextLine(); // consume the remaining newline character
      }

      // Calculate the average GWA grade
      double sum = 0.0;
      for(int i = 0; i < 5; i++) {
         sum += gwagrades[i];
      }
      double average = sum / 5.0;

      // Print student names and their GWA grades
      System.out.println("");
      System.out.println("Student names and their GWA grades:");
      for(int i = 0; i < 5; i++) {
         System.out.println(names[i] + " - " + gwagrades[i]);
      }

      // Print the average GWA grade
      System.out.println("");
      System.out.println("Average GWA: " + average);
   }
}

