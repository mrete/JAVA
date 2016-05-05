package ro.academyplus;

/**
 * Created by user on 05.05.2016.
 */

public class Artifacts {
    protected int damage,health;
    /*
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */
}
class Armor extends Artifacts {
    protected int health;
}


class Helmet extends Armor {
    public Helmet(){
        health = 10;
    }
}
class Weapons extends Artifacts {
    protected int damage;
}

class Sword extends Weapons {
    public Sword () {
        damage = 10;
    }
}

class Bow extends Weapons {
    public Bow () {
        damage = 10;
    }
}

class Axe extends Weapons{
    public Axe () {
        damage = 10;
    }
}