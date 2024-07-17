import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Objects;

public class imageLoader
{
    public static ImageIcon loadImageIcon(String path)
    {
        try
        {
            return new ImageIcon(Objects.requireNonNull(ClassLoader.getSystemResource(path)));
        }
        catch (Exception e)
        {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public static void updateImage(JLabel label, String path)
    {
        try
        {
            // Load image
            BufferedImage Image = ImageIO.read(Objects.requireNonNull(ClassLoader.getSystemResource(path)));
            // resize
            Image sizedImage = resizeImage(Image, 600, 400);
            label.setIcon(new ImageIcon(sizedImage));
            //label.revalidate(); // Revalidate the label
            //label.repaint();
        }
        catch (Exception e)
        {
            System.err.println("Couldn't find file: " + path);
        }
        ImageIcon icon = loadImageIcon(path);

    }
    public static void defaultImage(JLabel label)
    {
        String path = "main/resources/shikanoko-nokonoko-koshitantan-my-deer-friend-nokatan.gif";
        ImageIcon icon = loadImageIcon(path);
        if (icon != null)
        {
            label.setIcon(icon);
            //label.revalidate(); // Revalidate the label
            //label.repaint();    // Repaint the label to ensure the new icon is displayed properly
        } else
        {
            System.err.println("Couldn't find file: " + path);
        }

    }
    private static Image resizeImage(BufferedImage image, int Mwidth, int Mheight)
    {
        int w = image.getWidth();
        int h = image.getHeight();

        if (w > Mwidth || h > Mheight)
        {
            double scale = Math.min((double) Mheight / h, (double) Mwidth / w);

            int rescaledWidth = (int) (w * scale);
            int rescaledHeight = (int) (h * scale);

            return image.getScaledInstance(rescaledWidth, rescaledHeight, Image.SCALE_SMOOTH);
        }
        else
        {
            return image;
        }
    }
}
