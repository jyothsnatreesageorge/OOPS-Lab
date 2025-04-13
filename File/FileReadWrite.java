import java.io.*;
public class FileReadWrite
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the name of the file to read from:");
         String file1=b1.readLine();
         FileReader f1=new FileReader(file1);
         System.out.print("Enter the name of the file to write into:");
         String file2=b1.readLine();
         FileWriter f2=new FileWriter(file2);
         int ch;
         while((ch=f1.read())!=-1)
         {
            System.out.print((char)ch);
            f2.write((char)ch);
         }
         System.out.println();
         System.out.println("Text written succesfully to "+file2);
         f1.close();
         f2.close();
      }
      catch(FileNotFoundException e)
      {
         System.out.println("The file is not found!");
      }
      catch(IOException e)
      {

      }
   }
}

