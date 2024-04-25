package interfaces;
public interface Character {
    void attack(Character target, String type);
    void usePotion(int regenerateHP);
    void useEther(int regenerateMP);
}
