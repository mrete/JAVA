package ro.academyplus;
/**
 * Created by user on 04.05.2016.
 */
public class Character {
    String  name;
    int     health;
    int     damage;

    int     level;

    public Character(String name, int health, int damage,int level) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
        this.level = 1;
    }

    public int getLevel() {return level;}

    public void setLevel(int level) {this.level = level;}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ("Character "+ name + " has " + health+" health " + damage + " damage and level "+level);
    }

    protected void getDamage(int value){
        this.health -= value;
    }
    private static void testCharacter(){
        Character c = new Character("abc", 7,9,2);

        String s = c.toString();
        System.out.println(s);
        if (c.getDamage() != 9) throw new AssertionError();
        c.setHealth(c.getHealth()-c.getDamage());
        String str = c.toString();
        System.out.println(str);
        c.getDamage(10);
        System.out.println(c.getHealth());
    }

    public static void main(String[] args) {
     // testCharacter();
    }

}