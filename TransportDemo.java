interface Transport{
    void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel is delivering goods");
    }
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey is delivering goods");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Animal[] animal=new Animal[5];
        animal[0]=new Tiger();
        animal[1]=new Camel();
        animal[2]=new Deer();
        animal[3]=new Donkey();

        for (int i = 0; i < animal.length; i++) {
            Animal animals = animal[i];
                if (animals instanceof Transport) {
                    ((Transport) animals).deliver();
                }
        }

    }
}
