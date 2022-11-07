import java.util.*;

public class Subset06 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array a");
        int n = sc.nextInt();
        int [] a = new int[n];
        Arrays.sort(a);
        System.out.println("Enter size of Array b");
        int m = sc.nextInt();
        int [] b = new int[m];
        Arrays.sort(b);
        int count=0;

        for (int i = 0; i < n; i++) 
        {
           System.out.println("Enter the  " + i + "th   Index Of Array a");
           a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) 
        {
           System.out.println("Enter the  " + i + "th   Index Of Array b");
           b[i] = sc.nextInt();
        } 
      
      for(int i =0; i<a.length;i++)
      {
         for(int j =0; j<b.length;j++)
         {
            if(a[i]==b[j])
            {
               count++;
            }
         }

      }
      if(count==b.length)
      {
         System.out.println("Array b is a subset of Array a  ");
      }
      else
      {
         System.out.println("Array b is not a subset of Array a  ");
      }
   } 
}
