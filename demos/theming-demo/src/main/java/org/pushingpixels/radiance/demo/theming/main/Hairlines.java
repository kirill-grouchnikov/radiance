package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

abstract class Base extends JComponent {
    protected float strokeWidth;

    public Base() {
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(80, 24));
        this.strokeWidth = 1.0f / (float) getScaleFactor();
    }

    private static double getScaleFactor(GraphicsDevice device) {
        GraphicsConfiguration graphicsConfig = device.getDefaultConfiguration();

        AffineTransform tx = graphicsConfig.getDefaultTransform();
        double scaleX = tx.getScaleX();
        double scaleY = tx.getScaleY();
        return Math.max(scaleX, scaleY);
    }

    private static double getScaleFactor() {
        double result = 1.0;
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] devices = e.getScreenDevices();

        // now get the configurations for each device
        for (GraphicsDevice device : devices) {
            result = Math.max(result, getScaleFactor(device));
        }

        return result;
    }
}

class Version1 extends Base {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        g2d.setStroke(new BasicStroke(this.strokeWidth, BasicStroke.JOIN_ROUND, BasicStroke.CAP_BUTT));
        g2d.setColor(Color.BLACK);
        g2d.draw(new Rectangle2D.Float(this.strokeWidth, this.strokeWidth, this.getWidth() - 2 * this.strokeWidth,
                this.getHeight() - 2 * this.strokeWidth));

        for (int i = 1; i < 5; i++) {
            float inset = 2 * i;
            g2d.draw(new Rectangle2D.Float(this.strokeWidth + inset, this.strokeWidth + inset,
                    this.getWidth() - 2 * this.strokeWidth - 2 * inset,
                    this.getHeight() - 2 * this.strokeWidth - 2 * inset));
        }

        g2d.dispose();
    }
}

class Version2 extends Base {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, this.getWidth(), this.getHeight(),
                (g1, x, y, scaledWidth, scaledHeight, scaleFactor) ->
                        paintImpl(g2d, x, y, scaledWidth, scaledHeight, scaleFactor));
        g2d.dispose();
    }

    private void paintImpl( Graphics2D g, int x, int y, int width, int height, double scaleFactor ) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width - 1, height - 1);

        for (int i = 1; i < 5; i++) {
            int inset = 2 * i;
            g.drawRect(x + inset, y + inset, width - (inset * 2) - 1, height - (inset * 2) - 1);
        }
    }
}


class Version3 extends Base {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, this.getWidth(), this.getHeight(),
                (g1, x, y, scaledWidth, scaledHeight, scaleFactor) ->
                        paintImpl(g2d, x, y, scaledWidth, scaledHeight, scaleFactor));
        g2d.dispose();
    }

    private void paintImpl( Graphics2D g, int x, int y, int width, int height, double scaleFactor ) {
        int arcSize = 10;
        g.setColor(Color.BLACK);
        g.drawRoundRect(x, y, width - 1, height - 1, arcSize, arcSize);

        for (int i = 1; i < 5; i++) {
            int inset = 2 * i;
            g.drawRoundRect(x + inset, y + inset, width - (inset * 2) - 1, height - (inset * 2) - 1,
                    arcSize - 2, arcSize - 2);
        }
    }
}

public class Hairlines {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hairlines");

            frame.setLayout(new FlowLayout());
            frame.add(new Version1());
            frame.add(new Version2());
            frame.add(new Version3());

            frame.setVisible(true);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        });
    }
}
