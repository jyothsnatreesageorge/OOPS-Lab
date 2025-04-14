import java.io.*;
class Employee
{
    String name;
    int age;
    long phno;
    String address;
    float salary;
    Employee(String name,int age,long phno,String address,float salary)
    {
        this.name=name;
        this.age=age;
        this.phno=phno;
        this.address=address;
        this.salary=salary;
    }
    public void printSalary()
    {
        System.out.println("Salary: "+salary);
    }
    public void printDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phno: "+phno);
        System.out.println("Address: "+address);
        printSalary();
    }
}
class Officer extends Employee
{
    String name;
    int age;
    long phno;
    String address;
    float salary;
    String specialisation;
    Officer(String name,int age,long phno,String address,float salary,String specialisation)
    {
        super(name,age,phno,address,salary);
        this.specialisation=specialisation;
    }
    public void print()
    {
        printDetails();
        System.out.println("Specialisation: "+specialisation);
    }
}
class Manager extends Employee
{
    String name;
    int age;
    long phno;
    String address;float salary;
    String department;
    Manager(String name,int age,long phno,String address,float salary,String department)
    {
        super(name,age,phno,address,salary);
        this.department=department;
    }
    public void print()
    {
        printDetails();
        System.out.println("Department: "+department);
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter officer name:");
            String oname=b.readLine();
            System.out.print("Enter officer age:");
            int oage=Integer.parseInt(b.readLine());
            System.out.print("Enter officer address:");
            String oadd=b.readLine();
            System.out.print("Enter officer salary:");
            float osal=Float.parseFloat(b.readLine());
            System.out.print("Enter officer specialisation:");
            String spcl=b.readLine();
            System.out.print("Enter officer phone number:");
            long ophno=Long.parseLong(b.readLine());
            Officer o1=new Officer(oname,oage,ophno,oadd,osal,spcl);
            System.out.println("Printing officer Details");
            o1.print();
            System.out.println();
            System.out.print("Enter manager name:");
            String mname=b.readLine();
            System.out.print("Enter manager age:");
            int mage=Integer.parseInt(b.readLine());
            System.out.print("Enter manager address:");
            String madd=b.readLine();
            System.out.print("Enter manager salary:");
            float msal=Float.parseFloat(b.readLine());
            System.out.print("Enter manager department:");
            String dept=b.readLine();
            System.out.print("Enter Manager phone number:");
            long mphno=Long.parseLong(b.readLine());
            Manager m1=new Manager(mname,mage,mphno,madd,msal,dept);
            System.out.println("Printing Manager details");
            m1.print();
            System.out.println();
        }
        catch(Exception e)
        {

        }
    }
}
