import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int array[] = new int[n];


        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < n; i++) {
            if(array[i] < max){
                array[i] = max;
            }

        }
        System.out.println(max);
    }
}
