abstract class Shape
{
   protected int sidesnum;
   protected double area;
   abstract protected void numberOfSides();
   abstract protected double area();
   protected void finalize()
   {
      System.out.println("Finalise method of class Shape");
   }
}
final class Rectangle extends Shape
{
   //protected double area();
   double length,breadth;
   Rectangle(int side)
   {
      super();
      this.sidesnum=side;
   }
   protected void numberOfSides()
   {
      System.out.println("Rectangle has "+this.sidesnum+" sides");
   }
   Rectangle(double l,double b)
   {
      this.length=l;
      this.breadth=b;
   }
   protected double area()
   {
      double area=this.length*this.breadth;
      return area;
   }
   protected void finalize()
   {
      System.out.println("Finalise method of class Rectangle");
   }
}
final class Triangle extends Shape
{
   //protected double area();
   double side1,side2,side3;
   Triangle(int side)
   {
      super();
      this.sidesnum=side;
   }
   protected void numberOfSides()
   {
      System.out.println("Triangle has "+this.sidesnum+" sides");
   }
   Triangle(double a,double b,double c)
   {
      this.side1=a;
      this.side2=b;
      this.side3=c;
   }
   protected double area()
   {
      double s=(this.side1+this.side2+this.side3)/2;
      double area=Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
      return area;
   }
   protected void finalize()
   {
      System.out.println("Finalise method of class Triangle");
   }
}
final class Hexagon extends Shape
{
   //protected double area();
   double side;
   Hexagon(int side)
   {
      super();
      this.sidesnum=side;
   }
   protected void numberOfSides()
   {
      System.out.println("Hexagon has "+this.sidesnum+" sides");
   }
   Hexagon(double s)
   {
      this.side=s;
   }
   protected double area()
   {
      double area=(3*Math.sqrt(3)*Math.pow(this.side,2))/2;
      return area;
   }
   protected void finalize()
   {
      System.out.println("Finalise method of class Hexagon");
   }
}
public class Abstraction
{
   public static void main(String args[])
   {
      Shape r1=new Rectangle(4);
      r1.numberOfSides();
      Shape r2=new Rectangle(2.0,3.0);
      //double area1=r2.area();
      System.out.println("The area of the rectangle is "+r2.area()+"\n");
      r1.finalize();
      Shape t1=new Triangle(3);
      t1.numberOfSides();
      Shape t2=new Triangle(6,9,4);
      double area2=t2.area();
      System.out.println("The area of the triangle is "+area2+"\n");
      t2.finalize();
      Shape h1=new Hexagon(6);
      h1.numberOfSides();
      Shape h2=new Hexagon(3.0);
      double area3=h2.area();
      System.out.println("The area of the hexagon is "+area3+"\n");
      h1.finalize();
   }
}
