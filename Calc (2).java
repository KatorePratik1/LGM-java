
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.lang.Math.*;

class Calc extends JFrame implements ActionListener
{
        String str_number="";
        String buff[];
        String entries[];
        int operation=0;
        char operator='\0';
        double num1,num2;
        double result;

                JButton b1 = new JButton("1");
                JButton b2 = new JButton("2");
                JButton b3  = new JButton("3");
                JButton b4 = new JButton("4");
                JButton b5 = new JButton("5");
                JButton b6 = new JButton("6");
                JButton b7 = new JButton("7");
                JButton b8 = new JButton("8");
                JButton b9 = new JButton("9");
                JButton b0 = new JButton("0");
                JButton add = new JButton("+");
                JButton sub = new JButton("-");
                JButton mult = new JButton("*");
                JButton div = new JButton("/");
                JButton equ = new JButton("=");
                JButton clr = new JButton("CLR");
                JButton dec = new JButton(".");
                JButton sin = new JButton("sin");
                JButton cos = new JButton("cos");
                JButton tan = new JButton("tan");
                JButton ln = new JButton("ln");
                JButton log = new JButton("log");
                JButton pi = new JButton("pi");
                JButton cbt = new JButton("cbrt");
                JButton sqt = new JButton("sqrt");
                JButton xsq = new JButton("x^2");
                JButton yt = new JButton("History");
                JButton mc = new JButton("MC");
                JButton mr = new JButton("MR");
                JButton mp = new JButton("M+");
                
                JFrame f = new JFrame("JAVA CALCULATOR");
                    JList list = new JList(entries);
                        JScrollPane scrollpane;

                JPanel NumberPanel = new JPanel();
                JPanel ResultPanel = new JPanel();
                JPanel MemoryPanel = new JPanel();

                JTextField text = new JTextField(15);
                JTextField memt = new JTextField(15);

        public Calc()
        {
            f.setLayout(new BorderLayout());
            NumberPanel.setLayout(new GridLayout(7,5));
            ResultPanel.setLayout(new FlowLayout());
            f.setVisible(true);
            f.setSize(400,400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            NumberPanel.add(b1);
            b1.addActionListener(this);
            NumberPanel.add(b2);
            b2.addActionListener(this);
            NumberPanel.add(b2);
            b3.addActionListener(this);
            NumberPanel.add(b3);
            b4.addActionListener(this);
            NumberPanel.add(b4);
            b5.addActionListener(this);
            NumberPanel.add(b5);
            b6.addActionListener(this);
            NumberPanel.add(b6);
            b7.addActionListener(this);
            NumberPanel.add(b7);
            b8.addActionListener(this);
            NumberPanel.add(b8);
            b9.addActionListener(this);
            NumberPanel.add(b9);
            b0.addActionListener(this);
            NumberPanel.add(b0);
            add.addActionListener(this);
            NumberPanel.add(add);
            sub.addActionListener(this);
            NumberPanel.add(sub);
            mult.addActionListener(this);
            NumberPanel.add(mult);
            div.addActionListener(this);
            NumberPanel.add(div);
            dec.addActionListener(this);
            NumberPanel.add(dec);
            clr.addActionListener(this);
            NumberPanel.add(clr);
            sin.addActionListener(this);
            NumberPanel.add(sin);
            cos.addActionListener(this);
            NumberPanel.add(cos);
            tan.addActionListener(this);
            NumberPanel.add(tan);
            log.addActionListener(this);
            NumberPanel.add(log);
            ln.addActionListener(this);
            NumberPanel.add(ln);
            pi.addActionListener(this);
            NumberPanel.add(pi);
            cbt.addActionListener(this);
            NumberPanel.add(cbt);
            sqt.addActionListener(this);
            NumberPanel.add(sqt);
            xsq.addActionListener(this);
            NumberPanel.add(xsq);

            yt.addActionListener(this);
            NumberPanel.add(yt);
            mc.addActionListener(this);
            NumberPanel.add(mc);
            mr.addActionListener(this);
            NumberPanel.add(mr);
            mp.addActionListener(this);
            NumberPanel.add(mp);
            text.setFocusable(true);
            text.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e){
                    char c = e.getKeyChar();
                    if(c==KeyEvent.VK_ENTER)
                    {
                        equalto();
                    }
                    else if(c==KeyEvent.VK_BACK_SPACE)
                    {
                        str_number="";
                        text.setText("");
                    }
                    else
                    {
                        str_number += c;
                    }
                }
            });

            ResultPanel.add(text);
            ResultPanel.add(equ);
            MemoryPanel.add(memt);
            equ.addActionListener(this);

            f.add(NumberPanel,BorderLayout.CENTER);
            f.add(ResultPanel,BorderLayout.NORTH);
            f.add(MemoryPanel,BorderLayout.SOUTH);

        }
            
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b1)
            {
                text.setText("1");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b2)
            {
                text.setText("2");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b3)
            {
                text.setText("3");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b4)
            {
                text.setText("4");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b5)
            {
                text.setText("5");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b6)
            {
                text.setText("6");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b7)
            {
                text.setText("7");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b8)
            {
                text.setText("8");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==b9)
            {
                text.setText("9");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==yt)
            {
                try{
                    JTextArea ta = new JTextArea(20,60);
                    ta.read(new FileReader("calchistory.txt") ,null);
                    ta.setEditable(false);
                    JOptionPane.showMessageDialog(yt, new JScrollPane(ta));
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }

            if(e.getSource()==clr)
            {
                text.setText("");
                operation=0;
                num1=0;
                num2=0;
                result=0;
                operation='\0';
                str_number="";
            }
            if(e.getSource()==dec)
            {
                text.setText(".");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==add)
            {
                text.setText("+");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==sub)
            {
                text.setText("-");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==mult)
            {
                text.setText("*");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==div)
            {
                text.setText("/");
                str_number += text.getText();
                text.setText(str_number);
            }
            if(e.getSource()==log)
            {
                    num1 = Double.parseDouble(str_number);
                    result = Math.log10(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("log("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }

                if(e.getSource() == ln)
                {
                    num1 = Double.parseDouble(str_number);
                    result = Math.log(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == cos)
                {
                    num1 = Double.parseDouble(str_number);
                    result = Math.cos(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == sin)
                {
                    num1 = Double.parseDouble(str_number);
                    result = Math.sin(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == tan)
                {
                    num1 = Double.parseDouble(str_number);
                    result = Math.tan(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == pi)
                {
                    text.setText(str_number+Double.toString(Math.PI));
                    str_number = text.getText();
                }
                if(e.getSource() == sqt)
                {
                    num1 = Double.parseDouble(str_number);
                    result = Math.sqrt(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == cbt)
                {
                    num1 = Double.parseDouble(str_number);
                    result = Math.cbrt(num1);
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == xsq)
                {
                    num1 = Double.parseDouble(str_number);
                    result = num1*num1;
                    try{
                String filename="calchistory.txt";
                FileWriter fw = new FileWriter(filename,true);
                System.out.println(text.getText());
                fw.write("\r\n");
                fw.write("ln("+str_number+")="+ Double.toString(result));
                fw.write("\r\n");
                fw.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                }
                        text.setText(Double.toString(result));
                        str_number = text.getText();
                }
                if(e.getSource() == mp)
                {
                    memt.setText(str_number);
                }
                if(e.getSource() == mr)
                {
                    str_number += memt.getText();
                    text.setText(str_number);
                }
                if(e.getSource() == mc)
                {
                    memt.setText("");
                }
                if(e.getSource() == equ)
                {
                    equalto();
                }

        }

        public void equalto()
        {
            if(str_number !="")
            {
                        text.setText(str_number);
                        System.out.println(str_number);
                        operation = 0;

                        javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
                        ScriptEngine engine = mgr.getEngineByName("JavaScript");

                        try
                        {
                            result = Double.parseDouble(engine.eval(str_number).toString());
                        }
                        catch(ScriptException ex)
                        {
                            Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
                        }
                try
                {
                    String filename = "calchistory.txt";
                    FileWriter fw = new FileWriter(filename,true);
                    System.out.println(text.getText());
                    fw.write("\r\n");
                    fw.write(str_number+")="+ Double.toString(result));
                    fw.write("\r\n");
                    fw.close();
                    }
                    catch (IOException ex)
                    {
                        Logger.getLogger(Calc.class.getName()).log(Level.SEVERE,null,ex);
                    }
                            text.setText(Double.toString(result));
                            str_number = text.getText();
                    }
        }
        public static void main(String arga[])
        {
            Calc c = new Calc();
        }
}
         
            
            
            
            


