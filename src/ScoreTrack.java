public class ScoreTrack
{
    private int score;

    public ScoreTrack()
    {
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public void addPoints(int points)
    {
        score += points;
    }

    public void resetScore()
    {
        score = 0;
    }
}
