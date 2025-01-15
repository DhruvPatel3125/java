public class inharit{
    public static void main(String[] args) {
        // Create an object of the parent class
        Dog d1 = new Dog();
        d1.eat();
        d1.sound();
        
    }
}

class Animal {
    public void sound() {
        System.out.println("It makes a sound");
        }
    public void eat() {
        System.out.println("The animal is eating");
        }
}
class Dog extends Animal {
    public void swim(){
        System.out.println("The dog is swimming");
    }   
    public void fly(){
        System.out.println("The dog is flying");
    }
}
    