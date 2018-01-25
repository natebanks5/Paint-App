
import javax.swing.JFrame;

public class InitialFrame extends JFrame
{

    public InitialFrame()
    {
        super("Paint");
        PaintPanel inp = new PaintPanel();
        add(inp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
}
