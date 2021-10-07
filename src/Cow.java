public class Cow extends Tamagotchi{


    public Cow(String petName, int petEnergy, double petAge, double mood, int hunger) {
        super(petName, petEnergy, petAge, mood, hunger);

    }

    @Override
    public String toString() {
        return "Cow{" +
                "petName='" + petName + '\'' +
                ", petEnergy=" + petEnergy +
                ", petAge=" + petAge +
                ", mood=" + mood +
                ", hunger=" + hunger +
                '}';
    }

    @Override
    public void play(){
        super.play();
        VisualPrints.cowPlay();
        System.out.println(petName + " is now singing karaoke.. \n it's having a blast.");
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
        VisualPrints.cowFeed();
    }
    @Override
    public void sleep(int sleeptime){
        super.sleep(sleeptime);
        System.out.println("cow is now sleeping");
        VisualPrints.cowSleep();

    }

}
