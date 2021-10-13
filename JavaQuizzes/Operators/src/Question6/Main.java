package Question6;

class Base {}

class Derived extends Base {
    public static void main(String args[]){
        Base a = new Derived();
        System.out.println(a instanceof Derived);
    }
}