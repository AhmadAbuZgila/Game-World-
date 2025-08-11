public abstract class Character implements Combatant {
    protected String name;
    protected int health;
    protected int level;

    public Character() {
        this.name = "Unknown";
        this.health = 0;
        this.level = 0;
    }

    public Character(String name, int health, int level) {
        this.name = name;
        if (health > 10 || health < 0) {
            health = 0;
        }
        if (level < 0 || level > 5) {
            level = 0;
        }
        this.health = health;
        this.level = level;
    }


    public abstract String specialMove();

    public void attack(Character target) {
        int baseDamage = 5;
        target.defend(baseDamage);
    }

    @Override
    public void defend(int incomingDamage) {

        incomingDamage /= 2;
        health -= incomingDamage;


    }

    @Override
    public boolean isAlive() {

        if (this.health > 0) {
            return true;
        }
        return false;

    }

    public int heal(int amount) {
        if (amount >= 0 && amount <= 10) {
            this.health += amount;
        }

        return this.health;
    }

    public void levelUp() {
        if (this.level >= 0 && this.level <= 5) {
            this.level++;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return "Name: " + this.name + "\nHealth: " + this.health + "\nLevel: " + this.level;
    }
}
