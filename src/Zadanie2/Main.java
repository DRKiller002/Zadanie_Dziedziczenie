package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Wojtek", 2, 20, "tak, ale nie tylko");
        animal[1] = new Dog("Reks", 3, 20, "Mięsożerny", "Pudel");
        animal[2] = new Bird("Dziobak", 7, 2, "brązowy");
        animal[3] = new Pigeon("Pablo", 6, 20, "biały", "królewski");
        animal[4] = new Fish("Nemo", 5, 2, "żółty");
        animal[5] = new Blowfish("Rozdymka", 5, 3, "biały", 3);

        for (int i = 1; i < animal.length; i++) {
            animal[i].getEat();
            animal[i].getVoice();
        }

        

    }
}
