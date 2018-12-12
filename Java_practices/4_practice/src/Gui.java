import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

    JButton barcelona = new JButton("Barcelona");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 x 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    private int milanScore = 0;
    private int madridScore = 0;

    Gui() {
        super("Соревнование");
        setLayout(new GridLayout(3, 2));
        setSize(400, 400);
        add(barcelona);
        add(madrid);
        add(result);
        add(lastScorer);
        add(winner);

        barcelona.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                milanScore++;
                String txt = "Result: " + milanScore + " x " + madridScore;
                result.setText(txt);
                lastScorer.setText("Last Scorer: Barcelona");
                if(milanScore > madridScore) {
                    winner.setText("Winner: Barcelona");
                }
                else if (milanScore < madridScore) {
                    winner.setText("Winner: Madrid");
                }
                else {
                    winner.setText("Winner: EQUAL SCORE");
                }
            }
        });

        madrid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                madridScore++;
                String txt = "Result: " + milanScore + " x " + madridScore;
                result.setText(txt);
                lastScorer.setText("Last Scorer: Madrid");
                if(milanScore > madridScore) {
                    winner.setText("Winner: Barcelona");
                }
                else if (milanScore < madridScore) {
                    winner.setText("Winner: Madrid");
                }
                else {
                    winner.setText("Winner: EQUAL SCORE");
                }

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Gui();
    }

}