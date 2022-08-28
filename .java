#import java.awt.*;
import java.awt.event.*;
	
class sample extends Frame implements ActionListener
    {
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4,t5,t6;
	Button b1,b2;
	Choice c1;
	Panel p1;
	List q1;
         sample()
             {
	setLayout(null);
	setTitle("MyJavaApplication");
	 setVisible(true);
	  setSize(1500,1500);
	 setBackground(Color.pink);

	 p1=new Panel(new GridLayout(6,6));

	 l1=new Label("UserName");
	 l2=new Label("Password");
	 l3=new Label("DoB");
	 l4=new Label("Contect no");
	 l5=new Label("email id");
	 l6=new Label("company");


	 t1=new TextField();
	 t2=new TextField();
	 t3=new TextField();
	 t4=new TextField();
	 t5=new TextField();
	 t6=new TextField();
	 t2.setEchoChar('*');
	

	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	p1.add(l3);
	p1.add(t3);
	p1.add(l4);
	p1.add(t4);
	p1.add(l5);
	p1.add(t5);
	p1.add(l6);
	p1.add(t6);

	 add(p1);

	 p1.setBounds(400,100,330,200);

	 b1=new Button("Sign in");
	 add(b1);
	 b2=new Button("Exit");
	 add(b2);

	 b1.addActionListener(this);
	 b2.addActionListener(this);

	 b1.setBounds(1000,370,60,40);	 
	 b2.setBounds(1000,450,60,40);

	 c1=new Choice();
	 c1.add("Java");
	c1.add("python");
	c1.add("Javascript");
	c1.add("es6");
	c1.add("html");
	c1.add("css");
	
	add(c1);
	  List q1 = new List(5);   
	c1.setBounds(200,340,120,90);

	  q1.add("apple");    
                  q1.add("mango");    
                  q1.add("graps");    
                  q1.add("orange");    
                  q1.add("pineapple");    
	
	add(q1);	

                  q1.setBounds(200, 200, 95, 75);   

 	  }
	public void actionPerformed(ActionEvent d)
	{
	   if(d.getActionCommand().equals("Sign in"))
		{
		  System.out.println(""+t1.getText());
		  System.out.println(""+t2.getText());
		  System.out.println(""+t3.getText());
		  System.out.println(""+t4.getText());
		  System.out.println(""+t5.getText());
		  System.out.println(""+t6.getText());
		}

	   if(d.getActionCommand().equals("Exit"))
		{
		 System.exit(0);
		}
               }
    }
class deopanl
    {
            public static void main(String args[])
                 {
                       new sample();
 	  }
    }
