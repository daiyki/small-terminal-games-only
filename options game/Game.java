import java.util.Scanner;

public class Game{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int healthPoints = 100;
        int attackPoints = 5;
        int goldCoins = 0;
        System.out.println("Welcome to the game!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Let's start the game.");
        
        // Game logic goes here
        System.out.println("Select which area to go:");
        System.out.println("1. Forest");
        System.out.println("2. Big Cave");
        System.out.println("3. Ocean");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have entered the forest.");
                break;
            case 2:
                System.out.println("You have entered the big cave.");
                break;
            case 3:
                System.out.println("You have entered the ocean.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        // forest route
        if(choice == 1){
            System.out.println("Youre walking through the forest");
            System.out.println("You keep walking...");
            System.out.println("You see a wild animal! What do you do?");
            System.out.println("1. Run away");
            System.out.println("2. Fight the animal");
            System.out.print("Enter your move: ");
            int move = scanner.nextInt();
            if(move == 1){
                System.out.println("You run away safely!");
            } 
            
            // first forest fight
            else if(move == 2){
                System.out.println("Youve dealt 5 damage to the animal!, but it attacks you back and you lose 10 health points.");
                healthPoints -= 10;
                System.out.println("You have " + healthPoints + " health points left.");
                System.out.println("The animal still has 20 health points left.");
                System.out.println("You can choose to fight again or run away.");
                System.out.println("1. Fight again");
                System.out.println("2. Run away");
                if(scanner.nextInt() == 1){
                    System.out.println("You fight again and defeat the animal!");
                    healthPoints = 80;
                    System.out.println("You have " + healthPoints + " health points left.");
                } else {
                    System.out.println("You run away safely!");
                }
            }

            System.out.println("You continued to wonder the forest.");
            System.out.println("You see a treasure chest out of nowhere! What do you do?");
            System.out.println("1. Open the chest");
            System.out.println("2. Ignore it");
            int treasureChoice = scanner.nextInt();

            // upgrade attack points if the player opens the chest
            if(treasureChoice == 1){
                System.out.println("You open the chest and find a sword!");
                attackPoints += 5;
                System.out.println("You now have " + attackPoints + " attack points.");
            } else {
                System.out.println("You ignore the chest and continue walking.");
            }
            
            // continuation of the forest route
            System.out.println("You see a cave and a river. Which one do you want to go to?");
            if(scanner.nextInt() == 1){
                System.out.println("You enter the cave and find a treasure chest!");
                System.out.println("But the chest is guarded by a monster, what do you do?");
                System.out.println("1. Fight the monster");
                System.out.println("2. Run away");
                int monsterChoice = scanner.nextInt();
                if(monsterChoice == 1){
                    System.out.println("You fight the monster and defeat it!");
                    System.out.println("You open the chest and find 50 gold coins!");
                    goldCoins += 50;
                    System.out.println("You now have " + goldCoins + " gold coins.");
                    System.out.println("You continued to explore the cave and reached the end!");
                } else {
                    System.out.println("You run away from the monster!");
                }
            }
            //river route + boss fight
            else {
                System.out.println("You enter the river and find a boat!");
                System.out.println("You use the boat to cross the river safely.");
                System.out.println("You continue your journey and find a map on the other side!");
                System.out.println("The map shows the location of a hidden treasure containing something important!");
                System.out.println("You follow the map and stumbled a giant ogre with a large club (50HP)!");
                System.out.println("What do you do?");
                System.out.println("1. Fight the ogre");
                System.out.println("2. Run away");
                int ogreChoice = scanner.nextInt();
                if(ogreChoice == 1){
                    int ogreHealth = 50;
                    while(ogreHealth > 0 && healthPoints > 0){
                        System.out.println("You attack the ogre and deal " + attackPoints + " damage!");
                        ogreHealth -= attackPoints;
                        if(ogreHealth <= 0){
                            System.out.println("You have defeated the ogre!");
                            break;
                        }
                        System.out.println("The ogre attacks you back and deals 15 damage!");
                        healthPoints -= 15;
                        if(healthPoints <= 0){
                            System.out.println("You have been defeated by the ogre!");
                            break;
                        }
                        System.out.println("Your health points: " + healthPoints);
                        System.out.println("Ogre's health points: " + ogreHealth);
                    }
                    System.out.println("You fight the ogre and youve dealth" + attackPoints + " damage to the ogre!");

                    System.out.println("You find a key inside the ogre's lair!");
                    System.out.println("The key opens the treasure chest you found earlier!");
                    System.out.println("You now have the legendary uwauwa sword + 50 gold coins!");
                    attackPoints += 10;
                    goldCoins += 50;
                } else {
                    System.out.println("You run away from the ogre and didnt get anything!");
                }
                // ending of the game
            System.out.println("You continue your journey and find a village where you can rest and heal.");
            System.out.println("You rest and heal your health points back to 100.");
            System.out.println("You now have " + healthPoints + " health points.");
            System.out.println("You continued your journey and found an island with a community of friendly villagers who welcomed you and offered you a place to stay.");
            System.out.println("You have completed the forest route and found a new home with the villagers!");
            }
        
        }

        System.out.println("Thanks for playing, " + name + "!");
        scanner.close();
    }
}