import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = enter.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the  " + i + "th   Index Of Array");
            a[i] = enter.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    int Var = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = Var;
                }
            }
        }

        for (int el : a) {
            System.out.print(el + " ");
        }
    }

}
