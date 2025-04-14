import java.util.StringTokenizer;
import java.io.*;
public class StringTok 
{
    public static void main(String args[])
    {
        try
        {
            String file="sample2.txt";
            System.out.print("Enter the line of integers to be written into file:");
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            String num=b.readLine();
            StringTokenizer st=new StringTokenizer(num," ");
            FileWriter f=new FileWriter(file);
            f.write(num);
            f.close();
            int sum=0;
            while(st.hasMoreTokens())
            {
                sum=sum+Integer.parseInt(st.nextToken());
            }
            System.out.println("The sum of the above integers is "+sum);
            FileWriter f2=new FileWriter(file);
            f2.write(String.valueOf(sum));
            f2.close();
            /*int ch;
            FileReader f3=new FileReader(file);
            while((ch=f3.readLine())!=-1)
            {
                System.out.println((char)ch);
            }*/
        }
        catch(Exception e)
        {
            
        }
    }
}
