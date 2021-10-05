public class Dog extends Tamagotchi {


    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + petName + '\'' +
                ", petEnergy=" + petEnergy +
                ", petAge=" + petAge +
                ", isPetMale=" + isPetMale +
                ", petSize=" + petSize +
                ", mood=" + mood +
                ", hunger=" + hunger +
                '}';
    }


    public Dog(String petName, int petEnergy, double petAge, boolean isPetMale, int petSize, double mood, int hunger) {
        super(petName, petEnergy, petAge, isPetMale, petSize, mood, hunger);


    }

    @Override
    public void play() {
        System.out.println("dogplay");

    }

}

