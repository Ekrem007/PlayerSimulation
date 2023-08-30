package entities;

public class Game {
    private int id;
    private String name;
    private String gameType;
    private int price;

    public Game(String name, String gameType, int price) {
        this.name = name;
        this.gameType = gameType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
