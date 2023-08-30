package concrete;
import abstracts.PlayerServices;
import entities.Player;

public class PlayerManager implements PlayerServices {
    @Override
    public void add(Player player) {
        System.out.println(player.getName() + " added.");

    }

    @Override
    public void delete(Player player) {
        System.out.println(player.getName() + " deleted");

    }

    @Override
    public void update(Player player) {
        System.out.println(player.getName() + " updated");

    }
}
