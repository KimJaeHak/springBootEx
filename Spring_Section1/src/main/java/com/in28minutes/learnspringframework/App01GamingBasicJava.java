package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var marioGame = new MarioGame();
		var supercontraGame = new SuperContraGame();
		var gameRunner = new GameRunner(supercontraGame);
		gameRunner.run();
		
	}

}
