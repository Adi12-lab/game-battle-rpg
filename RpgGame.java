import Foe.Skeleton;
import Hero.Fighter;

class RpgGame {
    public static void main(String[] args) {
        Fighter fighter = new Fighter("Arjuna", 100, 50);
        Skeleton skeleton = new Skeleton("Giant Skeleton", 60, 20);

        // Fighter menyerang Skeleton
        System.out.println("Fighter (Arjuna) menyerang Skeleton (Giant Skeleton) menggunakan " + fighter.getSenjata());
        fighter.attack(skeleton, "pyshical");
        System.out.println("HP Giant Skeleton setelah diserang: " + skeleton.getHealthPoint());
        System.out.println("\n");
        // Skeleton menggunakan potion
        System.out.println("Giant Skeleton menggunakan potion");
        skeleton.usePotion(7); // Misalkan potion menambah 20 HP
        System.out.println("HP Giant Skeleton setelah menggunakan potion: " + skeleton.getHealthPoint());
        System.out.println("\n");
        // Skeleton menyerang balik Fighter
        System.out.println("Skeleton (Giant Skeleton) menyerang Fighter (Arjuna) menggunakan magic" );
        skeleton.attack(fighter, "magic");
        System.out.println("HP Armor Arjuna setelah diserang: " + fighter.getArmorHealthPoint());
        System.out.println("HP Arjuna setelah diserang: " + fighter.getHealthPoint());
        System.out.println("\n");
        // Fighter menggunakan ether
        System.out.println("Arjuna menggunakan ether");
        fighter.useEther(15); // Misalkan ether menambah 15 MP
        System.out.println("MP Arjuna setelah menggunakan ether: " + fighter.getMagicPoint());
    }

}
