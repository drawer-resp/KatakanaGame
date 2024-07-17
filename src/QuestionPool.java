import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionPool
{
    private List<String> questions;
    private Random rand;
    public QuestionPool(String path) throws IOException
    {
        questions = new ArrayList<>();
        rand = new Random();
        loadQuestion(path);
    }

    private void loadQuestion(String path) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(path))))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                questions.add(line);
            }
        }
    }

    public String getRandomQuestion()
    {
        if(questions.isEmpty())
        {
            return "Empty question";
        }
        int index = rand.nextInt(questions.size());
        String question = questions.get(index);
        CurrentQuest.setCurrentQuest(question);
        return question;
    }

}
