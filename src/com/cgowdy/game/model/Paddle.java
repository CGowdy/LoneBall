package com.cgowdy.game.model;

import java.awt.Rectangle;

public class Paddle {
	private int x, y, width, height, velY;
	private Rectangle rect;
	final static int MOVEMENT_SPEED = 4;

	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		rect = new Rectangle(x, y, width, height);
		velY = 0;
	}
	
	public void update(){
		y += velY;
		updateRect();
	}
	
	private void updateRect(){
		rect.setBounds(x, y, width, height);
	}
	
	private void accelUp(){
		velY = -MOVEMENT_SPEED;
	}
	
	private void accelDown(){
		velY = MOVEMENT_SPEED;
	}
	
	private void stop(){
		velY = 0;
	}
}
