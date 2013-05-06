package edu.neumont.csc380.services;

import edu.neumont.csc380.models.Game;
import edu.neumont.csc380.models.GameStatusMessage;
import edu.neumont.csc380.models.Key;
import edu.neumont.csc380.models.Move;
import edu.neumont.csc380.models.Player;

public interface TTTGameService {
	Game newGame();
	Player addPlayer(Game game, Key key);
	GameStatusMessage start(Game game);
	GameStatusMessage move(Move move, Player player);
}
