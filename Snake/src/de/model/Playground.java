package de.model;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Playground extends JPanel implements ActionListener{

	Snake snake;
	Food food;
	Timer timer;
	TAdapter a;
	/**
	 * 
	 */
	private static final long serialVersionUID = 887595886682566372L;
	
	public Playground(Snake snake){
		this.timer = new Timer(100,this);
		this.snake = snake;
		this.food = new Food();
		this.a = new TAdapter();
	
	    this.addKeyListener(a);
		setFocusable(true);
		requestFocusInWindow();
	}
	/*TODO: Bilder Food Kopf Schwanz food muss eher verschwinden*/
	@Override
	public void paintComponent(Graphics g){
		 super.paintComponent(g);
		g.drawRect( (int)snake.getPosition().getX(), (int)snake.getPosition().getY(),(int)snake.getSize().getWidth(), (int)snake.getSize().getHeight());
		for(Point tail : snake.tail){
			g.drawRect( (int)tail.getX(), (int)tail.getY(),(int)snake.getSize().getWidth(), (int)snake.getSize().getHeight());
		}
		g.drawOval( (int)food.getPosition().getX(), (int)food.getPosition().getY(),(int)snake.getSize().getWidth(), (int)snake.getSize().getHeight());
		
		Toolkit.getDefaultToolkit().sync();
        g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		
	}
	public void update(){
		snake.setDirection(a.getDirection());
if(snake.getPosition().equals(food.getPosition())){
		snake.tail.add(new Point());	
		food.reset();
		}
		snake.move();
		repaint();
	}
   
}
