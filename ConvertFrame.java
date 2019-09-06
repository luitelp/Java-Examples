import java.awt.FlowLayout;

import java.awt.TextField;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.WindowConstants;

 

public class ConvertFrame {

 

JFrame f; 

Float input1,input2;//declaring inputs for fahrenheit and inches

public void convertFrame(){  

    f = new JFrame();

    //Creating title for the program

    f.setTitle("Converter");

    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //creating convert buttons
    JButton b1=new JButton("Convert"); 

    JButton b2=new JButton("Convert");

 

    //creating labels

    JLabel label1 = new JLabel("");

    label1.setText("Enter Fahrenheit Temperature: ");

    JLabel label2 = new JLabel("");

    label2.setText("Enter Inch Length: ");

    JLabel label3 = new JLabel("");

    label3.setText("Temperature in Celcius is: ");

    JLabel label4 = new JLabel("");

    label4.setText("Length in Centimeter is: ");

 

    //creating input fields to enter inches and fahrenheit values

    TextField t1=new TextField(5);

    TextField t2=new TextField(5);

    //adding labels to the Jframe

    f.add(label1);

    f.add(t1);

    f.add(b1);

    f.add(label3);

 

    f.add(label2);

    f.add(t2);

    f.add(b2);

    f.add(label4);

    f.setLayout(new FlowLayout(FlowLayout.CENTER));//making alignment to center

    f.setSize(550,180);

    f.setVisible(true);//set the visibility of jframe

    t1.addActionListener(new ActionListener(){

    public void actionPerformed(ActionEvent e){

        input1=Float.parseFloat(t1.getText());

        float celcius1=((input1-32)*5)/9;

        label3.setText("Temperature in Celcius is: "+(int)celcius1);

    } 

    });

 

    //when Enter key is pressed at text field 2

    t2.addActionListener(new ActionListener(){ 

    public void actionPerformed(ActionEvent e){

        input2=Float.parseFloat(t2.getText());

        float cms=input2*(float)2.54;

        label4.setText("Length in Centimeter is: "+(int)cms);

    } 

    });

 

    //when user clicks the convert button

    b1.addActionListener(new ActionListener(){

    public void actionPerformed(ActionEvent e){

        input1=Float.parseFloat(t1.getText());

        int celcius1=(int) (((input1-32)*5)/9);

       

        label3.setText("Temperature in Celcius is: "+celcius1);

    } 

    });

 

    //when user clicks the convert button

    b2.addActionListener(new ActionListener(){ 

    public void actionPerformed(ActionEvent e){

        input2=Float.parseFloat(t2.getText());

        float cms=input2*(float)2.54;

        int intCMS = (int)cms;

        label4.setText("Length in Centimeter is: "+ intCMS);

    } 

    });

 

   

} 

}
