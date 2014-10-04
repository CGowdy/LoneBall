package com.cgowdy.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.cgowdy.game.main.Resources;

public class MenuState extends State {

	@Override
	public void init() {

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Resources.welcome, 0, 0, null);

	}

	@Override
	public void onClick(MouseEvent e) {
		setCurrentState(new PlayState());

	}

	@Override
	public void onKeyPress(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
	}

	@Override
	public void onKeyRelease(KeyEvent e) {

	}

}
