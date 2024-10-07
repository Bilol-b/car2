public class ForLoop {

    public static void main(String[] args) {
//        //1
//        int k = 12;
//        int n = 4;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(k);
//
//        }
        //2
//        int  a = 4;
//        int  b = 11;
//        int sum = 0;
//        for (int i = a; i <= b ; i++) {
//            sum++;
//            System.out.println(i);
//        }
//        System.out.println(sum + " ta");
//
//
        //
//        int narx = 15;
//
//
//        for (double i = 0.1; i <= 1.0; i+=0.1) {
//
//            System.out.println(i + " somda");
//
//        }
        int n = 2;
        int k = 4;
        for (int i = 0; i <= k; i++) {
            for (int j = k; j >=0; j--) {
                System.out.println(Math.pow(i,j));

            }


        }
    }
}
