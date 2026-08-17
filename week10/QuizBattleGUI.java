import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class QuizBattleGUI extends JFrame implements ActionListener {
    private Questions question;
    private JLabel lblQuestion;
    private JLabel lblResult;
    private JButton btn1;
    private JButton btn2;

    public QuizBattleGUI() {
        question = new Questions("Which keyword creates an object?", "new", "class", "new");

        setTitle("Quiz Battle");
        setSize(400, 260);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblQuestion = new JLabel(question.getQuestion());
        lblQuestion.setBounds(50, 30, 300, 30);

        btn1 = new JButton(question.getOption1());
        btn1.setBounds(50, 80, 120, 40);
        btn1.addActionListener(this);

        btn2 = new JButton(question.getOption2());
        btn2.setBounds(200, 80, 120, 40);
        btn2.addActionListener(this);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(50, 150, 300, 30);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (question.isCorrect(clicked.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    public static void main(String[] args) {
        new QuizBattleGUI();
    }
}
