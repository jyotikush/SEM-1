import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.*;

class Clock {

    public static void main(String[] args) {
        JFrame clock = new TextClockWindow();
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setVisible(true);
    }
}


class TextClockWindow extends JFrame {

    private JTextField timeField;

    public TextClockWindow() {

        timeField = new JTextField(10);
        timeField.setFont(new Font("sansserif", Font.PLAIN, 48));

        Container content = this.getContentPane();
        content.setLayout(new FlowLayout());
        content.add(timeField);

        this.setTitle("DIGITAL CLOCK By: Jake R. Pomperada, MADE-IT");
        this.pack();


        javax.swing.Timer t = new javax.swing.Timer(1000,
              new ActionListener() {
                  public void actionPerformed(ActionEvent e) {

                  Calendar calendar = new GregorianCalendar();
   String am_pm;


                     Calendar now = Calendar.getInstance();
                      int h = now.get(Calendar.HOUR_OF_DAY);
                      int m = now.get(Calendar.MINUTE);
                      int s = now.get(Calendar.SECOND);


 if( calendar.get( Calendar.AM_PM ) == 0 ){
            am_pm = "AM";

         }
        else{
            am_pm = "PM";

        }   // Code to Determine whether the time is AM or PM

  timeField.setText("" + h + ":" + m + ":" + s + " " + am_pm);
                  timeField.setHorizontalAlignment(JTextField.CENTER);
               // Center the text
             timeField.getCaret().setVisible(false);
               // Hide the Cursor in JTextField
          }
              });
        t.start();
    }
} // End of Code
