package trafficlightdemo;

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
    private TLModel model;
    private static final Dimension COLOR_PANEL_SIZE = new Dimension(60,200);
    private static final int LIGHT_DIAMETER = 50;
    private static final int CENTRE_X = COLOR_PANEL_SIZE.width / 2;

    public ColorPanel(TLModel model)
    {
        this.model = model;
    }
    @Override
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
    public Dimension getMaximumSize()
    {
        return getPreferredSize();
    }
    public Dimension getPreferredSize()
    {
        return COLOR_PANEL_SIZE;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (model.getRed())
            g.setColor(Color.RED);
        else
            g.setColor(Color.BLACK);

        g.fillOval(CENTRE_X,0,LIGHT_DIAMETER,LIGHT_DIAMETER);
        if (model.getAmber())
            g.setColor(Color.ORANGE);
        else
            g.setColor(Color.BLACK);
        g.fillOval(CENTRE_X,LIGHT_DIAMETER,LIGHT_DIAMETER,LIGHT_DIAMETER);

        if (model.getGreen())
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.BLACK);


        g.fillOval(CENTRE_X,LIGHT_DIAMETER*2,LIGHT_DIAMETER,LIGHT_DIAMETER);
    }


}
