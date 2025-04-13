import java.util.Scanner;
class Employee
{
   char []name;
   int age;
   long phno;
   char[] address;
   double salary;
   Employee(char name[],int age,long phno,char address[],double salary)
   {
      this.name = new char[name.length];
      for(int i=0;i<name.length;i++)
      {
         this.name[i]=name[i];
      }
      this.age=age;
      this.phno=phno;
      this.address=new char[address.length];
      for(int i=0;i<address.length;i++)
      {
         this.address[i]=address[i];
      }
      this.salary=salary;
   }
   protected void printSalary()
   {
      System.out.println("Salary:"+this.salary);
   }
   protected void printName()
   {
      System.out.print("Name:");
      for(int i=0;i<name.length;i++)
      {
         System.out.print(name[i]);
      }
      System.out.println();
   }
   protected void printAddress()
   {
      System.out.print("Address:");
      for(int i=0;i<address.length;i++)
      {
         System.out.print(address[i]);
      }
   System.out.println();
   }
   public void printDetails()
   {
      printName();
      printAddress();
     System.out.println("Age:"+age);
      System.out.println("Phone number:"+phno);
      printSalary();
   }
}
class Officer extends Employee
{
   static char specialisation[];
   static void printSpecialisation()
   {
      System.out.print("Specialisation:");
      for(int i=0;i<specialisation.length;i++)
      {
         System.out.print(specialisation[i]);
      }
      System.out.println();
   }
   Officer(char name[],int age,long phno,char address[],double salary,char specialisation[])
   {
      super(name,age,phno,address,salary);
      this.specialisation=new char[specialisation.length];
      for(int i=0;i<specialisation.length;i++)
      {
         this.specialisation[i]=specialisation[i];
      }
      System.out.println("Printing Officer Details");
      super.printDetails();
      printSpecialisation();
   }
}
class Manager extends Employee
{
   static char department[];
   static void printDepartment()
   {
      System.out.print("Department:");
      for(int i=0;i<department.length;i++)
      {
         System.out.print(department[i]);
      }
      System.out.println();
   }
   Manager(char name[],int age,long phno,char address[],double salary,char department[])
   {
      super(name,age,phno,address,salary);
      this.department=new char[department.length];
      for(int i=0;i<department.length;i++)
      {
         this.department[i]=department[i];
      }
      System.out.println("Printing Manager details");
      super.printDetails();
      printDepartment();
   }
}
public class Inheritance
{
   public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Officer Details:");
      System.out.print("Enter name:");
      char oname[]=s.nextLine().toCharArray();
      System.out.print("Enter Address:");
      char oadd[]=s.nextLine().toCharArray();
      System.out.print("Enter Specialisation:");
      char spcl[]=s.nextLine().toCharArray();
      System.out.print("Enter age:");
      int oage=s.nextInt();
      s.nextLine();
      System.out.print("Enter Phno:");
      long ophno=s.nextLong();
      s.nextLine();
      System.out.print("Enter Salary:");
      double osalary=s.nextDouble();
      s.nextLine();
      System.out.println("Enter Manager Details:");
      System.out.print("Enter name:");
      char mname[]=s.nextLine().toCharArray();
      System.out.print("Enter Address:");
      char madd[]=s.nextLine().toCharArray();
      System.out.print("Enter Department:");
      char dept[]=s.nextLine().toCharArray();
      System.out.print("Enter age:");
      int mage=s.nextInt();
      s.nextLine();
      System.out.print("Enter Phno:");
      long mphno=s.nextLong();
      s.nextLine();
      System.out.print("Enter Salary:");
      double msalary=s.nextDouble();
      Officer o1=new Officer(oname,oage,ophno,oadd,osalary,spcl);
      Manager m1=new Manager(mname,mage,mphno,madd,msalary,dept);
      s.close();
   }
}