package edu.macalester.comp124.critters;

import acm.graphics.GOval;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Christopher
 * Date: 10/15/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class GiantEyeCircle extends Critter {
    @Override
    protected void buildGraphics() {

        GOval body = new GOval(-50, -50, 100, 100);
        GOval body2 = new GOval(-25, -25, 50, 50);
        GOval body3 = new GOval(-35, -35, 70, 70);
        GOval body4 = new GOval(-45, -45, 90, 90);
        body.setColor(Color.BLUE);
        body2.setColor(Color.CYAN);
        body3.setColor(Color.RED);
        body4.setColor(Color.GREEN);
        getGraphics().add(body);
        getGraphics().add(body2);
        getGraphics().add(body3);
        getGraphics().add(body4);


        Eye midEye = new Eye(24, 0.6, 0.3, Color.GRAY);
        addEye(midEye, 0, 0);
    }
}
