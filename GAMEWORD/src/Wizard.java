public class Wizard extends Player implements Magical {

    private int mana;

    public Wizard() {
        this.mana = 0;
    }

    @Override
    public void attack(Character target){
        super.attack(target);

    }

    public String specialMove() {
        return super.specialMove();
    }

    public Wizard(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    @Override
    public void castSpell() {

        if(this.mana>=10){
            this.mana=-10;
            System.out.println( this.name + "casts a fireball!");
        }
        else {
            System.out.println(this.name + "doesn't have enough mana");
        }

    }

    @Override
    public int getMana() {

        return this.mana;
    }
    @Override
    public void regenerateMana(int amount){

        this.mana += amount;
    }

}
