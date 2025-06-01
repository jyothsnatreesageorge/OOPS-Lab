import java.io.*;
public class QuickSort
{
   public static void main(String args[])
   {
      int n,i;
      String names[];
      try
      {
         BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the total number of names:");
         n=Integer.parseInt(b.readLine());
         names=new String[n];
         for(i=0;i<n;i++)
         {
             System.out.println("Enter the name:");
             names[i]=b.readLine();
         }
         Sort s=new Sort(names,0,n-1);
         s.sort(names,0,n-1);
         System.out.println("Sorted names:");
         for(i=0;i<n;i++)
         {
             System.out.println(names[i]);
         }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
   }
}
class Sort
{
   String a[],pivot;
   int low,high,i,j;
   Sort(String a[],int low,int high)
   {
       this.a=a;
       this.low=low;
       this.high=high;
   }
   public void sort(String a[],int low,int high)
   {
      if(low<high)
      {
          i=low;
          j=high+1;
          pivot=a[low];
          while(i<j)
          {
             while(i<high&&a[++i].compareTo(pivot)<0)
             {
                //i++;
             }
             while(j>low&&a[--j].compareTo(pivot)>0)
             {
                //j--;
             }
             if(i<j)
             {
                String temp=a[i];
                a[i]=a[j];
                a[j]=temp;
             }
          }
          String temp=a[j];
          a[j]=pivot;
          a[low]=temp;
          sort(a,low,j-1);
          sort(a,j+1,high);
      }
   }
}
