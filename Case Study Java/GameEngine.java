import java.util.Scanner;

public class GameEngine {
    private Scanner sc;
    private GameBoy player;
    private Bag bag;
    private boolean firstGame = true;

    public GameEngine(Scanner sc) {
        this.sc = sc;
        this.bag = new Bag();
    }

    public void startGame() {
        if(firstGame){
            initializePlayer(); 
            firstGame = false;
        }
        welcome();          
        //backstory(); 
        GameUtils.clearConsole();
        exploreFirstChapter(); 
        nextLevel();
        exploreSecondChapter();
        nextLevel();
    }

    private void initializePlayer() { // Enter name
        try {
            System.out.println("\t\t\t\t*------------------------*");
            String name;

        while (true) {
            System.out.print("\t\t\t\tState your name: ");
            name = sc.nextLine().trim(); 

            if (name.matches("[a-zA-Z ]+") && !name.isEmpty()) {
                break;  
            } else {
                System.out.println("\t\t\t\tInvalid input! Please enter only letters.");
            }
        }
                player = new GameBoy(name, 100);
            System.out.println("\t\t\t\tGood luck on the adventure, " + player.getName() + "!");
            System.out.println("\t\t\t\tEnjoy the game!");
            System.out.println("\t\t\t\t*------------------------*");
            Thread.sleep(1500);
            GameUtils.clearConsole();
        } catch (Exception e) {
           System.out.println("Something went wrong!");
        }
        
    }

    private void welcome() { // You're welcome hohoho
        try {
            System.out.println("\t\t\t\t*+-----*-----//-------+++---+++-------//-----*-----+*");
            GameUtils.printRunningText("\t\t\t\t|   Biringan City: A Lost City Exploration\t    |", 50);
            System.out.println("\t\t\t\t*+-----*-----//-------+++---+++-------//-----*-----+*");
            Thread.sleep(1000);
        } catch (Exception e) {
           System.out.println("Error message!");
        }
    }

    private void backstory(){
        try {
           GameUtils.printRunningText("\nOnce, in a quiet village surrounded by lush forests and whispering rivers,\nthere lived an adventurer known to all named "+ player.getName()+  ".\n\nWith hair as dark as midnight and eyes that sparkled like distant stars,\n" + player.getName()+ " was known for an adventurous spirit and relentless curiosity. \n\nHaving grown up listening to legends and tales told around campfires,\nthere was one story they had never truly understood: the legend of the lost city of Biringan.\n\n", 30);

            GameUtils.printRunningText(player.getName() + "'s grandmother, Amara, had always been the keeper of the village's stories.\nHer voice, though aged, was rich with wonder as she recounted tales of ancient mysteries,\nspirits, and kingdoms hidden deep within the unseen folds of the world.\n", 50);

            GameUtils.printRunningText("But Amara was now fading, her strength slipping away,\nand the entire family gathered in hushed reverence as she lay on her deathbed.", 30);

            GameUtils.printRunningText("\nOne evening, as the soft glow of twilight painted the sky in hues of purple and gold,\n"+ player.getName() +" sat by their grandmother's side, holding her frail hand. With a voice\nbarely above a whisper, Amara called " +player.getName()+ " closer, her gaze clouded but intense.", 30);

            GameUtils.printRunningText("*"+player.getName() +"*"+" she murmured, her breath coming in shallow, uneven gasps.\n\nAmara: I must tell you... before it is too late.\nThe lost city... Biringan... it is real.\nOur ancestors came from there, and a part of our blood is tied to its magic.\n", 30);
            Thread.sleep(2000);
            GameUtils.clearConsole();
            System.out.println("\n\n");
            GameUtils.printRunningText(player.getName() +"'s heart raced as their grandmother's words enveloped them.\n\n" +player.getName()+": Why are you telling me this now? " + player.getName() +"'s voice was trembling.\n", 30);

            GameUtils.printRunningText("Amara's eyes seemed to light up with a last spark of life.\n\nAmara: I see it, " + player.getName() + ", in dreams and visions. Biringan is calling...\nbut it is also in danger. You must find it, my child. There, the spirits will reveal your true purpose.\n", 30);

            GameUtils.printRunningText("She reached for the necklace she always wore, an old pendant with a shimmering black stone,\nand placed it in your hands.\n\nAmara: This will guide you. Biringan lies hidden, cloaked in mist and shadow, but you must be brave.\nOnly you can uncover the truth... and protect our past and with that.\n\nAmara's spirit slipped away, leaving behind her stories and a mystery that now belonged to you.", 30);
            Thread.sleep(2000);
            GameUtils.clearConsole();
            System.out.println("\n\n");

            Thread.sleep(2000);
        } catch (Exception e) {
           System.out.println("Thread sleep error!");
        }
        
    }

    private void exploreFirstChapter() { // pang Chapter 1. Gawa kayo ng ganto pang katuloy na chapter
        GameRoom chapterOne = new GameRoom(sc, bag, player, this);  
        // chapterOne.roomOne();
        // chapterOne.chapterOneStory();
        // chapterOne.forestJourney();
        chapterOne.forestGuardianFight();
        chapterOne.postGuardianStory();
    }
    private void exploreSecondChapter(){
        GameRoomTwo chapterTwo = new GameRoomTwo(sc, bag, player, this);
        chapterTwo.roomTwoTransition();
        chapterTwo.chapterTwoStory();
        chapterTwo.toTheWell();
        chapterTwo.chapterTwoEndingLines();

    }

    private void nextLevel() {
        GameUtils.resetResurrections(3); // reset resurrect para may chances
    }
    

    public void promptRestart() { // Gamitin niyo to nang tama, optional use kung mamamatay ba si player
        System.out.println("Do you want to restart the game? (yes/no)");
        String restartChoice = sc.next().trim().toLowerCase();

        while (!restartChoice.equals("yes") && !restartChoice.equals("no")) {
            System.out.println("Invalid choice! Please enter 'yes' or 'no'.");
            System.out.print("Do you want to restart the game? (yes/no): ");
            restartChoice = sc.next().trim().toLowerCase();
        }

        if (restartChoice.equals("yes")) {
            restartGame(); // trigger ng restart
        } else {
            System.out.println("Thanks for playing! Goodbye!");
            System.exit(0);  // Exit exit exit exit
        }
    }

    public void restartGame() {
        System.out.println("Restarting the game...");
        GameUtils.clearConsole();
        player.setHealth(100);  
        startGame();  
    }

    public void gameOver() { // 1st prompt ng restart
        System.out.println("Game Over! Your health has reached 0.");
        promptRestart();  // Ask user kung restart
    }
}