import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grid extends JFrame implements ActionListener {
    private JPanel panel;
    private GridLayout gLayout;
    private JButton[][] buttonArray = new JButton[3][3];
    private Icon icon;

    public Grid() {
        //creating panel and layout
        gLayout = new GridLayout(3, 3);
        panel = new JPanel();
        panel.setLayout(gLayout);
        icon = new Icon();
        //initialising buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonArray[i][j] = new JButton();
                buttonArray[i][j].setText(i + " " + j);
                panel.add(buttonArray[i][j]);
                buttonArray[i][j].setIcon(icon.blankIcon);
                buttonArray[i][j].addActionListener(this);
            }
        }


        //setting JFrame options
        setTitle("Pokemon Tic Tac Toe");
        setContentPane(panel);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                if(e.getSource() == buttonArray[i][j])
                {
                    System.out.println("Button at " + i + " " + j + " pressed");
                    buttonArray[i][j].setIcon(icon.zeroIcon);
                }
            }
        }
    }
}
