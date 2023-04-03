import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;

    animal(String name,double height,int weight,int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show(){
        System.out.printf("項目姓名：%s\n",name);
        System.out.printf("身高（公尺）：%.2f\n",height);
        System.out.printf("體重（公斤）：%d\n",weight);
        System.out.printf("速度（公尺/分鐘）：%d\n",speed);
    }

    double distance(int x,double y){
        if(y == 0){
            return x*speed;
        }else{
            return x*y*speed;
        }
    }

    public static void showinfo(){
        System.out.printf("歡迎進入冰雪奇緣系統\n\n");
    }
}

class human extends animal{
    String gender;

    human(String name,double height,int weight,int speed,String gender){
        super(name, height, weight, speed);
        this.gender = gender;
    }

    void show(){
        super.show();
        System.out.printf("性別：%s\n",gender);
    }
}

class snow extends human{
    String iceSkill;

    snow(String name,double height,int weight,int speed,String gender,String iceSkill){
        super(name, height, weight, speed, gender);
        this.iceSkill = iceSkill;
    }

    void show(){
        super.show();
        System.out.printf("冰凍技能：%s\n",iceSkill);
    }

    double distance(int x,double y){
        if(y == 0){
            return x*speed*2;
        }else{
            return x*y*speed*2;
        }
    }
}

public class A1103312_0331{
    public static void main(String[] args){
        animal.showinfo();
        animal Olaf = new animal("雪寶",1.1,52,100);
        animal Sven = new animal("驢子",1.5,99,200);
        human Kristoff = new human("阿克",1.9,80,150,"男");
        human Hans = new human("漢斯",1.8,78,130,"男");
        human Anna = new human("安那",1.7,48,120,"女");
        snow Elsa = new snow("愛沙",1.7,50,120,"女","Yes");
        Olaf.show();
        Sven.show();
        Kristoff.show();
        Hans.show();
        Anna.show();
        Elsa.show();
        Scanner input = new Scanner(System.in);

        System.out.printf("請輸入\"雪寶\"的跑步「時間（整數）」：");
        int x = input.nextInt();
        System.out.printf("請輸入\"雪寶\"跑步時的「加速度（小數）」（※ 輸入為\"0\"則默認為不輸入）：");
        double y = input.nextDouble();
        System.out.printf("以下為\"雪寶\"的奔跑距離：%.2f（公尺）\n",Olaf.distance(x,y));

        System.out.printf("請輸入\"驢子\"的跑步「時間（整數）」：");
        x = input.nextInt();
        System.out.printf("請輸入\"驢子\"跑步時的「加速度（小數）」（※ 輸入為\"0\"則默認為不輸入）：");
        y = input.nextDouble();
        System.out.printf("以下為\"驢子\"的奔跑距離：%.2f（公尺）\n",Sven.distance(x,y));

        System.out.printf("請輸入\"阿克\"的跑步「時間（整數）」：");
        x = input.nextInt();
        System.out.printf("請輸入\"阿克\"跑步時的「加速度（小數）」（※ 輸入為\"0\"則默認為不輸入）：");
        y = input.nextDouble();
        System.out.printf("以下為\"阿克\"的奔跑距離：%.2f（公尺）\n",Kristoff.distance(x,y));

        System.out.printf("請輸入\"漢斯\"的跑步「時間（整數）」：");
        x = input.nextInt();
        System.out.printf("請輸入\"漢斯\"跑步時的「加速度（小數）」（※ 輸入為\"0\"則默認為不輸入）：");
        y = input.nextDouble();
        System.out.printf("以下為\"漢斯\"的奔跑距離：%.2f（公尺）\n",Hans.distance(x,y));

        System.out.printf("請輸入\"安那\"的跑步「時間（整數）」：");
        x = input.nextInt();
        System.out.printf("請輸入\"安那\"跑步時的「加速度（小數）」（※ 輸入為\"0\"則默認為不輸入）：");
        y = input.nextDouble();
        System.out.printf("以下為\"安那\"的奔跑距離：%.2f（公尺）\n",Anna.distance(x,y));

        System.out.printf("請輸入\"愛沙\"的跑步「時間（整數）」：");
        x = input.nextInt();
        System.out.printf("請輸入\"愛沙\"跑步時的「加速度（小數）」（※ 輸入為\"0\"則默認為不輸入）：");
        y = input.nextDouble();
        System.out.printf("以下為\"愛沙\"的奔跑距離：%.2f（公尺）\n",Elsa.distance(x,y));
    }
}