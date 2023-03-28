import java.util.*;

class animal{
    String name;
    double height;  
    int weight;
    int speed;
    
    void show(){
        System.out.printf("項目姓名:%s\n",name);
        System.out.printf("身高（公尺）:%.2f\n",height);
        System.out.printf("體重（公斤）:%d\n",weight);
        System.out.printf("速度（公尺/分鐘）:%d\n\n",speed);
    }

    double distance(int x,double y){
        return x*y*speed;
    }

    int distance(int x){
        return x*speed;
    }

}

public class A1103312_0324_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        animal a = new animal();
        a.name = "雪寶";
        a.height = 1.1;
        a.weight = 52;
        a.speed = 100;
        animal b = new animal();
        b.name = "驢子";
        b.height = 1.5;
        b.weight = 99;
        b.speed = 200;
        animal c = new animal();
        c.name = "安那";
        c.height = 1.7;
        c.weight = 48;
        c.speed = 120;
        animal d = new animal();
        d.name = "愛沙";
        d.height = 1.7;
        d.weight = 50;
        d.speed = 120;
        a.show();
        b.show();
        c.show();
        d.show();

        System.out.printf("請輸入\"雪寶\"的跑步「時間」(integer)：");
        int x = input.nextInt();
        System.out.printf("請問是否欲輸入「加速度」(decimal)？(y/n)：");
        String choice1 = input.next();
        if(choice1.equals("y")){
            System.out.printf("請輸入\"雪寶\"的跑步「加速度」(decimal)：");
            double y = input.nextDouble();
            System.out.printf("以下為\"雪寶\"奔跑的距離(公尺)：%.2f\n\n",a.distance(x,y));
        }else{
            System.out.printf("以下為\"雪寶\"奔跑的距離(公尺)：%d\n\n",a.distance(x));
        }

        System.out.printf("請輸入\"驢子\"的跑步「時間」(integer)：");
        int m = input.nextInt();
        System.out.printf("請問是否欲輸入「加速度」(decimal)？(y/n)：");
        String choice2 = input.next();
        if(choice2.equals("y")){
            System.out.printf("請輸入\"驢子\"的跑步「加速度」(decimal)：");
            double n = input.nextDouble();
            System.out.printf("以下為\"驢子\"奔跑的距離(公尺)：%.2f\n\n",a.distance(m,n));
        }else{
            System.out.printf("以下為\"驢子\"奔跑的距離(公尺)：%d\n\n",a.distance(m));
        }

        System.out.printf("請輸入\"安那\"的跑步「時間」(integer)：");
        int i = input.nextInt();
        System.out.printf("請問是否欲輸入「加速度」(decimal)？(y/n)：");
        String choice3 = input.next();
        if(choice3.equals("y")){
            System.out.printf("請輸入\"安那\"的跑步「加速度」(decimal)：");
            double j = input.nextDouble();
            System.out.printf("以下為\"安那\"奔跑的距離(公尺)：%.2f\n\n",a.distance(i,j));
        }else{
            System.out.printf("以下為\"安那\"奔跑的距離(公尺)：%d\n\n",a.distance(i));
        }

        System.out.printf("請輸入\"愛沙\"的跑步「時間」(integer)：");
        int h = input.nextInt();
        System.out.printf("請問是否欲輸入「加速度」(decimal)？(y/n)：");
        String choice4 = input.next();
        if(choice4.equals("y")){
            System.out.printf("請輸入\"愛沙\"的跑步「加速度」(decimal)：");
            double z = input.nextDouble();
            System.out.printf("以下為\"愛沙\"奔跑的距離(公尺)：%.2f\n\n",a.distance(h,z));
        }else{
            System.out.printf("以下為\"愛沙\"奔跑的距離(公尺)：%d\n\n",a.distance(h));
        }
    }
}