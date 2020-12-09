import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @author AmirHossein Sarahang
 */
public class Calculator {

    private JFrame cal;
    private JLabel label;
    private JPanel mainpanel;
    private JButton ziro = new JButton("0");
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton ziro2 = new JButton("0");
    private JButton one2 = new JButton("1");
    private JButton two2 = new JButton("2");
    private JButton three2 = new JButton("3");
    private JButton four2 = new JButton("4");
    private JButton five2 = new JButton("5");
    private JButton six2= new JButton("6");
    private JButton seven2 = new JButton("7");
    private JButton eight2 = new JButton("8");
    private JButton nine2 = new JButton("9");
    private JButton sin = new JButton("Sin");
    private JButton cos = new JButton("Cos");
    private JButton tg = new JButton("Tg");
    private JButton cot = new JButton("Cot");
    private JButton dot = new JButton(".");
    private JButton dot2 = new JButton(".");
    private JButton i1 = new JButton("x");
    private JButton i2 = new JButton("/");
    private JButton i3 = new JButton("+");
    private JButton i4 = new JButton("-");
    private JButton i5 = new JButton("%");
    private JButton i12 = new JButton("x");
    private JButton i22 = new JButton("/");
    private JButton i32 = new JButton("+");
    private JButton i42 = new JButton("-");
    private JButton i52= new JButton("%");
    public Calculator(){
        cal = new JFrame("AUT Calculator");
        cal.setSize(400 , 300);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setVisible(true);
        cal.setLayout(new BorderLayout());
        JTabbedPane tp=new JTabbedPane();
        mainpanel= new JPanel(new BorderLayout());
        JPanel panel= new JPanel(new GridLayout(5,4));
        panel.add(sin);
        panel.add(cos);
        panel.add(tg);
        panel.add(cot);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(i1);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(i2);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(i3);
        panel.add(dot);
        panel.add(ziro);
        panel.add(i5);
        panel.add(i4);


        JPanel panel2= new JPanel(new GridLayout(1,2));
        JButton equal = new JButton(" = ");
        JLabel label = new JLabel("click to awnser :      ");
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        panel2.add(label);
        panel2.add(equal);
        mainpanel.add(panel,BorderLayout.CENTER);
        mainpanel.add(panel2,BorderLayout.NORTH);
      //  cal.add(mainpanel,BorderLayout.CENTER);
      //  cal.setContentPane(mainpanel);
        tp.add("eng",mainpanel);
        cal.add(tp);

        //Simple calculator :
        
        JPanel Simplepanel = new JPanel(new BorderLayout());
        JPanel buttons = new JPanel(new GridLayout(4,4));
        buttons.add(seven2);
        buttons.add(eight2);
        buttons.add(nine2);
        buttons.add(i12);
        buttons.add(four2);
        buttons.add(five2);
        buttons.add(six2);
        buttons.add(i22);
        buttons.add(one2);
        buttons.add(two2);
        buttons.add(three2);
        buttons.add(i32);
        buttons.add(dot2);
        buttons.add(ziro2);
        buttons.add(i52);
        buttons.add(i42);
        JPanel panels2 = new JPanel(new GridLayout(1,2));
        JButton equal2 = new JButton(" = ");
        JLabel label2 = new JLabel("click to awnser :      ");
        label2.setBackground(Color.PINK);
        label2.setOpaque(true);
        panels2.add(label2);
        panels2.add(equal2);
        Simplepanel.add(buttons , BorderLayout.CENTER);
        Simplepanel.add(panels2,BorderLayout.NORTH);
        tp.add("Simple",Simplepanel);


    }
    public void showGUI() {
        cal.pack();
        cal.setVisible(true);
    }
}
