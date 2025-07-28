import java.io.IOException;
public class GameUtils {
    GameBoy player;
    private static int resurrectionChances = 3;
    
    public static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("Unable to clear the console.");
        }
    }

        public static void printRunningText(String text, int delay) {
            for (char c : text.toCharArray()) {
                System.out.print(c);  
                try {
                    Thread.sleep(delay); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Error in delay: " + e.getMessage());
                }
            }
            System.out.println();  
        }

        public static boolean attemptResurrection(GameBoy player) {
            if (resurrectionChances > 0) {
                resurrectionChances--;
                player.setHealth(80);  
                System.out.println("\nYou have been resurrected! " + resurrectionChances + " chance(s) remaining.");
                return true;
            } else {
                System.out.println("\nNo resurrection chances left. Game Over.");
                return false;
            }
        }
    
        public static void resetResurrections(int newChances) {
            resurrectionChances = newChances;
            System.out.println("\nResurrection chances reset to " + resurrectionChances + ".");
        }
    
        public static int getResurrectionChances() {
            return resurrectionChances;
        }
}