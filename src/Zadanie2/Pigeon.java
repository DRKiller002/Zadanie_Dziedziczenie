package Zadanie2;

public class Pigeon extends Bird implements AnimalBehaviour,AnimalMove{
    private String species;

    public Pigeon(String name, int age, int weight,String kolorpior,String species) {
        super(name, age, weight,kolorpior);
        this.species=species;
    }
    @Override
    public void getVoice(){System.out.println("Pingwin skrzeczy");}

    @Override
    public void getEat(){System.out.println("Pingwiny są wszystkożerne");}
    @Override
    public void sleep(){ System.out.println("Gołąb śpi w gnieździe albo na jakimś słupie"); }
    public void move(){ System.out.println("Gołąb lata"); }
}
