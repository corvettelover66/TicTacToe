package edu.neumont.csc380.services;

import java.security.Key;
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

	public Player addPlayer(Game game, Key playerPublicKey){
		Player player = null;
		player = new Player(playerPublicKey.toString());
		if(game.getPlayerOne() == null) game.setPlayerOne(player);
		else if(game.getPlayerTwo() == null) game.setPlayerTwo(player);
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
}
