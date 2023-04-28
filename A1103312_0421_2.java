import java.util.*;
public class A1103312_0421_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入\"年月日\"or\"月日年\"（ex:YYYY/MM/DD or MM/DD/YYYY）：");
        String Date = input.next();
        if(Date.matches("[0-9]{4}[/]{1}[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}") || Date.matches("[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[0-9]{4}")){
            System.out.printf("您輸入的日期為\"%s\"\n",Date);
        }else{
            System.out.printf("您輸入的格式錯誤！\n");
        }
    }
}