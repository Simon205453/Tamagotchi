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
