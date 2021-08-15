import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quizz implements ActionListener {
    String[] questions = {"Who is the most handsome guy in the world?",
                            "Which year he was born?",
                            "How success he is?"};

    String[][] options = {
            {"Thanh Tùng", "The one who created this program", "Thanh Thanh Tùng", "Me"},
            {"2001", "2003", "2005", "2021"},
            {"Infinity", "Very success", "immeasurable", "Huge"}
    };

    char[] answers = {
            'C',
            'A',
            'A'
    };

    char guess;
    char guessAnswer;
    int index;
    int correctAnswer;
    int totalQues = questions.length;
    int result;
    int seconds = 10;

    JFrame frame;
    JTextField textField;
    JTextArea textArea;
    JButton btnA;
    JButton btnB;
    JButton btnC;
    JButton btnD;

    JLabel answerA;
    JLabel answerB;
    JLabel answerC;
    JLabel answerD;
    JLabel timeLabel;
    JLabel secondsLeft;
    JTextField numberRight;
    JTextField percentage;

    public Quizz(){
        frame = new JFrame();
        textField = new JTextField();
        textArea = new JTextArea();
        btnA = new JButton();
        btnB = new JButton();
        btnC = new JButton();
        btnD = new JButton();
        answerA = new JLabel();
        answerB = new JLabel();
        answerC = new JLabel();
        answerD = new JLabel();
        timeLabel = new JLabel();
        secondsLeft = new JLabel();
        numberRight = new JTextField();
        percentage = new JTextField();

        textField.setBounds(0,0, 650, 50);
        textField.setBackground(Color.pink);
        textField.setForeground(Color.white);
        textField.setFont(new Font("MV Boli", Font.BOLD, 30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        textField.setText("testing");

        textArea.setBounds(0,50, 650, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.pink);
        textArea.setForeground(Color.white);
        textArea.setFont(new Font("MV Boli", Font.BOLD, 30));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        btnA.setBounds(0, 100, 100, 100);
        btnA.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnA.setFocusable(false);
        btnA.setForeground(Color.white);
        btnA.setBackground(Color.pink);
        btnA.addActionListener(this);

        btnB.setBounds(0, 200, 100, 100);
        btnB.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnB.setFocusable(false);
        btnB.setForeground(Color.white);
        btnB.setBackground(Color.pink);
        btnB.addActionListener(this);

        btnC.setBounds(0, 300, 100, 100);
        btnC.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnC.setFocusable(false);
        btnC.setForeground(Color.white);
        btnC.setBackground(Color.pink);
        btnC.addActionListener(this);

        btnD.setBounds(0, 400, 100, 100);
        btnD.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnD.setFocusable(false);
        btnD.setForeground(Color.white);
        btnD.setBackground(Color.pink);
        btnD.addActionListener(this);


        frame.add(btnA);
        frame.add(btnB);
        frame.add(btnC);
        frame.add(btnD);
        frame.add(textArea);
        frame.add(textField);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
    }

    public void nextQuestion(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void displayAnswer(){

    }

    public void finalResult(){

    }
}
