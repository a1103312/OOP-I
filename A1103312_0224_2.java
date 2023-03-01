import java.util.*;

public class A1103312_0224_2{
     public static void main(String[] args){
            System.out.printf("Please enter the degrees(Celsius) : ");
            Scanner input = new Scanner(System.in);
            double x = input.nextDouble();
            System.out.printf("%.2f℃ = %.2f°F",x,(x*9)/5+32);
     }
}
