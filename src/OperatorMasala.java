import java.util.Scanner;

public class OperatorMasala {

    public static void main(String[] args) {
        // Math.sqrt - ikkinchi darajali ildizdan chiqaradi
        // MAth.pow - birirnchi sonni ikkinchi darajaga kotaradi


        // Kirirtish chiqarish va o'zlashtirish operqtorlariga oid misollar
        //5m
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" !! kubni tomonini kiriting");
//        double a = scanner.nextDouble();
//        double v = Math.pow(a,3);
//        double s = 6 * Math.pow(a,2);
//
//        System.out.println("Hajmi " + v + " yuzasi " + s);
//      //  scanner.close();
//        //20m
//        System.out.println("x1");
//        double x1 = scanner.nextDouble();
//        System.out.println("y1");
//        double y1 = scanner.nextDouble();
//        System.out.println("x2");
//        double x2 = scanner.nextDouble();
//        System.out.println("y2");
//        double y2 = scanner.nextDouble();
//
//        double z1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
//
//        System.out.println(z1 + " ikkinchi yuza");

        // switch
//        Scanner sc = new Scanner(System.in);
//        System.out.println("szda uchburchakni qaysi tomoni borligini kiriting " +
//                "masalan 1 - tomoni ," +
//                "2 - ichki radiusi," +
//                "3 - tashqi radiusi , " +
//                "4 - yuzasi");
//        int a = sc.nextInt();
//        if(a==1){
//            System.out.println("tomonini kiriting ");
//            double a1 = sc.nextDouble();
//
//        }
//        double a2 = a1;
//
//        switch (a){
//            case 1:
//                double r1 = (a1 * Math.sqrt(3))/6;
//                double r2 = r1 * 2;
//                double s = (Math.pow(a,2) * Math.sqrt(3))/4;
//                System.out.println("Ichki radiusi " + r1);
//                System.out.println(" tashqi radiusi " + r2);
//                System.out.println("yuzasi " + s);break;
//            case 2:
//                double a = (6 * r1)/( Math.sqrt(3));
//                double r2 = r1 * 2;
//                double s = (Math.pow(a,2) * Math.sqrt(3))/4;
//                System.out.println("Ichki radiusi " + r1);
//                System.out.println(" tashqi radiusi " + r2);
//                System.out.println("yuzasi " + s);break;
//        }





  //
//        switch (a){
//            case 1:
//                System.out.println("yakshanba ");break;
//            case 2:
//                System.out.println("dushanba");break;
//            case 3:
//                System.out.println("seshanba");break;
//            default:
//                System.out.println("bunday kun yoq ");
//
//        }
//
//        switch (a){
//            case 1:
//                System.out.println(a1 + a2);break;
//            case 2:
//                System.out.println(a1 - a2);break;
//            case 3:
//                System.out.println(a1 * a2);break;
//            case 4:
//                System.out.println(a1 / a2);break;
//            default:
//                System.out.println("bunday amal yoq ");
//
//        }
        //case16
//        Scanner scane = new Scanner(System.in);
//        int age = scane.nextInt();
//        int onlik = age / 10;
//        int birlik = age % 10;
//
//        switch (onlik){
//            case 1:
//                switch (birlik){
//                    case 1:
//                        System.out.println("on bir");break;
//                    case 2:
//                        System.out.println("on ikk");break;
//                    case 3:
//                        System.out.println("on uch");break;
//                    case 4:
//                        System.out.println("on tort");break;
//                    case 5:
//                        System.out.println("on besh");break;
//                    case 6:
//                        System.out.println("on olti");break;
//                    case 7:
//                        System.out.println("on yetti");break;
//                    case 8:
//                        System.out.println("on sakkiz");break;
//                    case 9:
//                        System.out.println("on toqqiz");break;
//                    default:
//                        System.out.println("ERROR");
//
//                }break;
//            case 2:
//                switch (birlik){
//                    case 1:
//                        System.out.println("yigirma bir");break;
//                    case 2:
//                        System.out.println("y ikk");break;
//                    case 3:
//                        System.out.println("y uch");break;
//                    case 4:
//                        System.out.println("y tort");break;
//                    case 5:
//                        System.out.println("y besh");break;
//                    case 6:
//                        System.out.println("y olti");break;
//                    case 7:
//                        System.out.println("y yetti");break;
//                    case 8:
//                        System.out.println("y sakkiz");break;
//                    case 9:
//                        System.out.println("y toqqiz");break;
//                    default:
//                        System.out.println("ERROR");
//
//                }break;
//            default:
//                System.out.println("error");
//        }

        String[] units = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        System.out.println(units[6]);


    }
}
