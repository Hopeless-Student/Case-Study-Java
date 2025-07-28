
public class Boss {
    private int health;
    private String name;
    Boss(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getBossHealth(){
        return health;
    }
    public String getBossName(){
        return name;
    }
    public void takeDamage(int damage){
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;  //para di bumaba ng 0 buhay
        }
    }

    GameBoy player;
    public static void chapterOneBoss(){
        System.out.println("\t\t\t\t*---+---Chapter 1 Boss---+---*");
        GameUtils.printRunningText("\t\t\t\t Thornmaw, the Forest's Warden", 50);
        System.out.println("\t\t\t\t*----//---++**++**++----//---*");
    }
    
}
