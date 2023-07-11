package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("SuperContraGame Jump");
	}
	
	public void down() {
		System.out.println("SuperContraGame Go into a hole");
	}
	
	public void left() {
		System.out.println("SuperContraGame Go back");
	}
	
	public void right() {
		System.out.println("SuperContraGame Accelerate");
	}
}
