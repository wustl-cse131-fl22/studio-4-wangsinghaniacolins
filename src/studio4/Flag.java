package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0, 0, 125);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.2);
		
		StdDraw.setPenColor(175, 0, 0);
        StdDraw.setPenRadius(0.03);
		StdDraw.rectangle(0.5, 0.5, .35, .2);
		
		StdDraw.circle(0.5, 0.5, 0.2);
		
		StdDraw.setPenRadius(0.007);
		StdDraw.filledRectangle(0.42,0.55,0.03,0.03);
		StdDraw.filledRectangle(0.58,0.55,0.03,0.03);
		
		StdDraw.filledEllipse(0.5, 0.4, 0.1, 0.05);
		
		StdDraw.setPenColor(0, 0, 125);
		StdDraw.filledRectangle(0.5, 0.45, 0.1, 0.05);
	}
}