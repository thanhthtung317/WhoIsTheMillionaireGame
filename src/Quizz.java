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

    ImageIcon icon;

    Timer timeCounter = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //countdown from 10 to 0

            seconds--;
            secondsLeft.setText(String.valueOf(seconds));
            if(seconds <= 0){
                displayAnswer();
            }
        }
    });

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
        icon = new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\Saved Pictures\\flaticon\\money-bag.png");

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
        textArea.setFont(new Font("MV Boli", Font.BOLD, 25));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        btnA.setBounds(0, 100, 100, 100);
        btnA.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnA.setFocusable(false);
        btnA.setForeground(Color.white);
        btnA.setBackground(Color.pink);
        btnA.addActionListener(this);
        btnA.setText("A");

        btnB.setBounds(0, 200, 100, 100);
        btnB.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnB.setFocusable(false);
        btnB.setForeground(Color.white);
        btnB.setBackground(Color.pink);
        btnB.addActionListener(this);
        btnB.setText("B");

        btnC.setBounds(0, 300, 100, 100);
        btnC.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnC.setFocusable(false);
        btnC.setForeground(Color.white);
        btnC.setBackground(Color.pink);
        btnC.addActionListener(this);
        btnC.setText("C");

        btnD.setBounds(0, 400, 100, 100);
        btnD.setFont(new Font("MV Boli", Font.BOLD, 30));
        btnD.setFocusable(false);
        btnD.setForeground(Color.white);
        btnD.setBackground(Color.pink);
        btnD.addActionListener(this);
        btnD.setText("D");

        answerA.setBounds(125, 100, 500, 100);
        answerA.setBackground(new Color(0x123456));
        answerA.setOpaque(true);
        answerA.setForeground(Color.white);
        answerA.setFont(new Font("MV Boli", Font.BOLD, 30));
        answerA.setText("testing");

        answerB.setBounds(125, 200, 500, 100);
        answerB.setBackground(new Color(0x123456));
        answerB.setOpaque(true);
        answerB.setForeground(Color.white);
        answerB.setFont(new Font("MV Boli", Font.BOLD, 30));

        answerC.setBounds(125, 300, 500, 100);
        answerC.setBackground(new Color(0x123456));
        answerC.setOpaque(true);
        answerC.setForeground(Color.white);
        answerC.setFont(new Font("MV Boli", Font.BOLD, 30));

        answerD.setBounds(125, 400, 500, 100);
        answerD.setBackground(new Color(0x123456));
        answerD.setOpaque(true);
        answerD.setForeground(Color.white);
        answerD.setFont(new Font("MV Boli", Font.BOLD, 30));

        secondsLeft.setBounds(535, 510,100, 100);
        secondsLeft.setBackground(Color.pink);
        secondsLeft.setForeground(Color.white);
        secondsLeft.setFont(new Font("MV Boli", Font.BOLD, 60));
        secondsLeft.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
        secondsLeft.setOpaque(true);
        secondsLeft.setHorizontalAlignment(JLabel.CENTER);
        secondsLeft.setText(String.valueOf(seconds));

        timeLabel.setBounds(535, 475, 100,25);
        timeLabel.setBackground(Color.pink);
        timeLabel.setForeground(Color.white);
        timeLabel.setFont(new Font("MV Boli", Font.BOLD, 20));
        timeLabel.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText("Timer");

        numberRight.setBounds(225, 225, 200, 100);
        numberRight.setBackground(Color.pink);
        numberRight.setForeground(Color.white);
        numberRight.setFont(new Font("MV Boli", Font.BOLD, 20));
        numberRight.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
        numberRight.setHorizontalAlignment(JTextField.CENTER);
        numberRight.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(Color.pink);
        percentage.setForeground(Color.white);
        percentage.setFont(new Font("MV Boli", Font.BOLD, 20));
        percentage.setBorder(BorderFactory.createLineBorder(Color.lightGray, 2));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(timeLabel);
        frame.add(secondsLeft);
        frame.add(answerA);
        frame.add(answerB);
        frame.add(answerC);
        frame.add(answerD);
        frame.add(btnA);
        frame.add(btnB);
        frame.add(btnC);
        frame.add(btnD);
        frame.add(textArea);
        frame.add(textField);

        frame.setDefaultCloseOperation(3);
        frame.setTitle("Who Is The Millionaire?");
        frame.setIconImage(icon.getImage());
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.setVisible(true);
        frame.setResizable(false);

        nextQuestion();
    }

    public void nextQuestion(){
        if (index >= totalQues){
            finalResult();
        } else {
            textField.setText("Question number " + (index + 1));
            textArea.setText(questions[index]);
            answerA.setText(options[index][0]);
            answerB.setText(options[index][1]);
            answerC.setText(options[index][2]);
            answerD.setText(options[index][3]);
            timeCounter.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);

        if (e.getSource() == btnA){
            guessAnswer = 'A';
            if (guessAnswer == answers[index]){
                correctAnswer++;
            }
        }

        if (e.getSource() == btnB){
            guessAnswer = 'B';
            if (guessAnswer == answers[index]){
                correctAnswer++;
            }
        }

        if (e.getSource() == btnC){
            guessAnswer = 'C';
            if (guessAnswer == answers[index]){
                correctAnswer++;
            }
        }

        if (e.getSource() == btnD){
            guessAnswer = 'D';
            if (guessAnswer == answers[index]){
                correctAnswer++;
            }
        }
        displayAnswer();
    }

    public void displayAnswer(){
        timeCounter.stop();
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);

        if (answers[index] != 'A'){
            answerA.setForeground(Color.red);
        }
        if (answers[index] != 'B'){
            answerB.setForeground(Color.red);
        }
        if (answers[index] != 'C'){
            answerC.setForeground(Color.red);
        }
        if (answers[index] != 'D'){
            answerD.setForeground(Color.red);
        }

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answerA.setForeground(Color.white);
                answerB.setForeground(Color.white);
                answerC.setForeground(Color.white);
                answerD.setForeground(Color.white);

                //reset the answer
                guessAnswer = ' ';
                //reset the time counter
                seconds = 10;
                secondsLeft.setText(String.valueOf(seconds));

                btnA.setEnabled(true);
                btnB.setEnabled(true);
                btnC.setEnabled(true);
                btnD.setEnabled(true);

                //in order to go to the next question
                index++;
                nextQuestion();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public void finalResult(){
        result = (int)((correctAnswer/(double)totalQues)*100);

        textField.setText("RESULT: ");

        textArea.setText("");
        answerA.setText("");
        answerB.setText("");
        answerC.setText("");
        answerD.setText("");

        numberRight.setText(String.valueOf(correctAnswer) + "/" + totalQues);
        percentage.setText(result + "%");

        frame.add(percentage);
        frame.add(numberRight);
    }
}
