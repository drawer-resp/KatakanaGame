import javax.swing.*;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        // Call the constructor of GameWindow inside the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() ->
        {
            try
            {
                // Initialize QuestionPool with the path to your questions file
                QuestionPool questionPool = new QuestionPool("main/resources/Questions.txt");

                // Create an instance of GameWindow, passing the QuestionPool instance
                GameWindow gameWindow = new GameWindow(questionPool);

                // Make the window visible
                gameWindow.setVisible(true);

            } catch (IOException e)
            {
                // Handle IOException (e.g., show error message, log the error)
                JOptionPane.showMessageDialog(null, "Error loading questions: " + e.getMessage());
                e.printStackTrace(); // Print stack trace for debugging
                System.exit(1); // Exit application on error
            }
        });
    }
}
