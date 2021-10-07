public class Cat extends Tamagotchi {


    public Cat(String petName, int petEnergy, double petAge, double mood, int hunger) {
        super(petName, petEnergy, petAge, mood, hunger);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                ", petEnergy=" + petEnergy +
                ", petAge=" + petAge +
                ", mood=" + mood +
                ", hunger=" + hunger +
                '}';
    }

    @Override
    public void play() {
        super.play();
        VisualPrints.catPlay();
        System.out.println(petName + " is really having fun, it seems.");
        super.timepassOfAction(10);
    }

    @Override
    public void feed() {
        super.feed();
        VisualPrints.catFeed();
        System.out.println(petName + " is eating everything it can find.");
        super.timepassOfAction(0);
    }

    @Override
    public void sleep(int sleeptime) {
        super.sleep(sleeptime);
        VisualPrints.catSleep();
        System.out.println(petName + " is sleeping on the floor harmlessly.");
        super.timepassOfAction(0);
    }
}
