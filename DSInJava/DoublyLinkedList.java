import java.io.*;
class Node
{
   int data;
   Node rlink;
   Node llink;
   Node head=null;
   Node tail=null;
   public void insert(int item)
   {
      Node newnode=new Node();
      newnode.data=item;
      if(head==null&&tail==null)
      {
         head=tail=newnode;
         head.llink=null;
         tail.rlink=null;
      }
      else
      {
         tail.rlink=newnode;
         newnode.rlink=null;
         newnode.llink=tail;
         tail=newnode;
      }
      display();
   }
   public void display()
   {
      if(head==null)
      {
         System.out.println("Linked List is empty");
         return;
      }
      else
      {
         Node ptr=head;
         while(ptr!=null)
         {
            System.out.println(ptr.data);
            ptr=ptr.rlink;
         }
      }
   }
   public void delete(int item)
   {
      Node ptr=head;
      while(ptr!=null&&ptr.data!=item)
      {
         ptr=ptr.rlink;
      }
      if(ptr==null)
      {
         System.out.println("The specified data is not present in the linked list");
         return;
      }
      if(ptr.data==item)
      {
         if(ptr==head)
         {
            head=ptr.rlink;
         }
         else if(ptr==tail)
         {
            tail=ptr.llink;
         }
         else if(ptr==head&&ptr==tail)
         {
            head=null;
            tail=null;
         }
         else
         {
            ptr.llink.rlink=ptr.rlink;
            ptr.rlink.llink=ptr.llink;
         }
      }
      display();
   }
}
public class DoublyLinkedList
{
   public static void main(String args[]) throws IOException
   {
      try
      {
         Node n1=new Node();
         int choice;
         boolean track=true;
         BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Displaying the menu:");
         System.out.print("1.Insert Element\n2.Delete Element\n3.Display\n4.Exit\n");
         while(track)
         {
            System.out.print("Enter you choice:");
            choice=Integer.parseInt(b1.readLine());
            switch(choice)
            {
               case 1:
               {
                  System.out.print("Enter the data to be inserted:");
                  int data=Integer.parseInt(b1.readLine());
                  n1.insert(data);
                  break;
               }
               case 2:
               {
                  if(n1.head==null)
                  {
                     System.out.println("Linked List is empty!");
                  }
                  else
                  {
                     System.out.print("Enter the data to be deleted:");
                     int data=Integer.parseInt(b1.readLine());
                     n1.delete(data);
                   }
                  break;
               }
               case 3:
               {
                  n1.display();
                  break;
               }
               case 4:
               {
                  track=false;
                  break;
               }
               default:
               {
                  System.out.println("Invalid choice!");
                  break;
               }
            }
         }
      }
      catch(Exception e)
      {

      }
   }
}
