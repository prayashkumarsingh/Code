import java.util.Scanner;

public class DuplicatesArray01
{
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n = sc.nextInt();
    int [] a = new int [n];
    int [] b = new int [n];
    boolean c = false;
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter the  "+i+"th   Index Of Array");
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(a[i] != -1)
      {
         for(int j= i+1;j<n;j++)
         {
            if(a[i]==a[j])
            {
               System.out.println("    The Duplicate Value is  " +a[i]);
               c=true;
               break;

            }
         }
      }
    }
    if(c==false)
    {
       System.out.println(" There is no Duplicate Value ");   
    }
    System.out.println();

   } 
}
