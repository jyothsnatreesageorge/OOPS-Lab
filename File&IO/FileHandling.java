import java.io.*;
public class FileHandling
{
    public static void main(String args[])
    {
        try
        {
            String file="sample.txt";
            FileWriter f1=new FileWriter(file);
            System.out.print("Enter the contents to be written into the file:");
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            String input=b.readLine();
            f1.write(input);
            f1.close();
            FileReader f2=new FileReader(file);
            int ch;
            System.out.println("Printing the contents of the file!");
            while((ch=f2.read())!=-1)
            {
                System.out.print((char)ch);
            }
            f2.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
