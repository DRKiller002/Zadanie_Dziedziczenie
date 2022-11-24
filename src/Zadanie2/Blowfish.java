package Zadanie2;

public class Blowfish extends Fish{
    private int srednica;

    public Blowfish(String name, int age, int weight,String kolorlusek,int srednica ) {
        super(name, age, weight,kolorlusek);
        this.srednica=srednica;
    }
    @Override
    public void getVoice(){System.out.println("Rozdymka bulgocze");}

    @Override
    public void getEat(){System.out.println("Rozdymki są głównie roślinożerne");}
}
