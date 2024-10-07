import java.util.Scanner;

public class SwitvhLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" doiraning qaysi elementi ekanini  kiriting");
        int a = sc.nextInt();

//        double d = 2 * r;
//        double l = 2 * 3.14 * r;
//        double s = 3.14 * Math.pow(r,2);
        switch (a){
            case 1:
                System.out.println("radiusini olchamini kiriting");
                double r = sc.nextDouble();
                double d = 2 * r;
                double l = 2 * 3.14 * r;
                double s = 3.14 * Math.pow(r,2);
                System.out.println(" diametri " + d  + "," +
                        " uzunligi " + l + " yuzasi " + s);
        }
    }
}
