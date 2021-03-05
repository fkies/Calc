import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame implements ActionListener {
    private JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    private JButton add,sub,eq;
    private JTextField text1;
    private String number1="";
    private int number2=0;
    private int result=0;
    private boolean if_add=false;

    private void initGUI(){
        jb0=new JButton("0");
        jb0.addActionListener(this);

        jb1=new JButton("1");
        jb1.addActionListener(this);

        jb2=new JButton("2");
        jb2.addActionListener(this);

        jb3=new JButton("3");
        jb3.addActionListener(this);

        jb4=new JButton("4");
        jb4.addActionListener(this);

        jb5=new JButton("5");
        jb5.addActionListener(this);

        jb6=new JButton("6");
        jb6.addActionListener(this);

        jb7=new JButton("7");
        jb7.addActionListener(this);

        jb8=new JButton("8");
        jb8.addActionListener(this);

        jb9=new JButton("9");
        jb9.addActionListener(this);

        add=new JButton("+");
        add.addActionListener(this);

        sub=new JButton("-");
        sub.addActionListener(this);

        eq = new JButton("=");
        eq.addActionListener(this);

        text1 = new JTextField();
    }

    public Calc(){
        super("Simple calc");
        setSize(new Dimension(650,450));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel cp = (JPanel) getContentPane();
        cp.setLayout(new GridLayout(5,3,5,5));
            initGUI();
            cp.add(jb7);
        cp.add(jb8);
        cp.add(jb9);
        cp.add(jb4);
        cp.add(jb5);
        cp.add(jb6);
        cp.add(jb1);
        cp.add(jb2);
        cp.add(jb3);
        cp.add(jb0);
        cp.add(add);
        cp.add(sub);
        cp.add(eq);

        cp.add(text1);

    }

    public static void main(String[] args){
        Calc calculator = new Calc();
        calculator.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){ //akcja gdy e
        if(e.getSource()==jb0){   // e==jb1
            number1 = number1+"0";
            text1.setText(number1);
        }

        if(e.getSource()==jb1){   // e==jb1
            number1 = number1+"1";
            text1.setText(number1);
        }

        if(e.getSource()==jb2){   // e==jb1
            number1 = number1+"2";
            text1.setText(number1);
        }

        if(e.getSource()==jb3){   // e==jb1
            number1 = number1+"3";
            text1.setText(number1);
        }

        if(e.getSource()==jb4){   // e==jb1
            number1 = number1+"4";
            text1.setText(number1);
        }

        if(e.getSource()==jb5){   // e==jb1
            number1 = number1+"5";
            text1.setText(number1);
        }

        if(e.getSource()==jb6){   // e==jb1
            number1 = number1+"6";
            text1.setText(number1);
        }

        if(e.getSource()==jb7){   // e==jb1
            number1 = number1+"7";
            text1.setText(number1);
        }

        if(e.getSource()==jb8){   // e==jb1
            number1 = number1+"8";
            text1.setText(number1);
        }

        if(e.getSource()==jb9){   // e==jb1
            number1 = number1+"9";
            text1.setText(number1);
        }

        if(e.getSource()==add){   // e==jb1
            result=Integer.parseInt(number1);
            number1="";
            if_add=true;
        }

        if(e.getSource()==eq){   // e==jb1,
            if(if_add==true){
                result=result+Integer.parseInt(number1);
            }
            String equ=String.valueOf(result);
            text1.setText(equ);
        }


    }

}
