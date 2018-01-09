package mitrofanov82.edu.javagroup1.angry_chess.persistence;

import java.util.List;

import mitrofanov82.edu.javagroup1.angry_chess.shared_model.IGame;
import mitrofanov82.edu.javagroup1.angry_chess.shared_model.IPlayer;

public interface IChessPersistenceAPI {
	void saveGameResults(IGame game);
	List<IGame> readGameResults(IPlayer p1, IPlayer p2);
}
