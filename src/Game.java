import java.util.Scanner;

public class Game {

    public static Tamagotchi pet;

    public static void choosePet(int petNum, String petName) {

        if (petNum == 1) {
            pet = new Dog(petName, 100, 1, true, 10, 100, 100);
        } else if (petNum == 2) {
            pet = new Cow(petName, 100, 1, true, 10, 100, 100);
        } else if (petNum == 3) {
            pet = new Cat(petName, 100, 1, true, 10, 100, 100);
        } else if (petNum == 4) {
            pet = new Dragon(petName, 100, 1, true, 10, 100, 100);
        }
    }

    public static void main(String[] args) {
        boolean isPetAlive = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose pet \n Type: \n 1 - Cat \n 2 - Cow \n 3 - Dog");
        int petNum = scanner.nextInt();
        System.out.println("What would you like to name your pet?");
        String petName = scanner.nextLine();
        choosePet(petNum, petName);


        do {
            System.out.println("Pick an action for your ");
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
                default:
                    System.out.println("Invalid action.");
                    break;


            }
            if (pet.petEnergy <= 0) {
                System.out.println("asgd");
                isPetAlive=false;
            }
        } while (isPetAlive);
        System.out.println("your pet has died because energy level has become");
    }

}
