import java.util.Random;

public class Tamagotchi {

        Random randomNum = new Random();
        public String petName;
        public int petEnergy = 100;
        public double petAge = 0;   //make age grow according to timepass
        public boolean isPetMale;
        public int petSize;         //make size affect energy consumption
        public double mood;         //make mood affected by hunger, and time since last play method run
        public int hunger = 100;    //make hunger affect sleep method, mood, and energy max limit

    public Tamagotchi(String petName, int petEnergy, double petAge, boolean isPetMale, int petSize, double mood, int hunger) {
        this.petName = petName;
        this.petEnergy = petEnergy;
        this.petAge = petAge;
        this.isPetMale = isPetMale;
        this.petSize = petSize;
        this.mood = mood;
        this.hunger = hunger;

                

    }
}
