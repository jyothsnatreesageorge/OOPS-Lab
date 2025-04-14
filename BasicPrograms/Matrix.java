import java.io.*;
public class Matrix 
{
    public static void main(String args[])
    {
        try
        {
            int row1,col1,row2,col2;
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number of row of matrix 1:");
            row1=Integer.parseInt(b.readLine());
            System.out.print("Enter the number of col of matrix 1:");
            col1=Integer.parseInt(b.readLine());
            mat m1=new mat(row1,col1);
            m1.insert();
            m1.display();
            System.out.print("Enter the number of row of matrix 2:");
            row2=Integer.parseInt(b.readLine());
            System.out.print("Enter the number of col of matrix 2:");
            col2=Integer.parseInt(b.readLine());
            mat m2=new mat(row2,col2);
            m2.insert();
            m2.display();
            mat m3=new mat(m1.row,m2.col);
            if(m1.col!=m2.row||m2.col!=m1.row)
            {
                System.out.print("Matrices cannot be multiplied!");
            }
            else
            {
                m3=m1.multiply(m2);
                System.out.print("The resultant matrix is\n");
                m3.display();
            }
        }
        catch(Exception e)
        {

        }
    }
}
class mat
{
    int val[][];
    int row;
    int col;
    mat(int row,int col)
    {
        this.val=new int[row][col];
        this.row=row;
        this.col=col;
    }
    public void insert()
    {
        try
        {
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print("Enter element:");
                    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                    val[i][j]=Integer.parseInt(b.readLine());
                }
            }
        }
        catch(Exception e)
        {

        }
    }
    public void display()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(val[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public mat multiply(mat m)
    {
        mat c=new mat(this.row,m.col);
        for(int i=0;i<this.row;i++)
        {
            for(int j=0;j<m.col;j++)
            {
                c.val[i][j]=0;
                for(int k=0;k<this.col;k++)
                {
                    c.val[i][j]+=this.val[i][k]*m.val[k][j];
                }
            }
        }
        return c;
    }
}
