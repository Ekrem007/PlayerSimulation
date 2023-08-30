import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GameSaleManager;
import concrete.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(122,"Ekrem","Uğur",21,1000);
        Game game = new Game("War Thunder","War Game",300);
        Game game1 = new Game("Call of duty 2","War Game",500);
        Campaign campaign = new Campaign(123,"Holiday",50);

        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.delete(game1);

        System.out.println();

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.delete(campaign);
        campaignManager.update(campaign);                //override
        campaignManager.update(campaign,70);

        System.out.println();

        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.sell(player,game1,campaign);

        System.out.println();

        PlayerManager playerManager = new PlayerManager();
        playerManager.add(player);
        playerManager.delete(player);
        playerManager.update(player);






    }
}