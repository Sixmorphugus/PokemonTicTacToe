import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame
{
    private JPanel panel;
    private GridLayout gLayout;
    private JButton[][] buttonArray = new JButton[3][3];
    public Grid()
    {
        //creating panel and layout
        gLayout = new GridLayout(3,3);
        panel = new JPanel();
        panel.setLayout(gLayout);
        //initialising buttons
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                    buttonArray[i][j] = new JButton();
                    buttonArray[i][j].setText(i + " " + j);
                    panel.add(buttonArray[i][j]);
            }
        }


        //setting JFrame options
        setTitle("Pokemon Tic Tac Toe");
        setContentPane(panel);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
