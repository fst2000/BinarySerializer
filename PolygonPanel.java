import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PolygonPanel extends JPanel
{
    Stream<Vector2> stream;
    public PolygonPanel(Stream<Vector2> stream)
    {
        this.stream = stream;
        setSize(500, 500);
        setBackground(Color.black);
        setPreferredSize(new Dimension(500, 500));
    }
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(2));
        StreamReader<Vector2> reader = new StreamReader<>()
        {
            public void read(Vector2 v)
            {
                v.accept((x, y) ->
                {
                    g2d.drawLine(0, 0, (int)x, (int)y);
                    System.out.println(x + " " + y);
                });
                stream.read(this);
            }    
        };
        stream.read(reader);
    }
    
}
