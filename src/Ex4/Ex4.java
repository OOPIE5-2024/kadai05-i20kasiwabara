package Ex4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
//import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ex4 {

  private JFrame frame;
  private JPanel colorPanel;
  private CurrentColor crrntBckColor = new CurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex4 window = new Ex4();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex4() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanel = new JPanel();
    frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
    
    colorPanel = new JPanel();
    frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
    colorPanel.setBackground(Color.black);
    
    JButton btnRed = new JButton("Red");
    btnRed.setForeground(Color.RED);
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeRed();
      }
    });
    btnPanel.add(btnRed);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.setForeground(Color.BLUE);
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeBlue();
      }
    });
    btnPanel.add(btnBlue);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.setForeground(Color.GREEN);
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        crrntBckColor.changeGreen();
      }
    });
    btnPanel.add(btnGreen);
    crrntBckColor.SetPanel(colorPanel);
    
  }

}
