
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener
{

    ArrayList<Integer> x = new ArrayList();
    ArrayList<Integer> y = new ArrayList();
    ArrayList<Integer> sizes = new ArrayList();
    ArrayList<Color> colors = new ArrayList();
    ArrayList<Integer> oX = new ArrayList();
    ArrayList<Integer> oY = new ArrayList();
    ArrayList<Integer> oSizes = new ArrayList();
    ArrayList<Color> oColors = new ArrayList();

    TopPanel menu = new TopPanel();
    BotPanel status = new BotPanel();
    Graphics gr;
    private int brushSize = 10;
    boolean blue = false;
    boolean red = true;
    boolean square = true;
    boolean oval = false;

    public PaintPanel()
    {
        super();
        setLayout(new BorderLayout());
        add(menu, BorderLayout.NORTH);
        add(status, BorderLayout.SOUTH);
        menu.getOvalBrush().addActionListener(this);
        menu.getSquareBrush().addActionListener(this);
        menu.getRed().addActionListener(this);
        menu.getBlue().addActionListener(this);
        menu.getIncreaseSize().addActionListener(this);
        menu.getDecreaseSize().addActionListener(this);
        addMouseMotionListener(this);
        setBackground(Color.white);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < sizes.size(); i++)
        {
            g.setColor(colors.get(i));
            g.fillRect(x.get(i), y.get(i), sizes.get(i), sizes.get(i));
        }

        for (int a = 0; a < oX.size(); a++)
        {
            g.setColor(oColors.get(a));
            g.fillOval(oX.get(a), oY.get(a), oSizes.get(a), oSizes.get(a));
        }

    }

    public void setMouseColor()
    {
        gr = getGraphics();
        if (blue == true)
        {
            gr.setColor(Color.blue);
        }
        if (red == true)
        {
            gr.setColor(Color.red);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        Object obj = ae.getSource();
        if (obj == menu.getOvalBrush())
        {
            status.getBrushStatus().setText("Brush: Oval");
            oval = true;
            square = false;

        }

        if (obj == menu.getSquareBrush())
        {
            status.getBrushStatus().setText("Brush: Square");
            square = true;
            oval = false;
        }

        if (obj == menu.getBlue())
        {
            status.getColorStatus().setText("Color: Blue");
            gr = getGraphics();
            gr.setColor(Color.blue);
            blue = true;
            red = false;

        }

        if (obj == menu.getRed())
        {
            status.getColorStatus().setText("Color: Red");
            gr = getGraphics();

            red = true;
            blue = false;
        }
        if (obj == menu.getIncreaseSize())
        {
            if (getBrushSize() <= 30)
            {
                setBrushSize(getBrushSize() + 2);
                status.getCurrentSize().setText("Brush size: " + getBrushSize());
            }
        }
        if (obj == menu.getDecreaseSize())
        {
            if (getBrushSize() >= 4)
            {
                setBrushSize(getBrushSize() - 2);
                status.getCurrentSize().setText("Brush size: " + getBrushSize());
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent me)
    {
    }

    @Override
    public void mouseDragged(MouseEvent me)
    {
        Point pt = me.getPoint();
        gr = getGraphics();
        if (square == true)
        {
            setMouseColor();
            gr.fillRect(pt.x, pt.y, getBrushSize(), getBrushSize());
            x.add(pt.x);
            y.add(pt.y);
            sizes.add(getBrushSize());
            colors.add(gr.getColor());
        }
        if (oval == true)
        {
            setMouseColor();
            gr.fillOval(pt.x, pt.y, getBrushSize(), getBrushSize());
            oX.add(pt.x);
            oY.add(pt.y);
            oSizes.add(getBrushSize());
            oColors.add(gr.getColor());
        }
        status.getMouseStatus().setText("Mouse at X: " + pt.x + " Y: " + pt.y);
    }

    @Override
    public void mouseMoved(MouseEvent me)
    {
        Point pt = me.getPoint();
        status.getMouseStatus().setText("Mouse at X: " + pt.x + " Y: " + pt.y);
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
    }

    @Override
    public void mouseEntered(MouseEvent me)
    {
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
    }

    /**
     * @return the brushSize
     */
    public int getBrushSize()
    {
        return brushSize;
    }

    /**
     * @param brushSize the brushSize to set
     */
    public void setBrushSize(int brushSize)
    {
        this.brushSize = brushSize;
    }

}
