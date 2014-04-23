package de.model;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;

enum Direction {
	Nord, Ost, Sued, West
}

public class Snake {
	Point position;
	
	
	ArrayList<Point> tail;
	Direction direction;
	Dimension size;

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Dimension getSize() {
		return size;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setSize(Dimension size) {
		this.size = size;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void move() {
		
		if(!this.tail.isEmpty()){
		this.tail.get(tail.size() - 1).setLocation(this.position);
		this.tail.add(0, tail.get(tail.size() - 1));
		this.tail.remove(tail.size() - 1);
		}
		switch (direction) {
		case Nord:
			position.y -= 10;
			break;
		case Ost:
			position.x += 10;
			break;
		case Sued:
			position.y += 10;
			break;
		case West:
			position.x -= 10;
			break;
		}

	}

	public Snake(Dimension size) {
		// TODO Auto-generated constructor stub
		// position.setLocation(0, 0);
		
		this.position = new Point(50, 10);
		this.tail = new ArrayList<Point>();
		this.size = size;
		this.direction = Direction.Ost;
	}
}
