
package rpggame;


public class RpgGame {

    
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Arjuna", 100, 50);
        Fighter fighter2 = new Fighter("Karna", 100, 50);
        
        // Fighter1 menyerang Fighter2
        System.out.println("Fighter1 (Arjuna) menyerang Fighter2 (Karna)");
        fighter1.attack(fighter2, "pyshical");
        System.out.println("HP Karna setelah diserang: " + fighter2.healthPoint);
        
        // Fighter2 menggunakan potion
        System.out.println("Karna menggunakan potion");
        fighter2.usePotion(20); // Misalkan potion menambah 20 HP
        System.out.println("HP Karna setelah menggunakan potion: " + fighter2.healthPoint);
        
        // Fighter2 menyerang balik Fighter1
        System.out.println("Fighter2 (Karna) menyerang Fighter1 (Arjuna)");
        fighter2.attack(fighter1, "magic");
        System.out.println("HP Arjuna setelah diserang: " + fighter1.healthPoint);
        
        // Fighter1 menggunakan ether
        System.out.println("Arjuna menggunakan ether");
        fighter1.useEther(15); // Misalkan ether menambah 15 MP
        System.out.println("MP Arjuna setelah menggunakan ether: " + fighter1.magicPoint);
    }
    
}
