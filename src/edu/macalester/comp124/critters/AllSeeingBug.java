package edu.macalester.comp124.critters;


import acm.graphics.GOval;
import acm.graphics.GPolygon;

import java.awt.*;
/**
 * Created with IntelliJ IDEA.
 * User: Christopher
 * Date: 10/15/13
 * Time: 9:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class AllSeeingBug extends Critter {
    @Override
    protected void buildGraphics() {
        createLeg(-40, 20, -60, 30);
        createLeg(40, 20, 60, 30);
        createLeg(0,60, 0, 80);
        createLeg(-10, 70, -20, 80);
        createLeg(10, 70, 20, 80);

        GOval body = new GOval(-50, -50, 100, 100);
        body.setFilled(true);
        body.setFillColor(Color.RED);
        getGraphics().add(body);

        Eye leftEye1 = new Eye(10, 0.46, 0.18, Color.GREEN);
        Eye rightEye1 = new Eye(10, 0.46, 0.18, Color.GREEN);
        Eye leftEye2 = new Eye(15, 0.24, 0.46, Color.BLUE);
        Eye rightEye2 = new Eye(15, 0.24, 0.46, Color.BLUE);
        Eye leftEye3 = new Eye(5, 0.25, 0.25, Color.BLACK);
        Eye rightEye3 = new Eye(5, 0.25, 0.25, Color.BLACK);
        Eye leftEye4 = new Eye(10, 0.5, 0.2, Color.CYAN);
        Eye rightEye4 = new Eye(10, 0.5, 0.2, Color.CYAN);
        Eye midEye = new Eye(20, 0.6, 0.1, Color.MAGENTA);
        addEye(leftEye1, -18, 10);
        addEye(rightEye1, 18, 10);
        addEye(leftEye2, -20, 25);
        addEye(rightEye2, 20, 25);
        addEye(leftEye3, -25, 0);
        addEye(rightEye3, 25, 0);
        addEye(leftEye4, -19, -10);
        addEye(rightEye4, 19, -10);
        addEye(midEye, 0, -15);
    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        GPolygon legPoly = new GPolygon();
        legPoly.setColor(Color.PINK);
        legPoly.setFilled(true);
        legPoly.setFillColor(legPoly.getColor());

        legPoly.addVertex(0, -2);
        legPoly.addVertex(x0, y0 - 1);
        legPoly.addVertex(x1, y1);
        legPoly.addVertex(x0, y0 + 1);
        legPoly.addVertex(0, 2);

        addLeg(new Leg(legPoly, 4));
    }
}
