package ro.academyplus;

/**
 * Created by user on 04.05.2016.
 */

public class Hero  extends Character {
       public Hero(String name, int health, int damage, int level) {
        super(name, health, damage, level);
    }

    @Override
    public String toString() {
        return ("Hero "+ name + " has " + health+" health " + damage + " damage and level "+level);
    }

    private static void testHero(){
        Hero h = new Hero("xy",5,6,2);
        String s=h.toString();
        System.out.println(s);
        h.setDamage(100);
        if (h.getDamage() != 100) throw new AssertionError();
    }

    public static void main(String[] args){
       // testHero();
    }

}

class Orc extends Hero{

    public Orc(String name) {
        this.name=name;
        damage=5;
    }
}

class Elf extends Hero{

    public Elf(String name) {
        this.name=name;
        damage=10;
    }
}

class Knight extends Hero{

    public Knight(String name) {
        this.name=name;
        damage=15;
    }
}

class Mage extends Hero{

    public Mage(String name) {
        this.name=name;
        damage=20;
    }
}
