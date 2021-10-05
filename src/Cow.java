public class Cow extends Tamagotchi{


    public Cow(String petName, int petEnergy, double petAge, boolean isPetMale, int petSize, double mood, int hunger) {
        super(petName, petEnergy, petAge, isPetMale, petSize, mood, hunger);

    }
    @Override
    public void play(){
        super.play();
        System.out.println("cowplay");
        VisualPrints.cowPlay();
        //petEnergy = petEnergy - 10;
        //System.out.println("energy is now " + petEnergy);
        super.playreduceenergy(25);
        //TODO
        // - petsize affects
        // - moodchange
        // - hungerchange
        // - timetick

    }
    @Override
    public void feed(){
        System.out.println("cow eats 🐮 ");
        VisualPrints.hungryCow();
    }
    @Override
    public void sleep(int sleeptime){
        System.out.println("cow is now sleeping");
        //visualPrints.sleepingcow

    }

}
