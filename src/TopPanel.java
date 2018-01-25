
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TopPanel extends JPanel
{

    private JButton OvalBrush = new JButton("Oval Brush");
    private JButton SquareBrush = new JButton("Square Brush");
    private JButton Red = new JButton("Color: Red");
    private JButton Blue = new JButton("Color: Blue");
    private JButton IncreaseSize = new JButton("Increase Brush Size");
    private JButton DecreaseSize = new JButton("Decrease Brush Size");

    public TopPanel()
    {
        super();
        setBackground(Color.lightGray);
        add(OvalBrush);
        add(SquareBrush);
        add(Red);
        add(Blue);
        add(IncreaseSize);
        add(DecreaseSize);

    }

    /**
     * @return the OvalBrush
     */
    public JButton getOvalBrush()
    {
        return OvalBrush;
    }

    /**
     * @param OvalBrush the OvalBrush to set
     */
    public void setOvalBrush(JButton OvalBrush)
    {
        this.OvalBrush = OvalBrush;
    }

    /**
     * @return the SquareBrush
     */
    public JButton getSquareBrush()
    {
        return SquareBrush;
    }

    /**
     * @param SquareBrush the SquareBrush to set
     */
    public void setSquareBrush(JButton SquareBrush)
    {
        this.SquareBrush = SquareBrush;
    }

    /**
     * @return the Red
     */
    public JButton getRed()
    {
        return Red;
    }

    /**
     * @param Red the Red to set
     */
    public void setRed(JButton Red)
    {
        this.Red = Red;
    }

    /**
     * @return the Blue
     */
    public JButton getBlue()
    {
        return Blue;
    }

    /**
     * @param Blue the Blue to set
     */
    public void setBlue(JButton Blue)
    {
        this.Blue = Blue;
    }

    /**
     * @return the IncreaseSize
     */
    public JButton getIncreaseSize()
    {
        return IncreaseSize;
    }

    /**
     * @param IncreaseSize the IncreaseSize to set
     */
    public void setIncreaseSize(JButton IncreaseSize)
    {
        this.IncreaseSize = IncreaseSize;
    }

    /**
     * @return the DecreaseSize
     */
    public JButton getDecreaseSize()
    {
        return DecreaseSize;
    }

    /**
     * @param DecreaseSize the DecreaseSize to set
     */
    public void setDecreaseSize(JButton DecreaseSize)
    {
        this.DecreaseSize = DecreaseSize;
    }

}
