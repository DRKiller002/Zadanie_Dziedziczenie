package Zadanie2;

public class Pigeon extends Bird{
    private String species;

    public Pigeon(String name, int age, int weight,String kolorpior,String species) {
        super(name, age, weight,kolorpior);
        this.species=species;
    }
    @Override
    public void getVoice(){System.out.println("Pingwin skrzeczy");}

    @Override
    public void getEat(){System.out.println("Pingwiny są wszystkożerne");}
}
