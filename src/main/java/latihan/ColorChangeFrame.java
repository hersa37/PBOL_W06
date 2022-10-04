package latihan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame {

    private JButton yellowButton, redButton;

    public ColorChangeFrame() {

        setSize(300, 200);
        setLayout(new GridLayout(3,3));
        yellowButton = new JButton("Yellow");
        yellowButton.addActionListener(new YellowButtonListener());
        add(yellowButton);

        redButton = new JButton("Red");
        redButton.addActionListener(new RedButtonListener());
        add(redButton);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorChangeFrame();
    }
}

class YellowButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton button = (JButton) actionEvent.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(button);
        frame.getContentPane().setBackground(Color.yellow);
    }
}

class RedButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton button = (JButton) actionEvent.getSource();
        JFrame frame = (JFrame) SwingUtilities.getRoot(button);
        frame.getContentPane().setBackground(Color.red);
    }
}
