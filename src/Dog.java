public class Dog extends Tamagotchi {


    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + petName + '\'' +
                ", petEnergy=" + petEnergy +
                ", petAge=" + petAge +
                ", mood=" + mood +
                ", hunger=" + hunger +
                '}';
    }


    public Dog(String petName, int petEnergy, double petAge, double mood, int hunger) {
        super(petName, petEnergy, petAge, mood, hunger);


    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void sleep(int sleeptime) {
        super.sleep(sleeptime);
    }
}

