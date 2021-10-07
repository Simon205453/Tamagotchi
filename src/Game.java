import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Game {

    public static Tamagotchi pet;

    public static void choosePet(int petNum, String petName) {
        if (petNum == 1) {
            pet = new Dog(petName, 100, 1, 10, 100);
        } else if (petNum == 2) {
            pet = new Cow(petName, 100, 1, 10, 100);
        } else if (petNum == 3) {
            pet = new Cat(petName, 100, 1, 10, 100);
        } else if (petNum == 4) {
            pet = new Dragon(petName, 100, 1,  10, 100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        boolean isPetAlive = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose pet \n Type: \n 1 - Cat \n 2 - Cow \n 3 - Dog");
        int petNum = scanner.nextInt();
        System.out.println("What would you like to name your pet?");
        String flushedline = scanner.nextLine();
        String petName = scanner.nextLine();
        System.out.println("System is now building your pet ✨");
        choosePet(petNum, petName);
        System.out.println(petName + " is now ready to begin it's life in your hands" + pet);


        do {
            System.out.println("Pick an action for your pet \n Type: \n 1 - Play \n 2 - feed \n 3 - sleep");
            int actionNum = scanner.nextInt();
            switch (actionNum) {
                case 1:
                    System.out.println(pet.petEnergy);
                    pet.play();
                    System.out.println();
                    System.out.println(pet.petEnergy);
                    break;
                case 2:
                    pet.feed();
                    System.out.println("Cow is eating");
                    break;
                case 3:
                    System.out.println("How long would you like your pet to sleep? (in seconds");
                    int sleeptime = scanner.nextInt();
                    pet.sleep(sleeptime);
                    sleep(sleeptime*100);
                    System.out.println("...");
                    sleep(sleeptime*100);
                    System.out.println("...");
                    sleep(sleeptime*100);
                    System.out.println("your pet has now slept and it's energy has been raised to: " + pet.petEnergy);

                    break;
                default:
                    System.out.println("Invalid action.");
                    break;


            }
            if (pet.petEnergy <= 0) {
                System.out.println("Energy level is below 0, and your pet is therefore dead");
                isPetAlive = false;
            } else if (pet.hunger <= 0) {
                System.out.println("Hunger level is below 0, and your pet is therefore dead");
                isPetAlive = false;
            } else if (pet.petAge >= 25) {
                System.out.println("Your pet is too old now, and your pet is now in heaven ❤ good job looking after" + petName);
                isPetAlive = false;
            }
        } while (isPetAlive);
    }

}
