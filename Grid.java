import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grid extends JFrame implements ActionListener {
    private JPanel panel;
    private JPanel textPanel;
    private JLabel instructionText;
    private GridLayout gLayout;
    private BorderLayout bLayout;
    private JButton[][] buttonArray = new JButton[3][3];
    private Icon icon;

    public Grid() {
        //creating panel and layout
        gLayout = new GridLayout(3, 3);
        bLayout = new BorderLayout();
        textPanel = new JPanel();
        textPanel.setLayout(bLayout);
        instructionText = new JLabel();
        textPanel.add("South", instructionText);
        instructionText.setText("The first move goes to: Noughts");

        panel = new JPanel();
        panel.setLayout(gLayout);
        textPanel.add("Center", panel);
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
        setContentPane(textPanel);
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
