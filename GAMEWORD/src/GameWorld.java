public class GameWorld {
    public String name;
    public Player[] players;
    public Enemy[] enemies;
    public int difficulty;

    public GameWorld() {
        this.name = "Crystalpath";
        difficulty = 1;
        this.players = new Player[0];
        this.enemies = new Enemy[0];
    }

    public GameWorld(String name, Player[] players, Enemy[] enemies ,int difficulty) {
        this.name = name;
        this.players = players;
        this.enemies = enemies;
        this.difficulty = difficulty;

    }

    public void addPlayer(Player player) {

        Player[] newplayer = new Player[players.length + 1];
        for (int i = 0; i < players.length; i++) {

            newplayer[i] = players[i];

        }
        newplayer[players.length] = player;
        this.players = newplayer;

    }

    public void printAllplayers() {

        for (int i = 0; i < players.length; i++) {

            System.out.println("------------"+"player"+(i+1)+"------------");
            System.out.println();
            System.out.println( players[i].toString());
            System.out.println();
        }
    }

    public int getTotalValueOfWorld() {
        int totalValue = 0;
        for (Player player : players)
            totalValue += player.calculateInventoryValue();
        return totalValue;
    }

    public String toString(){

        return "World Name:"+this.name + "\nDifficulty:"+this.difficulty+"\nNumber of players:" + this.players.length;

    }


}
