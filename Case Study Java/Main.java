import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameEngine engine = new GameEngine(sc);  
        engine.startGame();  
        sc.close();
    }
}
