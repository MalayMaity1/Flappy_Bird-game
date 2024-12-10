import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tic_tac_toy{
    int boardWidt=600;
    int boardHeight=650;

    JFrame frame =new JFrame();
    JLabel textJLabel=new JLabel();
    tic_tac_toy(){
        frame.setVisible(true);
        frame.setSize(boardWidt,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        textLable.setBackground(Color.darkGray);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial",Font.BOLD))
    }

}