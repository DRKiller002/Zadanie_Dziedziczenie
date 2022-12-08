package Zadanie2;

public class Bird extends Animal implements AnimalBehaviour,AnimalMove{
    public Bird(String name,int age,int weight,String kolorpior){super(name,age,weight,kolorpior);}

    @Override
    public void getVoice(){System.out.println("Ptaki gwiżdzą");}

    @Override
    public void getEat(){System.out.println("Ptaki są wszystkożerne");}
    public void move() { System.out.println("Ptak lata"); }
    public void sleep() { System.out.println("Ptak śpi"); }
}

