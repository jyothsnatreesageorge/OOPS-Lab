import java.io.*;
import java.util.*;
public class BinarySearch
{
   public static void main(String args[]) throws IOException
   {
      try
      {
         int n,i,j,low,high,mid,key;
         String num;
         BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the number of terms for the array:");
         n=Integer.parseInt(b1.readLine());
         int a[]=new int[n];
         System.out.println("Enter the integers to store to the array:");
         for(i=0;i<n;i++)
         {
            a[i]=Integer.parseInt(b1.readLine());
         }
         for(i=0;i<n-1;i++)
         {
            for(j=0;j<n-i-1;j++)
            {
               if(a[j]>a[j+1])
               {
                  int temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
               }
            }
         }
         for(i=0;i<n;i++)
         {
            System.out.print(a[i]+"\t");
         }
         System.out.println();
         System.out.print("Enter the element to be searched:");
         key=Integer.parseInt(b1.readLine());
         b1.close();
         low=0;
         high=n-1;
         while(low<=high)
         {
            mid=(low+high)/2;
            if(a[mid]==key)
            {
               System.out.println("Key is found at position "+mid);
               break;
            }
            else if(a[mid]<key)
            {
               low=mid+1;
            }
            else
            {
               high=mid-1;
            }
         }
         if(low>high)
         {
            System.out.println("Key is not found in the array!");
         }
      }
      catch(Exception e)
      {

      }
   }
}
