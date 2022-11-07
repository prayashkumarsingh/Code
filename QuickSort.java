import java.util.Scanner;
public class QuickSort 
{
    static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static int partition(int[] a, int low, int high)
    {
        int pivot = a[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
  
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return (i + 1);
    }
  
    static void quickSort(int[] a, int low, int high)
    {
        if (low < high) {
  
 
            int pi = partition(a, low, high);
 
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
  
    static void printArray(int[] a, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
  
        System.out.println();
    }
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of Array");
       int n = sc.nextInt();
       int [] a = new int [n];
       for(int i=0;i<n;i++)
       {
         System.out.println("Enter the  "+i+"th   Index Of Array");
         a[i]=sc.nextInt();
       }
  
        quickSort(a, 0, n - 1);
        System.out.println("Sorted array is: ");
        printArray(a,n);
    }
}
