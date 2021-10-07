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
        VisualPrints.dogPlay();
        System.out.println(petName + " is playing like only a dog can understand.");
        super.timepassOfAction(10);
    }

    @Override
    public void feed() {
        super.feed();
        VisualPrints.dogFeed();
        System.out.println(petName + " is sweeping the dogbowl");
        super.timepassOfAction(0);
    }

    @Override
    public void sleep(int sleeptime) {
        super.sleep(sleeptime);
        VisualPrints.dogSleep();
        System.out.println(petName + " is sleeping peacefully");
        super.timepassOfAction(0);
    }
}

