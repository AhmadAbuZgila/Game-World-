
public class Main {
    public static void main(String[] args) {

        Item AmmoItem = new Item("Ammo",4,true);
        Item MedicalItem = new Item("Medical",2,true);
        Item ShieldItem = new Item("Shield",3,true);

        Item[] inventory = {AmmoItem, MedicalItem};

        Player Ahmad = new Player("Ahmad",10,1,inventory);
        Player Alex = new Player("Alex",10,2,inventory);
        Player Anna = new Player("Anna",10,3,inventory);

        Ahmad.addItem(ShieldItem);

        Alex.addItem(ShieldItem);

        Anna.addItem(ShieldItem);

        Enemy enemy = new Enemy("Adam",8,4,3);

        Player [] players = {Ahmad,Alex,Anna};

        Enemy[] enemies = {enemy};
        GameWorld world = new GameWorld("Fight World",players,enemies,2 );

        world.printAllplayers();


        simulateBattle(Ahmad,enemy);



    }

    public static void simulateBattle(Player player, Enemy enemy) {
        int playerLevel = player.getLevel();
        int enemyLevel = enemy.getLevel();

        System.out.println(player.getName() + " - level : " + playerLevel + " VS " + enemy.getName() + " - level : " + enemyLevel);

        if (playerLevel > enemyLevel) {
            player.levelUp();
            System.out.println(player.getName() + " wins and levels up!");
        } else if (enemyLevel > playerLevel) {
            enemy.levelUp();
            System.out.println(enemy.getName() + " wins and levels up!");
        } else {
            System.out.println("It's a tie! No one levels up.");
        }

    }
}