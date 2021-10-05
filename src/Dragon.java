public class Dragon extends Tamagotchi{
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

    public Dragon(String petName, int petEnergy, double petAge, boolean isPetMale, int petSize, double mood, int hunger) {
        super(petName, petEnergy, petAge, isPetMale, petSize, mood, hunger);
    }
}
