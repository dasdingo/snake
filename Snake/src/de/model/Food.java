package de.model;

import java.awt.Point;
import java.util.Random;

public class Food {

	Point position;

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
	
public void reset(){
this.position.setLocation(new Random().nextInt(20)*10, new Random().nextInt(20)*10);
//	this.position = new Point(100,100);
//this.position = new Point(new Random().nextInt()%50+10, new Random().nextInt()%50+10);
}
public Food(){
	this.position = new Point(70,70);
}
}
