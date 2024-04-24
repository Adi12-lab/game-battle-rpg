package rpggame;

public class Hero {
    protected String name;
    protected String race;
    protected int healthPoint;
    protected int magicPoint;
    
    public Hero(String name, String race,int healthPoint, int magicPoint) {
        this.name = name;
        this.race = race;
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
    }
}
