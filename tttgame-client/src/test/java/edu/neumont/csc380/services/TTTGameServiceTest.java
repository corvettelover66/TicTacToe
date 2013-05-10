package edu.neumont.csc380.services;

import java.security.KeyPair;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import edu.neumont.csc380.models.Game;
import edu.neumont.csc380.models.GameStatusMessage;
import edu.neumont.csc380.models.Move;
import edu.neumont.csc380.models.Piece;
//import edu.neumont.csc380.hello.service.HelloWorldService;

@ContextConfiguration(locations="beans.xml")
public class TTTGameServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired TTTGameService service;
	@Autowired KeyGenService keyGen;
	
	@Test
	public void test() {
		// Create a game instance
		Game game = service.newGame();
		
		KeyPair keyPair, keyPair2;
		try {
			// Generate two key pairs
			keyPair = keyGen.generateKeyPair();
			keyPair2 = keyGen.generateKeyPair();
			// Add two players to the game
			service.addPlayer(game, keyPair.getPublic());
			service.addPlayer(game, keyPair2.getPublic());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Start the game
		GameStatusMessage gameStartedMessage = service.start(game);
		
		GameStatusMessage madeAMoveMessage = service.move(game, new Move(1, 1), game.getPlayerOne());
		
		// "Check for null" tests
		Assert.assertNotNull(game);
		Assert.assertNotNull(game.getPlayerOne());
		Assert.assertNotNull(game.getPlayerTwo());
		
		// Check if boards are the same 
		Assert.assertEquals(gameStartedMessage.getBoard(), game.getBoard());
		Assert.assertEquals(madeAMoveMessage.getBoard(), game.getBoard());
		
		// Check if the move was made
		Assert.assertNotSame(game.getBoard().getTiles()[1][1], Piece.E.toString());
		Assert.assertEquals(game.getBoard().getTiles()[1][1], game.getPlayerOne().getPiece().toString());
	}

}


//@Autowired HelloWorldService helloWorldService;
//
//@Test
//public void test() {
//	boolean is_3_prime = helloWorldService.isPrime(3);
//	Assert.assertTrue(is_3_prime);
//	
//	int[] setA = new int[3];
//	setA[0] = 5;
//	setA[1] = 7;
//	setA[2] = 11;
//	Assert.assertTrue(helloWorldService.areCoprime(setA));
//}