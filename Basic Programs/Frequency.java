import java.util.*;
class Frequency 
{
    public static void main(String[] args) 
    {
        int i;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string-");
        String str=scn.nextLine();
        char[] s=str.toCharArray();
        System.out.println("Enter character:");
        char c=scn.next().charAt(0);
        for(i=0;i<s.length;i++)
        {
            if(str.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.println("The occurence of character is "+count);
        scn.close();
    }
}
