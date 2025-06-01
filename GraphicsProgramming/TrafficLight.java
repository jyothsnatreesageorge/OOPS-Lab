import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TrafficLight
{
   public static void main(String args[])
   {
      JFrame f=new JFrame("Traffic Light");
      f.setLayout(null);
      f.setBounds(0,0,1000,1000);
      JButton red=new JButton();
      red.setBounds(50,50,150,150);
      f.add(red);
      JButton yellow=new JButton();
      yellow.setBounds(50,250,150,150);
      f.add(yellow);
      JButton green=new JButton();
      green.setBounds(50,450,150,150);
      f.add(green);
      Click m=new Click(red,yellow,green);
      JRadioButton redb=new JRadioButton("RED");
      redb.setBounds(250,50,100,200);
      f.add(redb);
      JRadioButton yelb=new JRadioButton("YELLOW");
      yelb.setBounds(250,250,100,200);
      f.add(yelb);
      JRadioButton greb=new JRadioButton("GREEN");
      greb.setBounds(250,450,100,200);
      f.add(greb);
      redb.addMouseListener(m);
      yelb.addMouseListener(m);
      greb.addMouseListener(m);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
class Click extends MouseAdapter
{
   JButton b1;
   JButton b2;
   JButton b3;
   JRadioButton b4;
   String name;
   Click(JButton b1,JButton b2,JButton b3)
   {
      this.b1=b1;
      this.b2=b2;
      this.b3=b3;
   }
   public void mouseClicked(MouseEvent e){
   b4=(JRadioButton)e.getSource();
   name=b4.getLabel();
   if(name.equals("RED"))
   {
      b1.setBackground(Color.RED);
      b2.setBackground(Color.WHITE);
      b3.setBackground(Color.WHITE);
   }
   else if(name.equals("YELLOW"))
   {
      b1.setBackground(Color.WHITE);
      b2.setBackground(Color.YELLOW);
      b3.setBackground(Color.WHITE);
   }
   else if(name.equals("GREEN"))
   {
      b1.setBackground(Color.WHITE);
      b2.setBackground(Color.WHITE);
      b3.setBackground(Color.GREEN);
   }
}
}
