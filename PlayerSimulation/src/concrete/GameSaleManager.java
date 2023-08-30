package concrete;
import abstracts.GameSaleServices;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class GameSaleManager implements GameSaleServices {

    @Override
    public void sell(Player player, Game game, Campaign campaign) {
        System.out.println(game.getName() +" " + game.getGameType()+" selled to " + player.getName() +
                " " +" selled with "+campaign.getName()+" campaign");

    }
}
