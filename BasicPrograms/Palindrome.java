import java.io.*;
class Word
{
    public void check()
    {
        try
        {
            String word;
            int len,i;
            BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the string:");
            word=b1.readLine();
            len=word.length();
            char word1[]=new char[len];
            word1=word.toCharArray();
            for(i=0;i<len;i++)
            {
                if(word1[i]!=word1[len-i-1])
                {
                    System.out.println("It is not a palindrome!");
                    break;
                }
            }
            if(i==len)
            {
                System.out.println("It is a palindrome");
            }
        }
        catch(Exception e)
        {

        }
    }
}
public class Palindrome
{
    public static void main(String args[])
    {
        Word w=new Word();
        w.check();
    }
}
