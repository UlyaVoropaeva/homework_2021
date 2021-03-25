package lesson_8;


import javax.swing.*;
import java.awt.*;

public class ApplicationFrame extends JFrame {
    public ApplicationFrame() {
        setTitle("Application Frame v1.0");
        setBounds(50, 50, 300, 300);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        JPanel top = createTop();
        add(top, BorderLayout.NORTH);

        Component component = top.getComponent(0);
        add(createBottom((JTextField) component), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createBottom(JTextField in) {
        JPanel bottom = new JPanel();

        bottom.setLayout(new GridLayout(4, 4));

        ButtonListener buttonListener = new ButtonListener(in);
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            bottom.add(btn);
        }

        JButton multi = new JButton("*");
        multi.addActionListener(buttonListener);
        bottom.add(multi);

        JButton del = new JButton("/");
        del.addActionListener(buttonListener);
        bottom.add(del);

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        bottom.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        bottom.add(plus);
        JButton sqrt = new JButton("sqrt");
        sqrt.addActionListener(buttonListener);
        bottom.add(sqrt);

        JButton brace1 = new JButton("(");
        brace1.addActionListener(buttonListener);
        bottom.add(brace1);

        JButton brace2 = new JButton(")");
        brace2.addActionListener(buttonListener);
        bottom.add(brace2);

        JButton pt = new JButton(".");
        pt.addActionListener(buttonListener);
        bottom.add(pt);


        JButton clear = new JButton("C");
        clear.addActionListener(buttonListener);
        bottom.add(clear);

        JButton calc = new JButton("=");
        calc.addActionListener(buttonListener);
        bottom.add(calc);

        return bottom;
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        JTextField in = new JTextField();
        in.setEditable(false);

        top.add(in, BorderLayout.NORTH);

        return top;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("File"));
        menu.add(new JMenuItem("Power Safe Mode"));

        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());

        return menuBar;
    }
}
