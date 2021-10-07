public class Dragon extends Tamagotchi{

    @Override
    public void play() {
        super.play();
        VisualPrints.dragonPlay();
        System.out.println(petName + " doing dragon things.");
        super.timepassOfAction(10);
    }

    @Override
    public void feed() {
        super.feed();
        VisualPrints.dragonFeed();
        System.out.println(petName + " is eating like a troll with wings.");
        super.timepassOfAction(0);
    }

    @Override
    public void sleep(int sleeptime) {
        super.sleep(sleeptime);
        VisualPrints.dragonSleep();
        System.out.println(petName + " is sleeping while sitting.");
        super.timepassOfAction(0);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "petName='" + petName + '\'' +
                ", petEnergy=" + petEnergy +
                ", petAge=" + petAge +
                ", mood=" + mood +
                ", hunger=" + hunger +
                '}';
    }

    public Dragon(String petName, int petEnergy, double petAge, double mood, int hunger) {
        super(petName, petEnergy, petAge, mood, hunger);

    }
}
