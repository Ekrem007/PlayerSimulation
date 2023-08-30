package abstracts;
import entities.Player;
import entities.Game;
import entities.Campaign;

public interface GameSaleServices {
    void sell(Player player, Game game, Campaign campaign);
}
