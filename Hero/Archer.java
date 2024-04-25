package Hero;
import Foe.Foe;
import interfaces.Character;
import interfaces.Armor;
public class Archer extends Hero implements Character, Armor {
    private final String senjata = "Panah";
    private final int attackPoint = 14;
    private int armorHealthPoint = 50; // HP untuk armor
    private final int armorReduction = 10; // Persentase pengurangan damage oleh armor

    public Archer(String name, int healthPoint, int magicPoint) {
        super(name, "Archer", healthPoint, magicPoint);
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public String getSenjata() {
        return senjata;
    }

    @Override
    public void attack(Character target, String type) {
        if (target instanceof Foe) {
            Foe targetFoe = (Foe) target;
            int selisih = targetFoe.getHealthPoint() - this.attackPoint;
            targetFoe.setHealthPoint(selisih);
            if (type.equals("magic")) {
                this.magicPoint -= 5; // jika tipe serangan magic maka kurangi dengan 5
            }
            System.out.println(
                    this.name + " menyerang " + targetFoe.getName() + " dengan " + this.attackPoint + " poin serangan!");
        }

    }

    @Override
    public void defend(int attackPoints) {
        int damageAfterReduction = attackPoints - (attackPoints * armorReduction / 100);
        if (armorHealthPoint > 0) {
            int damageToArmor = Math.min(damageAfterReduction, armorHealthPoint);
            armorHealthPoint -= damageToArmor;
            damageAfterReduction -= damageToArmor;
        }
        if (damageAfterReduction > 0) {
            this.healthPoint -= damageAfterReduction;
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

