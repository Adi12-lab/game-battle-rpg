package Foe;

import interfaces.Character;
import Hero.Hero;
import interfaces.Armor;
public class Dwarf extends Foe implements Character{
    private final String senjata = "Pedang";
    private final int attackPoint = 5;

    public Dwarf(String name, int healthPoint, int magicPoint) {
        super(name, "Dwarf", healthPoint, magicPoint);
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public String getSenjata() {
        return senjata;
    }

    @Override
    public void attack(Character target, String type) {
        if (target instanceof Armor) { // Pastikan target implement interface Armor
            Armor targetArmor = (Armor) target;
            targetArmor.defend(this.attackPoint); // Panggil metode defend untuk mengurangi armor HP terlebih dahulu
            if (type.equals("magic")) {
                this.magicPoint -= 2; // Jika tipe serangan adalah magic, kurangi MP
            }
            System.out.println(this.name + " menyerang " + ((Hero) target).getName() + " dengan " + this.attackPoint);
        }
    }

    @Override
    public void usePotion(int regenerateHP) {
        this.healthPoint += regenerateHP;
        System.out.println("HP +" + regenerateHP + " poin");
    }

    @Override
    public void useEther(int regenerateMP) {
        this.magicPoint += regenerateMP;
        System.out.println("MP +" + regenerateMP + " poin");
    }
}
