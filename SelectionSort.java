import java.util.Scanner;
class SelectionSort 
{
   void sort(int a[])
   {
    for(int i=0; i<a.length-1;i++)
    {
        int min=i;
        for (int j = i+1; j < a.length; j++)
                if (a[j] < a[min])
                    min = j;
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp;           
    }
   }
   void printArray(int a[])
   {
       for (int i=0; i<a.length; ++i)
           System.out.print(a[i]+" ");
       System.out.println();
   }
   public static void main(String args[])
   {
       SelectionSort ob = new SelectionSort();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of Array");
       int n = sc.nextInt();
       int [] a = new int [n];
       for(int i=0;i<n;i++)
       {
         System.out.println("Enter the  "+i+"th   Index Of Array");
         a[i]=sc.nextInt();
       }
       ob.sort(a);
       System.out.println("Sorted array is ");
       ob.printArray(a);
   }
}
