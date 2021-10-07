import java.util.Random;


public class Tamagotchi {


    Random randomNum = new Random();
    public String petName;
    public int petEnergy = 100;
    public double petAge = 0;   //make age grow according to timepass
    public double mood = 100;         //make mood affected by hunger, and time since last play method run
    public int hunger = 100;    //make hunger affect sleep method, mood, and energy max limit

    public Tamagotchi(String petName, int petEnergy, double petAge, double mood, int hunger) {
        this.petName = petName;
        this.petEnergy = petEnergy;
        this.petAge = petAge;
        this.mood = mood;
        this.hunger = hunger;

    }

    public void play() {
        //change petenergy
        //print play
        petEnergy = petEnergy - 10;
        System.out.println("energy is now " + petEnergy);
        System.out.println("this is Tamagotchi class TESTER NEEDS TO BE REMOVED");
        // TODO remove sout line above, in Tamagotchi play method
    }

    public void feed() {
        System.out.println(petName + " is now eating, and has it's energy restored.");

    }

    public void sleep(int sleeptime) {
        petEnergy = petEnergy + sleeptime * 10;
        mood = mood - 40;

        hunger = hunger - sleeptime * 2;
        System.out.println(petName + " is now sleeping and has it's energy restored to: " + petEnergy);
        if (petEnergy<100){
            petEnergy=100;
            System.out.println("Your pets energy is full, and cannot be increased further.");
        }
        System.out.println("Your pets hunger level is now " + hunger);
        System.out.println(petName + " has gotten it's mood reduced to: " + mood);

    }

    public void playreduceenergy(int amount) {
        //TODO
        // - if mood is low more energy will be subtracted.
        petAge = petAge++;
        System.out.println("Time has passed, and you pet is now" + petAge + " units old.");
        petEnergy = petEnergy - amount;
        System.out.println(petEnergy);
    }
}
