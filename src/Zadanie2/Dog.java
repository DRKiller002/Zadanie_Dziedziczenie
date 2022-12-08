package Zadanie2;

public class Dog extends Mammal implements AnimalMove,AnimalBehaviour{
    private String breed;

//    Dog(){
//        super();
//        breed="NN";
//    }
    public Dog(String name,int age,int weight,String rzad,String breed){
        super(name, age, weight, rzad);
        this.breed=breed;
    }
//    public Dog(int age,String rzad,String breed){
//        //super(age,rzad);
//        this.breed=breed;
//    }
    public void aport(){System.out.println("Pies aportuje");}


    @Override
    public void getVoice(){System.out.println("Pies szczeka");}

    @Override
    public void getEat(){System.out.println("Psy są mięsożerne");}


    //@Override
    public void getEat(String jedzenie){System.out.println("Pies je"+jedzenie);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed=breed;}

    @Override
    public String toString(){
        return "Dog{"+
                "breed='"+breed +'\''+
                '}';
    }

    public void move() { System.out.println("Pies biega"); }
    public void sleep() { System.out.println("Pies śpi na kanapie"); }
}
