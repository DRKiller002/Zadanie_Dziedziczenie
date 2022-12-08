package Zadanie2;

public abstract class Animal implements AnimalMove,AnimalBehaviour {
    public String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public Animal(){
//        name="Zwierze";
//        age=3;
//        weight=20;
    }

    public Animal(String name, int age, int weight, String kolorpior) {
    }

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public void getVoice() {

    }

    public void getEat(){

    }

}
