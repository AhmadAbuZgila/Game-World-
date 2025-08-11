

public class Player extends Character {

    private Item[] inventory;

    protected String move;

    @Override
    public String specialMove(){

       return"Run";

    }


//    @Override
//    public void attack(Character target) {
//        super.attack(target);
//    }

    @Override
    public void defend(int incomingDamage) {
        incomingDamage /= 2;
        this.health -= incomingDamage;
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }


    public Player() {
        super();
        inventory = new Item[0];
    }

    public Player(String name, int health, int level) {
        super(name, health, level);
        inventory = new Item[0];
    }

    public Player(String name, int health, int level, Item[] inventory) {
        super(name, health, level);

        this.inventory = new Item[inventory.length];
        for (int i = 0; i < inventory.length; i++) {
            this.inventory[i] = inventory[i];
        }
    }

    public Item[] addItem(Item item) {

        Item[] newInventory = new Item[inventory.length + 1];

        for (int i = 0; i < inventory.length; i++) {
            newInventory[i] = inventory[i];
        }
        newInventory[inventory.length] = item;
        inventory = newInventory;
        return inventory;
    }

  public int calculateInventoryValue(){

        int total = 0;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                total += inventory[i].getValue();
            }
        }
        return total;

    }

    public boolean hasmMagicalItem() {

        for (Item item : inventory) {
            if (item.getisMagicl()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
            String out = super.toString();
            out += "\nInventory: ";

            if (inventory.length == 0) {
                out += "Empty";
            } else {
                for (int i = 0; i < inventory.length; i++) {
                    if (i > 0) out += " | ";
                    out += inventory[i].getName();
                }
            }
            out+="\nTotal inventory: " + this.calculateInventoryValue();

            return out;
        }


}
