
class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I am Installshield Devloper");
  }
}



class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is  " + name);
  }
}

class Inheritance{
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rajkumar";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}
