import java.util.*;
public class A1103312_0317_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入n:");
        int x = input.nextInt();
        System.out.printf("請輸入m:");
        int y = input.nextInt();
        int [][] a = new int[x][y];
        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < y ; j++){
                a[i][j]=(i+1)*(j+1);
            }
        }
        for(int[] num1 : a){
            for(int num2 : num1){
                System.out.printf("%s*%s=%s ",num1[0],num2/num1[0],num2);
            }
            System.out.printf("%n");
        }
    }
}