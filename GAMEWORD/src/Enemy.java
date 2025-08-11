public class Enemy extends Character {

    private int damage;

    @Override
    public String specialMove(){
        return "Fight";
    }
    public Enemy(String name, int health, int level, int damage) {
        super(name, health, level);
        setDamage (damage);
    }
    private void setDamage(int damage) {
        if(damage > 5)
            this.damage = 5;
        else if (damage < 0)
            this.damage = 0;
        else
            this.damage = damage;
    }
    @Override
    public void attack(Character target) {
        target.defend(this.damage);
    }
    public String toString() {
        return  super.toString() + "\ndamage: " + damage;
    }

}
