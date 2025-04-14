import java.io.*;
class EvenException extends Exception
{
    EvenException(String message)
    {
        super(message);
    }
}
class OddException extends Exception
{
    OddException(String message)
    {
        super(message);
    }
}
public class Exceptions 
{
    static void checknum(int n) throws EvenException,OddException
    {
        if(n%2==0)
        {
            throw new EvenException("It is an even number!");
        }
        else
        {
            throw new OddException("It is an odd number");
        }
    }
    public static void main(String args[]) throws IOException
    {
        int num;
        try
        {
            System.out.print("Enter a number:");
            BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
            num=Integer.parseInt(b1.readLine());
            checknum(num);
        }
        catch(EvenException e)
        {
            System.out.println(e.getMessage());
        }
        catch(OddException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Exception handle complete");
        }
    }
}
