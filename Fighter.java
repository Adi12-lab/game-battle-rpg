package rpggame;

public class Fighter extends Hero implements Character {
    private final String senjata = "Sarung Tinju";
    private final int attackPoint = 15;
    public Fighter(String name, int healthPoint, int magicPoint) {
        super(name, "Fighter", healthPoint, magicPoint);
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public String getSenjata() {
        return senjata;
    } 
    @Override
    public void attack(Character target, String type) {
            if (target instanceof Hero) {
        Hero targetHero = (Hero) target;
        targetHero.healthPoint -= this.attackPoint;
        if(type.equals("magic")) {
            this.magicPoint -= 5; //jika tipe serangan magic maka kurangi dengan 5
        }
        System.out.println(this.name + " menyerang " + targetHero.name + " dengan " + this.attackPoint + " poin serangan!");
    }

    }

    @Override
    public void defend(int attackPoints) {
        this.healthPoint -= attackPoints - (10/100 * attackPoints); //dikurangi dengan 10 persen attack poin
    }

    @Override
    public void usePotion(int regenerateHP) {
        this.healthPoint += regenerateHP;
        System.out.println("HP +"+regenerateHP+" poin");
    }

    @Override
    public void useEther(int regenerateMP) {
        this.magicPoint += regenerateMP;
        System.out.println("MP +"+regenerateMP + " poin");
    }
    
}

