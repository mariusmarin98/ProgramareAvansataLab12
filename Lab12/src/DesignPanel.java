import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DesignPanel extends JPanel {

    Component component;
    Insets insets;

    public DesignPanel() {
        insets = this.getInsets();

        init();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    Component newComponent = component;

                    newComponent.setBounds(e.getX() + insets.left, e.getY() + insets.top, newComponent.getWidth(), newComponent.getHeight());
                    add(newComponent);
                    revalidate();
                    repaint();
                } catch (Exception ignored) {
                }
            }
        });

    }
    void init() {
        setLayout(null);
        setSize(300, 300);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}