import java.util.Objects;

public class CurrentQuest
{
    private static String currentQuest;

    public static String getQuest()
    {
        return currentQuest;
    }
    public static void setCurrentQuest(String currentQuest)
    {
        CurrentQuest.currentQuest = currentQuest;
    }
    public static String getMondai()
    {
        return Mondai.convert(currentQuest);
    }
    public static String getHint()
    {
        String basePath = "main/resources/hints/";
        String jpgPath = basePath + currentQuest + ".jpg";
        String pngPath = basePath + currentQuest + ".png";

        if (Existance(jpgPath))
        {
            return jpgPath;
        } else if (Existance(pngPath))
        {
            return pngPath;
        }
        else {
            return null; // or handle the case where neither file exists
        }
    }
    private static boolean Existance(String path)
    {
        return CurrentQuest.class.getClassLoader().getResource(path) != null;
    }
}
