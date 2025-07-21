import javax.swing.*;
import java.awt.event.*;

public class printt{
public static void main(String... args){
    JFrame f = new JFrame("Print");
    JButton b = new JButton("click");

    b.setBound(100,100,100,40);
    f.add(b);

// Add action listener to button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
f.setSize(300, 300);                       // Set frame size
        f.setLayout(null);                         // Use no layout manager
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        f.setVisible(true);                        // Make the frame visible

//end
}
}