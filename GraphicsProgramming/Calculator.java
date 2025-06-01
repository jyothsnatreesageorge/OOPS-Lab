import javax.swing.*;
import java.awt.event.*;
class Mouse extends MouseAdapter
{
    String operator;
    int num1,num2;
    JTextField text=new JTextField();
    Mouse(String operator,int num1,int num2,JTextField text)
    {
        this.operator=operator;
        this.text=text;
        this.num1=num1;
        this.num2=num2;
    }
    public void mouseClicked(MouseEvent e) {
        JButton b1 = (JButton) e.getSource();
        String n1 = b1.getLabel();

        if ((n1.equals("0")) || (n1.equals("1")) || (n1.equals("2")) || (n1.equals("3")) || (n1.equals("4"))
                || (n1.equals("5")) || (n1.equals("6")) || (n1.equals("7")) || (n1.equals("8")) || (n1.equals("9"))) {
            text.setText(text.getText() + n1);
        }
        else if(n1.equals("+")||n1.equals("-")||n1.equals("x")||n1.equals("/"))
        {
            num1=Integer.parseInt(text.getText());
            operator=n1;
            text.setText("");
        }
        else if(n1.equals("AC"))
        {
            num1=0;
            num2=0;
            operator="";
            text.setText("");
        }
        else
        {
            num2=Integer.parseInt(text.getText());
            int res=0;
            switch(operator)
            {
                case "+":
                        res=num1+num2;
                        text.setText("");
                        break;
                case "-":
                        res=num1-num2;
                        text.setText("");
                        break;
                case "x":
                        res=num1*num2;
                        text.setText("");
                        break;
                case "/":
                        if(num2!=0)
                        {
                        res=num1/num2;
                        text.setText("");
                        }
                        else{
                            text.setText("ERROR!");
                            return;
                        }
                        break;
            }
            text.setText(String.valueOf(res));
        }
   }
}
public class Calculator  
{
    JTextField text;   
    String operator = "";
    int n1,n2 ;
    public void CreateCalc() 
    {
        
        JFrame j1 = new JFrame("Calculator");
        j1.setBounds(100, 100, 400, 450);
        j1.setLayout(null);
        JButton num0 = new JButton("0");
        num0.setBounds(100, 350, 100, 60);
        j1.add(num0);
        JButton num1 = new JButton("1");
        num1.setBounds(0, 290, 100, 60);
        j1.add(num1);
        JButton num2 = new JButton("2");
        j1.add(num2);
        num2.setBounds(100, 290, 100, 60);
        JButton num3 = new JButton("3");
        j1.add(num3);
        num3.setBounds(200, 290, 100, 60);
        JButton num4 = new JButton("4");
        j1.add(num4);
        num4.setBounds(0, 230, 100, 60);
        JButton num5 = new JButton("5");
        j1.add(num5);
        num5.setBounds(100, 230, 100, 60);
        JButton num6 = new JButton("6");
        j1.add(num6);
        num6.setBounds(200, 230, 100, 60);
        JButton num7 = new JButton("7");
        j1.add(num7);
        num7.setBounds(0, 170, 100, 60);
        JButton num8 = new JButton("8");
        j1.add(num8);
        num8.setBounds(100, 170, 100, 60);
        JButton num9 = new JButton("9");
        j1.add(num9);
        num9.setBounds(200, 170, 100, 60);
        JButton num10 = new JButton("+");
        j1.add(num10);
        num10.setBounds(300, 350, 100, 60);
        JButton num11 = new JButton("-");
        j1.add(num11);
        num11.setBounds(300, 290, 100, 60);
        JButton num12 = new JButton("x");
        j1.add(num12);
        num12.setBounds(300, 230, 100, 60);
        JButton num13 = new JButton("/");
        j1.add(num13);
        num13.setBounds(300, 170, 100, 60);
        JButton num14 = new JButton("AC");
        j1.add(num14);
        num14.setBounds(0, 350, 100, 60);
        JButton num15 = new JButton("=");
        j1.add(num15);
        num15.setBounds(200, 350, 100, 60);
        text = new JTextField();
        text.setBounds(0, 100, 400, 70);
        j1.add(text);
        Mouse m=new Mouse(operator,n1,n2,text);
        num0.addMouseListener(m);
        num1.addMouseListener(m);
        num2.addMouseListener(m);
        num3.addMouseListener(m);
        num4.addMouseListener(m);
        num5.addMouseListener(m);
        num6.addMouseListener(m);
        num7.addMouseListener(m);
        num8.addMouseListener(m);
        num9.addMouseListener(m);
        num10.addMouseListener(m);
        num15.addMouseListener(m);
        num11.addMouseListener(m);
        num12.addMouseListener(m);
        num13.addMouseListener(m);
        num14.addMouseListener(m);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setVisible(true);
    }
     public static void main(String args[]) 
    {
        Calculator calc = new Calculator();
        calc.CreateCalc();
    }
}
