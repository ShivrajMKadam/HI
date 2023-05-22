import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   // Using Swing's components and containers
public class n14 extends JFrame {

    // A Swing application extends from javax.swing.JFrame

        private JTextField tfDisplay;
        private int result = 0;          // the result so far
        private String numberInStr = ""; // the number entered as String
        private char previousOpr = ' ';  // the previous operator
        private char currentOpr = ' ';   // the current operator
        // Constructor to set up the UI components and event handlers
        public n14() {
            // TODO: Setup the UI
            // ......

            // Number buttons listener (inner class)
            class NumberBtnListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    numberInStr += evt.getActionCommand();
                    tfDisplay.setText(numberInStr);
                }
            }
            // Operator buttons listener (inner class)
            class OprBtnListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    previousOpr = currentOpr;  // save
                    currentOpr = evt.getActionCommand().charAt(0);
                    // TODO: Processing logic
                    // ......
                }
            }
        }

    }
