package browsergame;

import java.util.Collection;
import java.util.List;

import javax.ejb.*;


@Local
public interface PlayerService {

	public Player createPlayer(String nickname, String password, String surname, String firstname, String email, String country, Collection<Building> buildings, int rank, int score, Ressources ressources);
	public List<Player> findAllPlayers();
	public void removePlayer(String pseudo);
	public Player findPlayer(String pseudo);
	public void displayPlayer(String pseudo);
	public List<Player> findBuildingsOf(String pseudo);
	public void upgradeBuilding(String pseudo, int buildingId);

}