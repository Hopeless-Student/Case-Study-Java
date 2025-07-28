public class GameBoy {
    private String name;
    private int health;

    GameBoy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int updatedHealth){
        this.health = updatedHealth;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;  //para di bumaba ng 0 buhay
        }
    }
}
