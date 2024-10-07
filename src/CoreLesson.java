import java.util.Scanner;

public class CoreLesson {
    public static void main(String[] args) {
//        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Massiv uzunligini kiriting: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("MAssiv elementlarini kiriting  ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//
//        }
//        int kattasi = 0;
//        int ikkinchikatta = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > kattasi) {
//                ikkinchikatta = kattasi;
//                kattasi = arr[i];
//            } else if (arr[i] > ikkinchikatta && arr[i] != kattasi) {
//                ikkinchikatta = arr[i];
//
//            }
//        }
//        if (ikkinchikatta == 0) {
//            System.out.println("ikkinchi  katta qiymat mavjud emas ");
//        }
//        System.out.println("ikkinchi katta qiymat " + ikkinchikatta);

        //2

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Massiv uzunligini kiriting: ");
        int n1 = scanner1.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("MAssiv elementlarini kiriting  ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner1.nextInt();

        }
        int sum = 0;

        for (int i = 0; i < n1; i++) {
            sum += arr1[i];
        }
        System.out.println("yigindisi " + sum);
    }
}
