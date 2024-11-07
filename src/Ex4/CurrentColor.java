package Ex4;

import java.awt.Color;

import javax.swing.JPanel;

public class CurrentColor {
  int red = 0;
  int blue = 0;
  int green = 0;
  JPanel colorPanel;
  
  void changeRed() {
    red = nextBright(red);
    colorPanel.setBackground(new Color(red , green, blue));
  }
  void changeBlue() {
    blue = nextBright(blue);
    colorPanel.setBackground(new Color(red , green, blue));
  }
  void changeGreen() {
    green = nextBright(green);
    colorPanel.setBackground(new Color(red , green, blue));
  }
  int nextBright(int b) {
    if(b==0) {
      b = 128;
    }
    else if(b==128) {
      b = 255;
    }
    else if(b==255){
      b = 0;
    }
    return b;
  }
  void SetPanel(JPanel p) {
    colorPanel = p;
  }
}
