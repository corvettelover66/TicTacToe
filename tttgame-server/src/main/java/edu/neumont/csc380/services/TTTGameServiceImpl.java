package edu.neumont.csc380.services;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

import edu.neumont.csc380.models.Game;
import edu.neumont.csc380.models.GameStatusMessage;
import edu.neumont.csc380.models.Key;
import edu.neumont.csc380.models.Move;
import edu.neumont.csc380.models.Player;

@Service("tTTGameService")
public class TTTGameServiceImpl implements TTTGameService {

	public Game newGame() {
		return new Game();
	}

	public Player addPlayer(Game game, Key key){
		Player player = null;
		try {
			KeyPair keyPair = generateKeyPair();
			if(game.getPlayerOne() == null) game.setPlayerOne(player);
			else if(game.getPlayerTwo() == null) game.setPlayerTwo(player);
		}
		// Handle different exceptions
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return player;
	}

	public GameStatusMessage start(Game game) {
		// TODO Auto-generated method stub
		return null;
	}

	public GameStatusMessage move(Move move, Player player) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private KeyPair generateKeyPair() throws NoSuchAlgorithmException {
		KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
		kpGen.initialize(2048);
		KeyPair keyPair = kpGen.generateKeyPair();
		
		KeyStorage.addKeyPair(keyPair);
			
		return keyPair;	
	}

}
