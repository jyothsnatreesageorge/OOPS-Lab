import java.io.*;
public class Frequency
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the string:");
            String str=b.readLine();
            char string[]=new char[str.length()];
            string=str.toCharArray();
            System.out.print("Enter the character whose occurence is to be found:");
            char ch=(b.readLine()).charAt(0);
            Freq f=new Freq(string,ch);
            int occ=f.count();
            System.out.print("The occurence of character "+ch+" is "+occ+" times ");
        }
        catch(Exception e)
        {

        }
    }    
}
class Freq
{
    char a[],c;
    Freq(char a[],char c)
    {
        this.a=a;
        this.c=c;
    }
    public int count()
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==c)
            {
                count++;
            }
        }
        return count;
    }
}
