package mitrofanov82.edu.javagroup1.angry_chess.shared_model;

import java.util.List;

public interface IFaсade {

	IGame createNewGame(long gameId, IPlayer p1, IPlayer p2);

	IGame makeMove(IGame game, Coord from, Coord to);

	IGame getGameById(long gameId);

	IGame endGame(IGame game, GameStatusType status);

	GameStatusType getGameStatus(long gameId);

	List<IGame> getCurrentGames();
}