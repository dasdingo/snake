package de.model;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TAdapter extends KeyAdapter{

	Direction direction=Direction.Ost;

	public Direction getDirection() {
		return direction;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		switch (key) {
		case KeyEvent.VK_W:
			if(direction != Direction.Sued){
			direction = Direction.Nord;
			}
			break;
		case KeyEvent.VK_D:
			if(direction != Direction.West){
				direction = Direction.Ost;	
			}
			
			break;
		case KeyEvent.VK_S:
			if(direction != Direction.Nord){
			direction = Direction.Sued;
			}
			break;
		case KeyEvent.VK_A:
			if(direction != Direction.Ost){
			direction = Direction.West;
			}
			break;
		default:
		}

	}
}
