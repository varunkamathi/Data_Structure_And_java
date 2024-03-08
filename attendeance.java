import java.util.Scanner;
import java.util.*;
import javax.management.ConstructorParameters;

public class attendeance {
     attendeance(int no_period , int attened_period){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of period =");
        no_period = sc.nextInt();
        System.out.print("Enter attened period =");
        attened_period = sc.nextInt();
        double per_percentage = 100 / no_period;
         double total_percentage = per_percentage * attened_period;
        System.out.println("complete 75% attendaance in week");
        System.out.println(total_percentage);
        
    }
    attendeance(double no_period , double attened_period){
        double  monthly_period = no_period * 4;
        double  per_percentage = 100 / monthly_period;
         double  total_percentage = per_percentage * attened_period;
        System.out.println("complete 75% attendaance in monthly");
        System.out.println(total_percentage);

    }
    
    public static void main(String[] args) {
       
      attendeance s1 = new attendeance(0, 0) ; 
      attendeance s2 = new attendeance(0, 0);
      System.out.println(s1);
      System.out.println(s2);
    }
}
