
import javax.swing.*;

public class GameWindow extends JFrame
{
    private JPanel GamePanel;
    private JTextField answerHereTextField;
    private JButton hintButton;
    private JLabel HintLabel;
    private JLabel questionLabel;
    private JLabel scoreLabel;
    private QuestionPool questionPool;

    public GameWindow(QuestionPool questionPool)
    {
        this.questionPool = questionPool;
        
        setContentPane(GamePanel);

        // Set the title of the window
        setTitle("Game Window");

        // Set the default close operation so the application exits when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        setSize(800, 600);

        // Center the window on the screen
        setLocationRelativeTo(null);

        updateQuestion();

        //Doclistener
        answerHereTextField.getDocument().addDocumentListener(new DocumentListener(answerHereTextField,questionLabel, HintLabel,questionPool, scoreLabel));

        // hint pressed

        hintButton.addActionListener(e -> hintPressed.showHint(HintLabel));
    }
    public void updateQuestion()
    {
        String Question = questionPool.getRandomQuestion();
        CurrentQuest.setCurrentQuest(Question);
        questionLabel.setText(CurrentQuest.getMondai());
        imageLoader.defaultImage(HintLabel);
    }
}