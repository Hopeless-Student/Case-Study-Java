import java.util.Random;
import java.util.Scanner;

public class GameRoom {
    private Scanner sc;
    private Bag bag;
    private GameBoy player;
    private GameEngine gameEngine;

    public GameRoom(Scanner sc, Bag bag, GameBoy player, GameEngine gameEngine) {
        this.sc = sc;
        this.bag = bag;
        this.player = player;
        this.gameEngine = gameEngine;
    }

    public void roomOne() {
        try {
            System.out.println("\n\n");
            GameUtils.printRunningText(player.getName() + " stands at the edge of the dense forest, holding their grandmother's pendant.\nThe sun is setting, casting an orange glow through the trees.", 40);
 
            GameUtils.printRunningText("\nThe lost city of Biringan calls to you. Mysteries and challenges await some that test the mind,\nothers that test the heart.\n\nChoose wisely, for every decision shapes your destiny. Good luck!", 40);
            Thread.sleep(2000);
            GameUtils.clearConsole();
         } catch (Exception e) {
             System.out.println("Error Delay!");
         }
    }

    public void chapterOneStory(){
       try {
            System.out.println("\t\t\t\t*------++---//---++---//---++------*");
            GameUtils.printRunningText("\t\t\t\t| Chapter 1: The Forest Entrance   |", 50);
            System.out.println("\t\t\t\t*------++---//---++---//---++------*");
            Thread.sleep(1000);

            // System.out.println("\n");
            // GameUtils.printRunningText(player.getName() +" steps into the forest. The path quickly fades away, leaving them surrounded by\ntowering trees and tangled undergrowth. The pendant glows faintly, and they notice a moss-covered stone obelisk.", 30);
            
            GameUtils.printRunningText("\n"+player.getName()+ ": Woaahh, what's that?? /*"+ player.getName()+ " touched the stone!", 50);
            Thread.sleep(1200);
            GameUtils.clearConsole();

            System.out.println("\n");
            System.out.println("\t\t\t\t*---------++*++---------*");
            GameUtils.printRunningText("\t\t\t\t|Stone Guardian Obelisk |", 50);
            System.out.println("\t\t\t\t*---------++*++---------*");

            // GameUtils.printRunningText("The Stone Guardian appeared!\nStonde Guardiain Obelisk: To seek what's lost, the right path find.\nThrough riddles hidden in the mind. Follow the trail where shadows blend,\nA question's answer marks the journey's end.", 30);
            
            GameUtils.printRunningText("\nLeft: Follow the trail of merging shadows.\nRight: Ignore the riddle and try to find their own way.", 0);
            System.out.print("Choice: ");
            String choice = sc.nextLine().trim().toLowerCase();

            while (!choice.equalsIgnoreCase("left")&& !choice.equalsIgnoreCase("right")) {
                System.out.println("Invalid action, try again to proceed the story!\n");
                System.out.print("Choice: ");
                choice = sc.nextLine().trim().toLowerCase();
            }

            if(choice.equalsIgnoreCase("Left")){
                // GameUtils.printRunningText("\nThe shadows guide you deeper in trial path", 30);
                // GameUtils.printRunningText("\nThe air grows cooler, the silence more profound.\nThere's something unsettling about the path, yet\ntheir curiosity pulls them deeper into the forest.\nThe trees grow taller, their gnarled branches weaving together like ancient fingers.", 30);

            } else if(choice.equalsIgnoreCase("Right")){
                // GameUtils.printRunningText(player.getName()+": What if it's a trick?\n", 20);
                // player.takeDamage(10);
                // GameUtils.printRunningText("\nA faint laugh echoes from the trees, but it's not a friendly one.", 50);
                // GameUtils.printRunningText("\nA few sharp leaves flew towards you!", 30);
                // System.out.println("Your health is now: " + player.getHealth());
                // GameUtils.printRunningText(player.getName()+": Ouch!, that hurts you crazy forest!\nYou walk directly from shadows...", 30);
            }

            // GameUtils.printRunningText("\nAn ethereal light that flickers like a will-o-the-wisp, beckoning you towards it.\nYour pendant is glowing!", 50);
            Thread.sleep(1500);
            GameUtils.clearConsole();
            Riddles.riddleOne();
            String riddleOneAnswer = "Candle";
            String firstAnswer;
            int counter = 0;
            do {
                System.out.print("Enter answer: ");
                firstAnswer = sc.nextLine().trim().toLowerCase();
                if(firstAnswer.equalsIgnoreCase(riddleOneAnswer)){
                    GameUtils.printRunningText("\nGastly Spirit: Congratulations on passing the 1st Riddle!", 40);      
                    break;
                } else {
                    counter++;
                    System.out.println("Wrong!");
                }
                if(counter == 3){ System.out.println("First Hint: C");}
                else if (counter == 6){ System.out.println("Second Hint: a");}
                else if (counter == 9){ System.out.println("Third Hint: n");}
                else if(counter == 10){ 
                    player.takeDamage(5); System.out.println("\nRemember the lights out! The flames are burning you slowly!\nYour health is now: " + player.getHealth()); 
                    counter = 0;
                    Thread.sleep(1000);
                    GameUtils.clearConsole();
                    Riddles.riddleOne();
                }
                
            } while (!firstAnswer.equalsIgnoreCase(riddleOneAnswer));

            // GameUtils.printRunningText("\nGastly Spirit: Since you answered it correctly,\nI'll give you a candle that will guide you through this forest! Good luck, " + player.getName() + "!", 40);
            // bag.addItem(riddleOneAnswer);
            
            // GameUtils.printRunningText("\nTalking Candle: Hello, " + player.getName() + ", I'll accompany you through this wild crazy forest!", 30);
            // Thread.sleep(1500);
            // GameUtils.clearConsole();
            
       } catch (Exception e) {
            System.out.println("Error delay!");
       }
    }

    public void forestJourney(){
        try {
            System.out.println();
            GameUtils.printRunningText(player.getName() +" correctly answers the riddle of the ghastly spirit\nand they continue to walk through the forest while having a conversation.\n", 30);
            GameUtils.printRunningText(player.getName() + ": Wow, a talking candle! I thought it only\nexisted in Grandma's stories!", 40);
            GameUtils.printRunningText("\nThe candle: Wait, who is your grandma? How did she knew about us?\n"+ player.getName()+": My Grandma's name is Amara. She always tells us some awesome stories.", 40);
            GameUtils.printRunningText("Some of them involve ancient mysteries, spirits, and a hidden kingdom.\n\nThe candle: Amara, amara, amara, hmmmm... \n/*The shiny black pendant shines a little bit*/", 40);
            GameUtils.printRunningText("The candle: Sounds familiar, I know I heard that name somewhere... \n", 40);
            GameUtils.printRunningText(player.getName()+": She passed not too long ago from old age.\nShe gave me this necklace and said that\nthe Biringan is real and it exists.", 40);
            GameUtils.printRunningText("\nThe Candle: Aww sorry to hear that, I hope she rest in peace.\n\n" + player.getName()+": Thank you, I do hope she rests well.\n\nThe candle: I'm sure she's guiding you up there\nKnowing that, cheer up, we can do this!", 30);
            GameUtils.printRunningText("\n\n/*"+player.getName()+" smiles and proceed to walk*/\nThe Candle: Hurry up so we don't disturb the big bad forest!\n", 40);
            Thread.sleep(1200);
            GameUtils.clearConsole();
            GameUtils.printRunningText("Two days have passed since "+ player.getName()+" entered the forest, and the candle helps in providing\ninfo on what to eat in the forest. Candle helps to create a wooden sword\nfor protection and cast a durability spell. It was a smooth journey as you hope....", 40);
            GameUtils.printRunningText("\n\nNearing the edge of the forest a group of vines started to move.\nSuddenly, the ground trembled. The soft rustle of leaves turned into a deep, resonant rumble. Vines, twisted and ancient, slithered across\nthe forest floor like serpents, coiling\nand stretching toward the sky.", 40);
            GameUtils.printRunningText("\nIt towered over the "+ player.getName()+" the forest's guardian given form.\nA deep, guttural voice echoed through the trees.", 40);
            GameUtils.printRunningText("\n\n?????: You dare leave without facing me?\n??????: GRAAAAAARRRRRWWWR", 40);
            Thread.sleep(1500);
            GameUtils.clearConsole();
        } catch (Exception e) {
            System.out.println("Something went wrong with the forest!");
        }
    }
   
    public void forestGuardianFight(){
        try {
            
            // GameUtils.printRunningText("The Candle: This is... We're not alone anymore!", 30);
            // GameUtils.printRunningText("\nThe air grows heavy as you approach the clearing. A sudden gust of wind howls through the trees,\ncarrying a strange, unsettling scent. The ground beneath your feet trembles slightly as\nif something enormous is drawing near.", 30);
            Thread.sleep(1000);
            // GameUtils.printRunningText("\nIn the center of the clearing stands a towering figure, draped in shadow. Its eyes glow with an unnatural light as it turns to face you.\nThe forest itself seems to hold its breath...\n", 30);
            // Thread.sleep(1500);
            Boss.chapterOneBoss(); // Boss Name
            Boss tharnmaw = new Boss("Tharnmaw",200); // Set BOSS Chap 1
            int choice;
            String[] bossAttacks = {
            "\nThe Forest Warden raises its hand, preparing a mighty blow!", 
            "\nTharnmaw let out a scream that damages you!", 
            "\nA shiny gem sparks in Tharnmaws body!",
            "\nThe ground is shaking, Tharnmaws about to attack from below!"
            };
            int attackCounter = 0;
            String[] taunts = {
                "\nYou are weak, mortal!",
                "\nIs that all you've got?",
                "\nI will crush you!",
                "\nPrepare for your end!"
            };
            
            do {
                Thread.sleep(1650);
                GameUtils.clearConsole();
                System.out.println("\n----*/*/*/*/*/*/*/----");
                System.out.println("Your Health: "+player.getHealth());
                System.out.println("Tharnmaw's Health: " + tharnmaw.getBossHealth());
                System.out.println("----*/*/*/*/*/*/*/----");

                Random rand = new Random();
                int attackChoice = rand.nextInt(3);
                attackCounter++;
                switch (attackChoice) {
                    case 0:
                    System.out.println(bossAttacks[0]);
                        break;
                    case 1:
                    System.out.println(bossAttacks[1]);
                        break;
                    case 2:
                    System.out.println(bossAttacks[2]);
                    break;
                    case 3:
                    System.out.println(bossAttacks[3]);
                    break;
                    default: System.out.println("Error Boss Dialouge");
                        break;
                }
                if (attackCounter == 3) {
                    System.out.println("\n" + tharnmaw.getBossName() + ": You dare challenge me? Feel my wrath!");
                } else if (attackCounter == 6) {
                    System.out.println("\n" + tharnmaw.getBossName() + ": I'm done playing games! Prepare to meet your end!");
                } else if (attackCounter >= 9) {
                    System.out.println("\n" + tharnmaw.getBossName() + ": Enough! I will crush you with my full power!");
                }

                System.out.println("\nDo you want to:");
                System.out.println("1. Dodge");
                System.out.println("2. Attack");
                System.out.println("3. Jump");
                System.out.println("4. Attack with your special skill");
                System.out.print("Choice: ");
                choice = sc.nextInt();

                while (choice > 4 || choice < 1) {
                    System.out.println("Select on the 4 options only!");
                    System.out.print("Choice: ");
                    choice = sc.nextInt();
                }
                
                Random rand2 = new Random();
                int playerLuck = rand2.nextInt(15);
                switch (choice) {
                    case 1:
                    if (attackChoice == 2) {
                        System.out.println("\nThere's nothig to dodge, you missed your chance!");
                    } else {
                        if (playerLuck % 2 == 0) {
                            System.out.println("\nYou dodge the attack!");
                        } else {
                            System.out.println();
                            if(attackChoice == 3){
                                player.takeDamage(15);
                                System.out.println("\nDodge failed! You received 15 damage!");
                                System.out.println(taunts[rand.nextInt(taunts.length)]);
                            } else {
                                player.takeDamage(10);
                                System.out.println("\nDodge failed! You received 10 damage!");
                                System.out.println(taunts[rand.nextInt(taunts.length)]);
                            }
                            
                        }
                    }
                        break;
                    case 2:
                        if (playerLuck % 2 == 0) {
                            System.out.println("\nYou attack using your sword!\nHiYyYYyAAAH!\nYou landed 25 damage!");
                            tharnmaw.takeDamage(25);
                            System.out.println("\nTharnmaw: UghHh, you insolent fool!");
                        } else if(playerLuck == 6 || playerLuck == 9){
                            System.out.println("\nYou landed a critical hit!");
                            tharnmaw.takeDamage(70);
                        } 
                        else {
                            System.out.println("\n"+tharnmaw.getBossName() + " dodges your attack! Grrr, you dare to attack me?!?!?!");
                            player.takeDamage(playerLuck);
                            System.out.println(tharnmaw.getBossName() + " reflect your attack!");
                            System.out.println("You received "+ playerLuck +" damage!");
                            System.out.println(taunts[rand.nextInt(taunts.length)]);
                        }
                        
                    break;
                        
                    case 3: 
                    if (attackChoice == 2) {
                        System.out.println("\nThere's nothig to dodge, you missed your chance!");
                    } else {
                        if (playerLuck % 2 == 0) {
                            System.out.println("\nYou jump through the attack and dodge!");
                        } else {
                            System.out.println();
                            if(attackChoice == 3){
                                player.takeDamage(15);
                                System.out.println("\nDodge failed! You received 15 damage!");
                                System.out.println(taunts[rand.nextInt(taunts.length)]);
                            } else {
                                player.takeDamage(10);
                                System.out.println("\nDodge failed! You received 10 damage!");
                                System.out.println(taunts[rand.nextInt(taunts.length)]);
                            }
                        }
                    }
                    break;
                    case 4:
                    if(tharnmaw.getBossHealth() > 80){
                        System.out.println("\nSpecial skill not yet available!");
                        player.takeDamage(20);
                        System.out.println("You idiot! What are you doing?!");
                        System.out.println("\nYou received 20 damage!");
                        System.out.println(taunts[rand.nextInt(taunts.length)]);
                    } else {
                            Thread.sleep(1200);
                            GameUtils.clearConsole();
                            GameUtils.printRunningText("\nWith a shiny glow from pendant, your sword radiate a burning light!", 30);
                            GameUtils.printRunningText("Novaaa Flameeee!", 30);
                            tharnmaw.takeDamage(60);
                    }
                    break;
                    default: System.out.println("Invalid Choice!");
                        break;
                }
                if(player.getHealth() <= 0){
                    System.out.print("\nYou are dead!\n1. Resurrect\n2. End Game\nDo you want to: ");
                    int chancesNumberOne = sc.nextInt();
                    int revive = GameUtils.getResurrectionChances();
                    while (chancesNumberOne > 2 || chancesNumberOne < 0) {
                        System.out.print("Invalid choice!\nDo you want to: ");
                        chancesNumberOne = sc.nextInt();
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
                        GameUtils.printRunningText("\nYou were defeated by " + tharnmaw.getBossName() + ". Better luck next time!", 30);
                        gameEngine.gameOver();
                        break;
                    }
                }

                if(tharnmaw.getBossHealth() <= 0){
                    GameUtils.printRunningText(tharnmaw.getBossName()+ ": AAAAAAARGGGGGGHHHHHHH!", 30);
                    GameUtils.printRunningText("\nYou have defeated " + tharnmaw.getBossName() + "!", 30);
                    GameUtils.printRunningText(tharnmaw.getBossName() + ": Impossible... How could I be defeated by you...?", 30);
                    Thread.sleep(1800);
                    GameUtils.clearConsole();
                    break;
                }
            } while (player.getHealth() > 0 && tharnmaw.getBossHealth() > 0);
            

        } catch (Exception e) {
            System.out.println("The monster eat your method of fighting!");
        }
    }

    public void postGuardianStory(){
        try {
            GameUtils.printRunningText("\n/*The defeated warden speaks lightly\nTharnmaw: You... the child who carries a burden...", 30);
            GameUtils.printRunningText("\n\nThe ground trembles as the Forest Warden collapses, its\ncolossal form splintering into countless vines and roots that retreat into the earth.", 30);
            GameUtils.printRunningText("\n"+player.getName()+" approaches the fallen guardian, and among the tangled remains,\nyou discover a glowing shard, an essence of the forest,\npulsating with a soft, emerald light.\n\nThe pendant hums in response, absorbing the shard.\n", 30);

            GameUtils.printRunningText(player.getName() + " couldn't find the candle while looking left and right.\n"+ player.getName()+ ": Hey Candle! Where are you?\n\n", 30);
            GameUtils.printRunningText("Your sword flickers brightly\n/*The voice of the talking candle speaks to you in weak manner.", 30);

            GameUtils.printRunningText("The Candle: Hey... you did it... *SkrPOp*\nThe candle life is withering\n"+ player.getName() + ": What's happening to you? Are you okay?\nThe Candle: I secretly... fuse with your... sword through the pendant's power... Aren't I.. coo...l? Hehe...\n", 30);
            Thread.sleep(1240);
            GameUtils.clearConsole();
            GameUtils.printRunningText("\nThe candle's essence left the sword and vanished into thin air.", 30);
            GameUtils.printRunningText(player.getName() + " sobs after knowing the truth. Though a short period of time, they still became friends...\n\nAfter mourning, "+ player.getName() + " continue the journey leaving the shadow of the forest behind,\nthe echoes of their battle fading into legend as they face the unknown beyond.", 30);
            
            bag.inventory.remove("Candle");
            System.out.println("\nCandle vanished from bag items\n");
            GameUtils.printRunningText("Obtained Deepwood Memories set of artifacts!\nLabyrinth Wayfarer has been equipped!\nLaurel Coronet has been equipped!", 30);
            GameUtils.printRunningText("\nSword has been upgraded!", 30);
            bag.addItem("Sapwood Blade");
            bag.addItem("Honey Fruit");
            bag.addItem("Shield of Vines");
            bag.itemList();
            player.setHealth(100);
            
            System.out.println();
            GameUtils.printRunningText("\t\t\t\t--++ CHAPTER ONE CLEARED! ++--", 30); 
            Thread.sleep(2200);
            GameUtils.clearConsole();           
        } catch (Exception e) {
            System.out.println("Tharnmaw eat your codes! ERROR!");
        }
    }

}