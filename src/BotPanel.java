
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotPanel extends JPanel
{

    private JTextField mouseStatus;
    private JTextField brushStatus;
    private JTextField colorStatus;
    private JTextField currentSize;

    public BotPanel()
    {
        super();
        setBackground(Color.LIGHT_GRAY);
        mouseStatus = new JTextField();
        mouseStatus.setPreferredSize(new Dimension(300, 40));
        add(mouseStatus);
        brushStatus = new JTextField("Brush: Square");
        brushStatus.setPreferredSize(new Dimension(100, 40));
        add(brushStatus);
        colorStatus = new JTextField("Color: Red");
        colorStatus.setPreferredSize(new Dimension(100, 40));
        add(colorStatus);
        currentSize = new JTextField("Brush Size: 10");
        currentSize.setPreferredSize(new Dimension(100, 40));
        add(currentSize);
    }

    /**
     * @return the brushStatus
     */
    public JTextField getBrushStatus()
    {
        return brushStatus;
    }

    /**
     * @param brushStatus the brushStatus to set
     */
    public void setBrushStatus(JTextField brushStatus)
    {
        this.brushStatus = brushStatus;
    }

    /**
     * @return the colorStatus
     */
    public JTextField getColorStatus()
    {
        return colorStatus;
    }

    /**
     * @param colorStatus the colorStatus to set
     */
    public void setColorStatus(JTextField colorStatus)
    {
        this.colorStatus = colorStatus;
    }

    /**
     * @return the mouseStatus
     */
    public JTextField getMouseStatus()
    {
        return mouseStatus;
    }

    /**
     * @param mouseStatus the mouseStatus to set
     */
    public void setMouseStatus(JTextField mouseStatus)
    {
        this.mouseStatus = mouseStatus;
    }

    /**
     * @return the currentSize
     */
    public JTextField getCurrentSize()
    {
        return currentSize;
    }

    /**
     * @param currentSize the currentSize to set
     */
    public void setCurrentSize(JTextField currentSize)
    {
        this.currentSize = currentSize;
    }

}
