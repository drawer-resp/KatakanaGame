import javax.swing.*;
import java.io.IOException;

public class hintPressed
{
    public static void showHint(JLabel HintLabel)
    {
        imageLoader.updateImage(HintLabel, CurrentQuest.getHint());
    }
}
