package Zadanie2;

public class Fish extends Animal{
    public Fish(String name,int age,int weight,String kolorlusek){super(name,age,weight,kolorlusek);}

    @Override
    public void getVoice(){System.out.println("Ryba bulgocze");}

    @Override
    public void getEat(){System.out.println("Ryby są zarówno mięsożerne, roślinożerne jak i wszystkożerne");}

}
