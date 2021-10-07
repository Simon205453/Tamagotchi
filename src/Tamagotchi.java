public class Tamagotchi {

    public String petName;
    public int petEnergy = 100;
    public double petAge = 0;
    public double mood = 100;
    public int hunger = 100;

    public Tamagotchi(String petName, int petEnergy, double petAge, double mood, int hunger) {
        this.petName = petName;
        this.petEnergy = petEnergy;
        this.petAge = petAge;
        this.mood = mood;
        this.hunger = hunger;

    }

    public void play() {
        petEnergy = petEnergy - 10;
        System.out.println("energy is now ");
    }

    public void feed() {
        System.out.println(petName + " is now eating, and has it's energy restored.");

    }

    public void sleep(int sleeptime) {
        petEnergy = petEnergy + sleeptime * 10;
        mood = mood - 40;

        hunger = hunger - sleeptime * 2;
        System.out.println(petName + " is now sleeping and has it's energy restored to: ");
        if (petEnergy < 100) {
            petEnergy = 100;
            System.out.println("Your pets energy is full, and cannot be increased further.");
        }
        System.out.println("Your pets hunger level is now " + hunger);
        System.out.println(petName + " has gotten it's mood reduced to: " + mood);

    }

    public void timepassOfAction(int amount) {
        petAge = petAge + 1 + amount * 0.2;
        System.out.println("Time has passed, and you pet is now " + petAge + " units old.");
        if (mood < 50) {
            petEnergy = petEnergy - amount * 2;
            System.out.println(petEnergy);
        } else {
            petEnergy = petEnergy - amount;
            System.out.println(petName + "'s energy level is now " + petEnergy);
        }
    }
}
