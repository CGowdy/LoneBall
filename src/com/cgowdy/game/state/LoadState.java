package com.cgowdy.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.cgowdy.game.main.Resources;
import com.cgowdy.game.state.State;

public class LoadState extends State {

	@Override
	public void init() {
		Resources.load();

	}

	@Override
	public void update() {
		setCurrentState(new MenuState());

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onKeyPress(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
