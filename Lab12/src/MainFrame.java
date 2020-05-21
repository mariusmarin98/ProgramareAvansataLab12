import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {

    DesignPanel designPanel;
    ControlPanel controlPanel;

    public MainFrame()
    {
        this.designPanel = new DesignPanel();
        this.controlPanel = new ControlPanel(this.designPanel);

        init();
    }

    private void init()
    {
        this.setLayout(new BorderLayout());

        this.add(controlPanel, BorderLayout.NORTH);
        this.add(designPanel, BorderLayout.CENTER);

        this.setSize(1280, 720);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}