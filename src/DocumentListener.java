import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.text.*;
import javax.swing.text.JTextComponent;
import java.awt.event.TextListener;
import java.util.Objects;

public class DocumentListener implements javax.swing.event.DocumentListener
{
    private JTextField ansField;
    private JLabel questionLabel;
    private QuestionPool questionPool;
    private JLabel hintLabel;
    private JLabel scoreLabel;
    private ScoreTrack scoreTrack = new ScoreTrack();

    public DocumentListener(JTextField ansField, JLabel questionLabel, JLabel hintLabel, QuestionPool questionPool, JLabel scoreLabel)
    {
        this.ansField = ansField;
        this.questionLabel = questionLabel;
        this.questionPool = questionPool;
        this.hintLabel = hintLabel;
        this.scoreLabel = scoreLabel;
    }

    @Override
    public void changedUpdate(DocumentEvent e)
    {
        handleTextChanged();
    }

    @Override
    public void insertUpdate(DocumentEvent e)
    {
        handleTextChanged();
    }

    @Override
    public void removeUpdate(DocumentEvent e)
    {
        handleTextChanged();
    }


    private void handleTextChanged()
    {
        String text = ansField.getText();
        checkanswer(text);
    }

    private void checkanswer(String ans)
    {
        if(Objects.equals(ans, CurrentQuest.getQuest()))
        {
            SwingUtilities.invokeLater(this::updateQuestion);
        }
    }
    private void updateQuestion() {
        String newQuestion = questionPool.getRandomQuestion();
        CurrentQuest.setCurrentQuest(newQuestion);
        scoreTrack.addPoints(1);

        questionLabel.setText(CurrentQuest.getMondai());
        imageLoader.defaultImage(hintLabel);
        ansField.setText(""); // Clear the text field for the next answer*/
        scoreLabel.setText("Score: " + scoreTrack.getScore());
    }
}
