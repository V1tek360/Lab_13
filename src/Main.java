import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class SimpleFrame extends Frame{
    SimpleFrame(String s){
        super(s);
        setSize(500,300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new SimpleFrame("Калькулятор");
    }
}
class Panel extends JPanel{
    public Panel(){
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
    }
    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
    }
}

