package edu.neumont.csc380.services;

import java.security.Key;
import java.security.KeyPair;

import org.springframework.stereotype.Service;

import edu.neumont.csc380.models.Game;
import edu.neumont.csc380.models.GameStatusMessage;
import edu.neumont.csc380.models.Move;
import edu.neumont.csc380.models.Player;

@Service("tTTGameService")
public class TTTGameServiceImpl implements TTTGameService {

	public Game newGame() {
		return new Game();
	}

	// Adds a player to a particular game
	public Player addPlayer(Game game, Key playerPublicKey){
		Player player = null;
		player = new Player(playerPublicKey.toString());
		if(game.getPlayerOne() == null) game.setPlayerOne(player);
		else if(game.getPlayerTwo() == null) game.setPlayerTwo(player);
		return player;
	}

	// Start the game with Player one taking the first turn
	public GameStatusMessage start(Game game) {
		KeyGenServiceImpl keyGen = new KeyGenServiceImpl();
		KeyPair keyPair;
		try {
			keyPair = keyGen.generateKeyPair();
			game.setPlayerOne(new Player(keyPair.getPublic().toString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		GameStatusMessage gsm = new GameStatusMessage();
		gsm.setBoard(game.getBoard());
		gsm.setCurrentPlayer(game.getPlayerOne());
		
		return gsm;
	}

	// Make a move on a particular game
	public GameStatusMessage move(Game game, Move move, Player player) {
		game.getBoard().getTiles()[move.getRow()][move.getColumn()] = player.getPiece().toString();
		GameStatusMessage gsm = new GameStatusMessage();
		gsm.setBoard(game.getBoard());
		Player newCurrentPlayer = null;
		if(game.getPlayerOne().getId().equals(player.getId())) newCurrentPlayer = game.getPlayerTwo() ;
		else newCurrentPlayer = game.getPlayerOne();
		gsm.setCurrentPlayer(newCurrentPlayer);
		
		return gsm;
	}
}
