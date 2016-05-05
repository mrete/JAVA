package ro.academyplus;

/**
 * Created by user on 05.05.2016.
 */
public class Villains extends Character{

    public Villains(String name, int health, int damage, int level) {
        super(name, health, damage,level);
    }
    public String toString() {
        return ("Villian "+ name + " has " + health+" health " + damage + " damage and level "+level);
    }

    private static void testVillains(){
        Villains v = new Villains("jjj",5,6,2);
        String s=v.toString();
        System.out.println(s);
        v.setDamage(100);
        if (v.getDamage() != 100) throw new AssertionError();
    }

    public static void main(String[] args) {
         testVillains();
    }
}
