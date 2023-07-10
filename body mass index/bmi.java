import java.util.Scanner;


public class BedenKitleEndeksiHesaplama {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your weight: "); 
        int weight = scanner.nextInt();
         System.out.println("Please enter your height: ");
         double length = scanner.nextDouble();
         
         double Bmi = weight / (length * length);
         
          System.out.println("Your body mass index : " + Bmi);
          
    }
    
}