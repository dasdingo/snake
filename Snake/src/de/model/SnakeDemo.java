package de.model;


import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.Timer;

public class SnakeDemo {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	

	frame.setFocusable(true);
	frame.setPreferredSize(new Dimension(400,400));
	frame.setLocation(new Point(400,300));
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Snake snake = new Snake(new Dimension(10,10));
	Playground ground = new Playground(snake );
	frame.getContentPane().add(ground);
	
	frame.setVisible(true);
	frame.pack();
	ground.requestFocusInWindow();
ground.timer.start();
	
	
		
	

	  

}}
