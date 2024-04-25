package Foe;
public class Foe {
    protected String name;
    protected String race;
    protected int healthPoint;
    protected int magicPoint;
    
    public Foe(String name, String race,int healthPoint, int magicPoint) {
        this.name = name;
        this.race = race;
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
    }
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public int getMagicPoint() {
        return magicPoint;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }
}
