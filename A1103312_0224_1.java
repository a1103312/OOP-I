import java.util.*;

public class A1103312_0224_1{
     public static void main(String[] args){
            System.out.printf("Please enter an integer : ");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            if(x==0){
               System.out.printf(" \"0\" 雖為整數,卻非奇數也非偶數");
            }else if(x%2==0){
               System.out.printf("您輸入的值\"%d\"為偶數",x);
            }else{
               System.out.printf("您輸入的值\"%d\"為奇數",x);
            }
     }
}
