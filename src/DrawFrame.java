import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	
	/**
	 * Contains and draws all the shapes
	 */
	private static DrawPanel drawPanel;

	/**
	 * Creates a window, of the objects to be drawn and adds them to the panel. 
	 * Creates a Panel where the shapes are created, draw, and then added JPanel.
	 * JPanel is then added to the JFrame.
	 * @param title - name of JFrame
	 */
	public DrawFrame(String title)
	{
		
		//Create panel and add shapes
		drawPanel = new DrawPanel();
		Shape wave = new Sinusoid(Color.CYAN, new Point(375,650), 100, 2, 20);
		Shape wave2 = new Sinusoid(Color.CYAN, new Point(375,600), 100, 2, 20);
		Shape wave3 = new Sinusoid(Color.CYAN, new Point(375, 550), 100, 2, 20);
		Polygon beach = new Rectangle(new Point(0, 550), 375, 150, Color.orange, true);
		Shape hair = new Oval(new Point(125, 80), 120, 160, Color.black, true);
		Shape head = new Oval(new Point(150, 105), 70, 80, Color.orange, true);
		Polygon neck = new Rectangle(new Point(175, 160), 20, 50, Color.orange, true);
		Polygon shoulders = new Rectangle(new Point(125, 210), 117, 25, Color.ORANGE, true);
		Shape shirt = new IsoscelesTriangle(new Point(142, 235), 85, -90, Color.RED, true);
		Shape belt = new Rectangle(new Point(163, 290), 40, 20, Color.YELLOW, true);
		Shape pants = new Diamond(new Point (140, 335), 60, Color.BLUE, true);
		Shape legs = new IsoscelesTriangle(new Point(140, 335), 84, -260, Color.ORANGE, true);
		Shape legLine = new PolyLine(new Point(181, 360), new Point(182, 360), 200, Color.BLACK, true);
		Shape boots = new IsoscelesTriangle(new Point(164, 510), 35, -150, Color.RED, true);
		Shape topBoot1 = new Diamond(new Point(163, 505), 10, Color.WHITE, true);
		Shape topBoot2 = new Diamond(new Point(185, 505), 10, Color.WHITE, true);
		Shape topBootFill1 = new Diamond(new Point(164, 510), 10, Color.RED, true);
		Shape topBootFill2 = new Diamond(new Point(184, 510), 10, Color.RED, true);
		Shape cutBoot = new Square(new Point(155, 615), 60, Color.ORANGE, true);
		Shape leftShoe = new RightTriangle(new Point(178, 630), -15, -20, Color.RED, true);
		Shape leftFoot = new Diamond(new Point(162, 632), 11, Color.RED, true);
		Shape rightShoe = new RightTriangle(new Point(184, 630), 15, -20, Color.RED, true);
		Shape rightFoot = new Diamond(new Point(186, 632), 11, Color.RED, true);
		Shape bootLine = new PolyLine(new Point(181, 505), new Point(182, 505), 125, Color.WHITE, true);
		Shape leftArm = new IsoscelesTriangle(new Point(125, 235), 18, -120, Color.ORANGE, true);
		Shape rightArm = new IsoscelesTriangle(new Point(224, 235), 18, -120, Color.ORANGE, true);
		Shape leftGauntlet = new IsoscelesTriangle(new Point(130, 330), 8, -25, Color.LIGHT_GRAY, true);
		Shape leftHand = new Circle(new Point(129, 350), 10, Color.ORANGE, true);
		Shape leftFiller = new Square(new Point(127, 365), 10, Color.WHITE, true);
		Shape rightGauntlet = new IsoscelesTriangle(new Point(229, 330), 8, -25, Color.LIGHT_GRAY, true);
		Shape rightHand = new Circle(new Point(228, 350), 10, Color.ORANGE, true);
		Shape rightFiller = new Square(new Point(228, 365), 10, Color.WHITE, true);
		Shape crown = new IsoscelesTriangle(new Point(157, 118), 55, 20, Color.YELLOW, true);
		Shape leftEarring = new Circle(new Point(147, 157), 2, Color.RED, true);
		Shape rightEarring = new Circle(new Point(221, 157), 2, Color.RED, true);
		Shape leftEye = new Oval(new Point(163, 138), 10, 5, Color.WHITE, true);
		Shape rightEye = new Oval(new Point(195, 138), 10, 5, Color.WHITE, true);
		Shape leftPupil = new Oval(new Point(167, 138), 2, 4, Color.BLUE, true);
		Shape rightPupil = new Oval(new Point(199, 138), 2, 4, Color.BLUE, true);
		Shape mouth = new IsoscelesTriangle(new Point(179, 168), 10, -5, Color.RED, true);
		Shape sun = new Circle(new Point(640, 10), 150, Color.YELLOW, true);
		
		//addShapes
		drawPanel.addShape(wave);
		drawPanel.addShape(wave2);
		drawPanel.addShape(wave3);
		drawPanel.addShape(beach);
		drawPanel.addShape(hair);
		drawPanel.addShape(head);
		drawPanel.addShape(crown);
		drawPanel.addShape(leftEarring);
		drawPanel.addShape(leftEye);
		drawPanel.addShape(leftPupil);
		drawPanel.addShape(rightEarring);
		drawPanel.addShape(rightEye);
		drawPanel.addShape(rightPupil);
		drawPanel.addShape(neck);
		drawPanel.addShape(mouth);
		drawPanel.addShape(shoulders);
		drawPanel.addShape(leftArm);
		drawPanel.addShape(leftGauntlet);
		drawPanel.addShape(leftHand);
		drawPanel.addShape(leftFiller);
		drawPanel.addShape(rightArm);
		drawPanel.addShape(rightGauntlet);
		drawPanel.addShape(rightHand);
		drawPanel.addShape(rightFiller);
		drawPanel.addShape(shirt);
		drawPanel.addShape(legs);
		drawPanel.addShape(legLine);
		drawPanel.addShape(pants);
		drawPanel.addShape(belt);
		drawPanel.addShape(boots);
		drawPanel.addShape(topBoot1);
		drawPanel.addShape(topBoot2);
		drawPanel.addShape(topBootFill1);
		drawPanel.addShape(topBootFill2);
		drawPanel.addShape(cutBoot);
		drawPanel.addShape(leftShoe);
		drawPanel.addShape(leftFoot);
		drawPanel.addShape(rightShoe);
		drawPanel.addShape(rightFoot);
		drawPanel.addShape(bootLine);
		drawPanel.addShape(sun);
		
		
		
		
		
		//Create frame
		JFrame frame = new JFrame(title);
		
		frame.setBackground(Color.WHITE);
		frame.add(drawPanel);
		frame.setSize(800, 700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * The main method, initializes the frame to draw the images.
	 */
	public static void main(String[] args)
	{
		DrawFrame df = new DrawFrame("Wonder Woman!");
		
		
	}
	
}
