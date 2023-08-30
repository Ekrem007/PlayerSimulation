package concrete;
import abstracts.GameServices;
import entities.Game;

public class GameManager implements GameServices {

    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " added.");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " deleted.");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " updated.");

    }
}
