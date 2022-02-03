package trafficlightdemo;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class TLGraphicalView implements Observer {
    private TLModel model;
    private ColorPanel pane;
    public TLGraphicalView(TLModel model)
    {
        this.model = model;
        this.pane = new ColorPanel(model);
        JFrame frame = new JFrame("MVC Lights");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pane);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        model.addObserver(this);
        update(model,null);
    }
    public void update(Observable o, Object arg) {
        pane.repaint();
    }
}
