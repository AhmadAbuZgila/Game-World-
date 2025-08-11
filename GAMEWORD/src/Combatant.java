public interface Combatant {

    void attack(Character target);
    void defend(int incomingDamage);
    boolean isAlive();
}
