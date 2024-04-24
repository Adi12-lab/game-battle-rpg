package rpggame;


public interface Character {
    void attack(Character target, String type);
    void defend(int attackPoints);
    void usePotion(int regenerateHP);
    void useEther(int regenerateMP);
}
