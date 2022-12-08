package Zadanie2;

public class Mammal extends Animal implements AnimalMove,AnimalBehaviour{

    public Mammal(){
        super();

    }

    public Mammal(String name, int age, int weight, String miesozerne){
        super(name,age,weight);
    }
    @Override
    public void getVoice(){System.out.println("Ssaki wydają bardzo dużo typów dźwięków");}

    @Override
    public void getEat(){System.out.println("Ssaki dzielą się na: mięsożerne, padlinożerne, roślinożerne");}

    public void move() { System.out.println("Ssak porusza się"); }
    public void sleep() { System.out.println("Ssak śpi"); }
}
