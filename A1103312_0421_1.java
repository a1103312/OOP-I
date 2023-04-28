import java.util.*;
public class A1103312_0421_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入電子信箱（ex:a1234567@mail.nuk.edu.tw）：");
        String Email = input.next();
        if(Email.matches("[a-z]{1}[0-9a-z]*[@]{1}[0-9a-z.]+[.]{1}[0-9a-z]+")){
            System.out.printf("輸入格式正確！\n");
        }else{
            System.out.printf("輸入格式錯誤！\n");
        }
    }
}