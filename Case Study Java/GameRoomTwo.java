import java.util.Scanner;

public class GameRoomTwo {
    
    private Scanner sc;
    private Bag bag;
    private GameBoy player;
    private GameEngine gameEngine;

    public GameRoomTwo(Scanner sc, Bag bag, GameBoy player, GameEngine gameEngine) {
        this.sc = sc;
        this.bag = bag;
        this.player = player;
        this.gameEngine = gameEngine;
    }   

    public void roomTwoTransition(){
        try {
            System.out.println();
            GameUtils.printRunningText("\t\t\t\t++-- The Plain of Echoes --++", 30);
            GameUtils.printRunningText("\nAs "+player.getName()+" steps beyond the forest's edge, and the air feels lighter,\nyet charged with an unfamiliar energy. The towering trees give way to rolling plains stretching as\nfar as the eye can see.\n", 30);

            GameUtils.printRunningText("But something is missing. The familiar flicker of the Candle is gone.\nThe pendant, still warm from absorbing the Warden's essence, glows faintly.\n", 30);

            GameUtils.printRunningText("In the distance, a stone well rises from the center of the plain,\nweathered and covered in strange markings.\n", 30);
            Thread.sleep(1200);
            GameUtils.printRunningText("   --** The Well of Mask awaits... What was lost in the forest may be found beneath the echoes of the plains **--.", 30);
            Thread.sleep(1800);
            GameUtils.clearConsole();

        } catch (Exception e) {
            System.out.println("Something went wrong on transition!");
        }
    }

    public void chapterTwoStory(){
        try {
            System.out.println("\t\t\t\t*------++---//---++---//---++------*");
            GameUtils.printRunningText("\t\t\t\t| Chapter 2: The Well of Mask\t   |", 50);
            System.out.println("\t\t\t\t*------++---//---++---//---++------*\n");
            Thread.sleep(1800);

            GameUtils.printRunningText(player.getName()+" journey across the Plain of Echoes is marked by silence\nthe ground beneath them feels different...\nsolid, almost echoing with each step, as though they walk upon buried secrets.\n", 30);

            GameUtils.printRunningText("The well is ancient, its stones carved with symbols that seem to shift\nwhen not directly looked at. An inscription glows faintly:", 30);
            Thread.sleep(1200);
            GameUtils.printRunningText("\n++-- To uncover the truth, one must face reflection. Beneath the mask, all shadows are laid bare. --++\n\nWithout the Candle's light, the Player feels a twinge of doubt.\nBut the pendant's glow intensifies, guiding them closer.", 30);

            GameUtils.printRunningText("\nThe journey has only just begun.\nWhat lies beneath the Well of Mask?",30);
            Thread.sleep(1500);
            GameUtils.clearConsole();

            GameUtils.printRunningText("", 0);
            GameUtils.printRunningText(player.getName() + ": My body feels different, I think this Deepwood Memories artifact\ngave me a boost", 30);
            System.out.print("\nYour Health: "+player.getHealth() + " --> ");
            player.setHealth(300);
            System.out.print(player.getHealth());
            Thread.sleep(1200);
            GameUtils.printRunningText("\n\n"+player.getName() +" stands before the ancient well, the\nsymbols carved into the stone shimmer. The pendant around their neck pulses with a rhythmic\nglow, almost like a heartbeat. ", 30);

            GameUtils.printRunningText("\nAs they lean over the well's edge, the darkness within seems to\nripple, and a voice soft, almost sorrowful rises from the depths.\n\n???????: What you seek is hidden behind a thousand faces\n\nA choice presents itself:", 30);
            System.out.println("\n1. Descend into the well\n2. Examine the Symbols More Closely");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            while (choice > 2 || choice < 1) {
                System.out.println("Select on the 2 options only!");
                System.out.print("Choice: ");
                choice = sc.nextInt();
                sc.nextLine();
            }

            if (choice == 1) {
                GameUtils.printRunningText("\n\n"+player.getName()+" climbs down, each step echoing into the void. As they descend, the air\nthickens with unseen tension. Strange visions flicker at the edge of\ntheir sight echoes of the past, or glimpses of a future yet to come?\n", 30);
            } else if(choice == 2) {
                GameUtils.printRunningText("\nThe symbols glow brighter, and "+player.getName()+"'s mind floods with fragmented memories.\n", 30);
                Thread.sleep(1200);
                GameUtils.printRunningText("Someone pushed you down!\n" + player.getName() +": WOOOAHHHH!!! OUCHHH!", 30);
                player.takeDamage(30);
                System.out.println("\nYour Health now: " + player.getHealth());
            }
            Thread.sleep(1800);
            GameUtils.clearConsole();
        } catch (Exception e) {
            System.out.println("Chapter Two is not loading!");
        }
    }

    public void toTheWell(){
        try {
            GameUtils.printRunningText("\n\nThe well's interior is larger than it seemed a spiraling\nstone staircase that winds deeper than logic should allow.\n\nEchoing Voice: Every face tells a story. Every mask hides a truth.\n", 30);

            GameUtils.printRunningText(player.getName()+": What's that???? It's so creepy here\n", 30);
            GameUtils.printRunningText("Suddenly, the ground beneath gives way, and you plummet into\ndarkness. When you land, the surroundings have changed.\nAn underground cavern, lit by bioluminescent fungi casting ghostly shadows.\n", 30);

            GameUtils.printRunningText("\nIn the center of the cavern, a pool of still water reflects their\nimage... but something is wrong. The reflection smiles back, though\nthey haven't moved.", 30);

            GameUtils.printRunningText("\t\t\t\t---++--- The Reflection ---++---\n\n", 30);
            GameUtils.printRunningText("To pass you must face yourself. Are you ready to see what lies behind\nyour own mask?\n\nThe reflection steps out of the pool, solidifying into a doppelgänger.", 30);

            System.out.println("A choice present in front of reflection: ");
            System.out.println("--> Ignore \n--> Communicate ");
            System.out.print("Choice: ");
            String choice = sc.nextLine().trim().  toLowerCase();

            while (!choice.equalsIgnoreCase("ignore")&& !choice.equalsIgnoreCase("communicate")) {
                System.out.println("Invalid action, try again to proceed the story!\n");
                System.out.print("Choice: ");
                choice = sc.nextLine().trim().toLowerCase();
            }

            if (choice.equalsIgnoreCase("ignore")) {
                ignoreReflection();
                GameUtils.printRunningText(player.getName() + ": It might be luck that, I'm alive.\n\n/*Took a deep breath before walking*/", 30);
            } else if (choice.equalsIgnoreCase("communicate")){
                communicateReflection();
            }
            
            GameUtils.printRunningText(player.getName() + " continued to explore the well that looks like  labyrinth and found the exit.", 30);
            Thread.sleep(1245);
            GameUtils.clearConsole();
            labyrinthWellExit();
            Thread.sleep(1500);
            GameUtils.clearConsole();
            System.out.println();
            GameUtils.printRunningText("\nThe door opens! As the final tile clicked into place beneath her feet, a soft hum\nechoed through the labyrinth.\n\n" + player.getName() + " took a deep breath, clutching the pendant Amara had entrusted\nto her. A faint warmth emanated from it.\n\nShe stepped through the threshold, and the door closed silently behind\nher, leaving only darkness and the soft echoes of her footsteps.\n\n", 30);
            Thread.sleep(1500);
            GameUtils.clearConsole();
            GameUtils.printRunningText("\t\t\t\t++-- The Plain of Echoes --++", 30);
            GameUtils.printRunningText("\n\nEmerging from the underground passage. In an open expanse known as the\nPlain of Echoes. The air shimmered with a faint, ethereal light,\nand the mist covered the ground.\n\nShapes seemed to dance within the fog... illusions, memories,\nor perhaps spirits from a bygone era.\n\nSuddenly, a whisper carried on the wind:", 30);
            Thread.sleep(1200);
            GameUtils.printRunningText("\t\t\t\t-- Seek the Well of Masks, where truth hides behind illusion. --\n\n", 30);
            Thread.sleep(1200);
            GameUtils.printRunningText("Her pendant pulsed, casting a soft glow that\nilluminated the path forward.\n"+player.getName() + " continued to venture the plains and encountered someone.\n\nA mysterious wanderer dressed in faded robes with patches of ancient symbols.\nThe face is partially obscured by a mask resembling a bird's\nbeak, with faint runes etched along the edges. They are tall and\nslender, moving with quiet grace.", 30);

            GameUtils.printRunningText("\n\nThe figure appears from the mist, walking calmly toward " +player.getName() + ".\n"+player.getName()+ " approaches it, the figure stops and tilts their head slightly, as if observing them intently.\n\n" , 30);
            Thread.sleep(2000);
            GameUtils.clearConsole();
            System.out.println("\n");
            GameUtils.printRunningText("??????: Ah, you've come. Few reach the Well of Masks without aid.\nThe echoes... they test us all, but you have something special within you.", 30);
            Thread.sleep(1200);
            GameUtils.printRunningText("\n\nThe name's Aelor,\n/*Your pendant pulses slightly.*/\nAelor: The stone you carry... It calls to something ancient, something buried\nbeneath this plain. But beware. The Well is not simply a place it is a trial.\n\n", 30);
            int exit;
            do {
                System.out.println("Do you want: ");
                System.out.println("[1] Ask Aelor about the Well of Masks");
                System.out.println("[2] Ask why Aelor is here");
                System.out.println("[3] Exit");
                System.out.print("Choice: ");
                exit = sc.nextInt();

                switch (exit) {
                    case 1:
                        GameUtils.printRunningText("\n\nAelor: The Well of Masks… a place where faces are lost and truths are\nhidden. Many who sought it left their true selves behind, trapped in\nthe illusions of the past.\nBut perhaps you are different. You must\nlearn the secret of the masks, not with your eyes, but with your heart.", 30);
                        Thread.sleep(2000);
                        GameUtils.clearConsole();
                        break;
                    case 2:
                        GameUtils.printRunningText("\n\nAelor: I have no true allegiance, only the whispers of the past to guide me.\nI walk these plains not by chance, but by choice. We are both here\nbecause we must be. The echoes call to us all,\nbut it is your path to walk, not mine.", 30);
                        Thread.sleep(2000);
                        GameUtils.clearConsole();
                    break;
                    case 3:
                        System.out.println("");
                        Thread.sleep(2000);
                        GameUtils.clearConsole();
                    break;
                    default: System.out.println("Invalid! The shadows will eat you! Try again!");
                        break;
                }
            } while (exit != 3);
            System.out.println("");
            GameUtils.printRunningText("\n\nThe fog in the Plain of Echoes thickens as " + player.getName() + " continues their journey,\neach step seeming to echo louder than the last. The whispers grow\nalmost deafening, swirling around in the mist like lost souls trapped between worlds.\n\nThe soft glow of the pendant remains their only guide.\n\nAelor's voice cuts through the disorienting sounds, steady and calm.", 30);

            GameUtils.printRunningText("\n\nAelor: The Well of Masks waits for those who are ready to confront themselves.\nAelor disappears once more into the mist.\n\n"+player.getName() + " Ventures deeper, the land seems to shift beneath their feet.\nThe ground becomes uneven.\n\nAt the center stands a massive, stone well, its surface dark and\nstill, like the depths of a forgotten dream.", 30);

            Thread.sleep(2000);
            GameUtils.clearConsole();

            GameUtils.printRunningText("\t\t\t\t**---- ++ The Well of Mask ++ ----**\n\n", 30);
            Thread.sleep(1200);
            GameUtils.printRunningText("As " + player.getName() + " approaches the well,the pendant grows warmer in their hand.\nThe faint light from the stone flickers, casting eerie shadows on the stone surface.\n\nIt seems the well has some kind of weird energy.\n\n", 30);      
            GameUtils.printRunningText("Around the well are several masks, placed on pedestals,\nsome are delicate and intricate, while others are plain, weathered by time.\n\n", 30); 
            
            GameUtils.printRunningText(player.getName()+ " stands before the well, surrounded by the pedestals with masks.\nThe mist thickens, and the symbols on each mask blur,\nmaking their designs indistinguishable.\n\n", 30);
            GameUtils.printRunningText("Aelor: The masks reflect more than you can see. Choose not with your eyes,\nbut with your heart. Trust the path unseen.\n", 30);
            GameUtils.printRunningText(player.getName()+" fingers graze the surface, a surge of energy flows through them.\n", 30);
            Thread.sleep(2000);
            GameUtils.printRunningText("The choice is made, but the mask remains a mystery...", 30);
            Thread.sleep(2000);
            GameUtils.clearConsole();
            System.out.println("\n\n");
            GameUtils.printRunningText(player.getName() + " finds themselves in a shimmering, ethereal city ---Biringan.\nMarble towers glisten under an otherworldly light, and shadowy figures\ndrift through mist-laden streets.\n\n", 30);
            GameUtils.printRunningText(player.getName()+": Woah!!, Did I finished my journey?!\nWhere's Aelor?\n"+player.getName() +": Aaaeeelorrrr??? Where are you??? I did it!", 30);
            Thread.sleep(1200);

            GameUtils.printRunningText("A soft whisper echoed: You are bound to this place... Protect it...", 30);
            Thread.sleep(2000);
            GameUtils.printRunningText(player.getName()+ ": Who are you???, reveal yourself! ", 30);
            Thread.sleep(2000);
            GameUtils.clearConsole();
            System.out.println();
            GameUtils.printRunningText("\nSuddenly, the vision shatters.\nAfter "+player.getName()+" dons the mysterious mask, a surge of energy washes over them. The world around blurs, and for a fleeting moment, they're no longer in the Well of Masks.\n\n", 30);

            GameUtils.printRunningText("As the vision of Biringan fades, " + player.getName() + " turns to Aelor, but\nsomething feels different. The guide's form shimmers,\ngrowing translucent.\n\nAelor: Our paths diverge here. Trust your journey... and the mask.\n\n", 30);
            Thread.sleep(1590);
            GameUtils.printRunningText(player.getName()+ ": Hey! Where are you going?! Not again... please!", 30);
            Thread.sleep(1000);
            GameUtils.printRunningText("\n\nBefore the Player can respond, Aelor dissolves into a swirl of mist,\nleaving only the echo of their final words lingering in the air.\nThe well stands silent, the path forward uncertain yet inevitable.", 30);
            Thread.sleep(2000);
            GameUtils.clearConsole();
        } catch (Exception e) {
            System.out.println("The well eats you! ERROR!");
        }
    }

    public void chapterTwoEndingLines(){
        try {
            System.out.println();
            bag.addItem("Mask Of Well");
            System.out.println("The mask has been equipped!");
            bag.itemList();
            System.out.print("\nYour health: "+player.getHealth() + " --> ");
            player.setHealth(400);
            System.out.print(player.getHealth());
           GameUtils.printRunningText("\nJourney Continues...", 30);
            Thread.sleep(1800);
            
            GameUtils.printRunningText("\t\t\t\t--++ CHAPTER TWO CLEARED! ++--", 30);
            Thread.sleep(2200);
            GameUtils.clearConsole();
        } catch (Exception e) {
           System.out.println("Ending ends! Error!");
        }
    }
    public void ignoreReflection(){
        try {
            Thread.sleep(1200);
            GameUtils.clearConsole();
            GameUtils.printRunningText("\n\nReflection: You think silence will shield you? Turning away changes\nnothing. The shadows you ignore will find you.", 30);
            GameUtils.printRunningText("\nThe ground trembles slightly. The reflection's voice grows louder,\nmore insistent, now coming from all around the cavern.\n", 30);
            GameUtils.printRunningText("Reflection: You cannot escape yourself. Every step away is a step deeper into the void.\n", 30);
            GameUtils.printRunningText(player.getName() +": Leave me alone! Don't fool me!\n\nThe walls ripple like water, the exit fading into darkness.\n/*SkrartFrgyTTTtt*/\n/*EeeEEECkKKKKKKKKK*/\n/*CAAAAAAAAAWWWWWWWWWWWWWWWWWWWWWW*/\n\nReflection: What are you hiding from?\nWithout truth, Biringan is lost. Without understanding, you are lost.\n", 30);

            GameUtils.printRunningText(player.getName() + " fell in a hole while running from the voice!", 30);
            Thread.sleep(1800);
            GameUtils.clearConsole();
            GameUtils.printRunningText("Something is appearing!", 30);
            System.out.println("Your Health: " + player.getHealth());
            String riddleTwoAnswer = "Light";
            Riddles.riddleTwo();
            String secondAnswer;
            int counter = 0;
            do{
                System.out.print("\nEnter answer: ");
                secondAnswer = sc.nextLine().trim().toLowerCase();

                if(secondAnswer.equalsIgnoreCase(riddleTwoAnswer)){
                    GameUtils.printRunningText("\nMuddy Shadow wrote something!\n", 30);
                    Thread.sleep(1234);
                    GameUtils.printRunningText("Congratulations on passing the 2nd Riddle!", 30);   
                    break;
                } else {
                    counter++;
                    System.out.println("\ngArgawgrgAIOWWWroNggg!");
                    System.out.println("\nBe careful on your answer! This well is haunted!");
                }

                if(counter == 3){
                    System.out.println("First Hint: L");
                    player.takeDamage(20);
                    
                } else if (counter == 6){
                    System.out.println("Second Hint: i");
                    player.takeDamage(20);
                    
                } else if (counter == 9){
                    System.out.println("Third Hint: g");
                    player.takeDamage(20);
                } 
                System.out.println("Your Health: " + player.getHealth());
                
                if (counter >= 10){
                    counter = 0;
                    Thread.sleep(1000);
                    GameUtils.clearConsole();
                    Riddles.riddleTwo();
                }

                if(player.getHealth() <= 0){
                    System.out.print("\nYou are dead!\n1. Resurrect\n2. End Game\nDo you want to: ");
                    int chancesNumberOne = sc.nextInt();
                    sc.nextLine();
                    int revive = GameUtils.getResurrectionChances();
                    while (chancesNumberOne > 2 || chancesNumberOne < 0) {
                        System.out.print("Invalid choice!\nDo you want to: ");
                        chancesNumberOne = sc.nextInt();
                        sc.nextLine();
                    }
                    
                        if(chancesNumberOne == 1){
                            if(revive == 0){
                                System.out.println("No chances left!");
                                gameEngine.gameOver();
                            } else {
                                GameUtils.attemptResurrection(player);
                                continue;
                            }
                        }
                        else if (chancesNumberOne == 2){
                        gameEngine.gameOver();
                        break;
                    }
                }

            }while(!secondAnswer.equalsIgnoreCase(riddleTwoAnswer));
            Thread.sleep(1500);
            GameUtils.printRunningText("\nThe hole lit up and showed a path!", 30);
            GameUtils.printRunningText(player.getName() + ": Woahh, I think i'm having a de javu", 30);
            Thread.sleep(1500);
            GameUtils.clearConsole();

            
        } catch (Exception e) {
            System.out.println("Reflection eats your code! ERROR!");
        }
    }

    public void communicateReflection(){
        try {
            Thread.sleep(1200);
            GameUtils.clearConsole();
            
            GameUtils.printRunningText("\nReflection: You seek answers, yet all you find is your face. What do you hope to\nsee beyond this mask?\n", 30);
            GameUtils.printRunningText(player.getName()+": I want to know the truth about Biringan. My grandmother's words led\nme here she said Id find my purpose.\n\nReflection: Purpose? The purpose is a shadow, shifting with each step you take.\nBiringan's truth is hidden not in the world but within you.\nAre you ready to see it?\n", 30);

            GameUtils.printRunningText(player.getName()+": What do you mean? My path is clear. I need to find the lost\ncity and protect it.\n\n\nReflection: Clarity is a mask, too. You wear the hopes of others, but have you\nfaced the weight of your own destiny?\nBiringan is not a destination it is a mirror of the soul.\n", 30);

            GameUtils.printRunningText(player.getName()+ ": I don't understand... Why did Amara send me here? Why the pendant?\n\nReflection: The pendant is a key, yes, but not to a door. To memories yours and\nhers. Pieces of a forgotten past. The Well of Mask reveals what the world hides.\n\n"+player.getName() +": Show me. I'll face whatever it takes.\n\nThen look deeper. This is the first step not to find\nBiringan, but to remember it.\n\nThe reflection fades, leaving a whisper in the air:\n\n\t\t\t\t*-- Find the three seals. Only then will the mask fall away. --*", 30);
            Thread.sleep(1230);
            GameUtils.clearConsole();

        } catch (Exception e) {
            System.out.println("Reflection eats your code! ERROR!");
        }
    }

    public void labyrinthWellExit(){
        try {
            System.out.println();
            GameUtils.printRunningText(player.getName()+ " reaches the end of the labyrinth, but something is blocking the door.\n\nIn front of the door lies a grid of 3x3 stone tiles, each inscribed\nwith a symbol of light or shadow.\nA faint inscription glows above the door:\n\n", 30);
            GameUtils.printRunningText("Inscription:\nBalance the path, where light meets shadow.\nTwo must stand as one, or the way remains closed.\n", 30);
            Thread.sleep(2000);

            System.out.println("Puzzle Objective:\n"+player.getName() + " must step on the tiles in the correct order to open the door.\nThe pattern follows a sequence where they must alternate between light\nand shadow symbols, starting and ending with light.\n\n");

            char[][] grid = {
                {'L', 'S', 'L'},
                {'S', 'L', 'S'},
                {'L', 'S', 'L'}
            };

            boolean[][] visited = new boolean[3][3];
            int row = 0, col = 0;
            int tilesVisited = 1; 
            visited[row][col] = true;
            System.out.println("You are standing at the Light tile (0, 0).");
            

            System.out.println("Objective: Move through the grid, alternating between Light (L) and Shadow (S) tiles.");
            System.out.println("Enter your moves as 'up', 'down', 'left', or 'right'.");

            char lastTile = 'L';

            while (tilesVisited < 9) { 
                printGrid(grid, row, col, visited);
                System.out.print("Move: ");
                String move = sc.nextLine().toLowerCase();
    
                // update position 
                int newRow = row, newCol = col;
                switch (move) {
                    case "up": newRow--; break;
                    case "down": newRow++; break;
                    case "left": newCol--; break;
                    case "right": newCol++; break;
                    default:
                        System.out.println("Invalid move. Try again.");
                        continue;
                }
    
                if (newRow < 0 || newRow >= 3 || newCol < 0 || newCol >= 3) {
                    System.out.println("You can't move outside the grid. Try again.");
                    continue;
                }

                // boundary check great wall of china
                if (!hasValidMoves(row, col, lastTile, visited, grid)) {
                    System.out.println("No valid moves left! Puzzle reset.");
                    labyrinthWellExit();  // Restart the puzzle
                    return;
                }
    
                // if visited check true
                if (visited[newRow][newCol]) {
                    System.out.println("You've already visited this tile. Try again.");
                    continue;
                }
    
                // Validate alternation of tiles
                char currentTile = grid[newRow][newCol];
                if ((lastTile == 'L' && currentTile != 'S') || (lastTile == 'S' && currentTile != 'L')) {
                    System.out.println("You broke the sequence! The grid resets!");
                    visited = new boolean[3][3]; 
                    visited[0][0] = true;       
                    row = 0;
                    col = 0;
                    tilesVisited = 1;
                    lastTile = 'L';
                    continue;
                }
    
                // update position
                row = newRow;
                col = newCol;
                visited[row][col] = true;
                lastTile = currentTile;
                tilesVisited++;
                
                System.out.println("You stepped on a " + (currentTile == 'L' ? "Light" : "Shadow") + " tile.");
            }
            GameUtils.printRunningText("\nCongratulations! You've balanced the light and shadow. The door opens.", 30);
         
        } catch (Exception e) {
            System.out.println("The shadows ate your code! ERROR!");
        }
    }

    private boolean hasValidMoves(int row, int col, char lastTile, boolean[][] visited, char[][] grid) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};  
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3 && !visited[newRow][newCol]) {
                char nextTile = grid[newRow][newCol];
                if ((lastTile == 'L' && nextTile == 'S') || (lastTile == 'S' && nextTile == 'L')) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void printGrid(char[][] grid, int playerRow, int playerCol, boolean[][] visited) {
        System.out.println("\nCurrent Grid:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == playerRow && j == playerCol) {
                    System.out.print("[P] "); 
                } else if (visited[i][j]) {
                    System.out.print(" " + grid[i][j] + "  "); 
                } else {
                    System.out.print(" *  "); 
                }
            }
            System.out.println();
        }
    }
}
