package Class_example;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car ("Polo", "White", "Hatchback", 200000, 15);
        car1.display();
        OffroadCar off1 = new OffroadCar ("Amarok", "Green", "4x4", 200000, 17, true);
        off1.display();
    }
}
