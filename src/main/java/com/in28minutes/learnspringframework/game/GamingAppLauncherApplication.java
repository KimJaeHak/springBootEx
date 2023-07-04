package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
		//context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
//		var marioGame = new MarioGame();
//		var supercontraGame = new SuperContraGame();
//		var gameRunner = new GameRunner(supercontraGame);
//		gameRunner.run();
		
	}

}
