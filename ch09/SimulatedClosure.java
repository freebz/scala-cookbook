public class SimulatedClosure {

  public static void main (String[] args) {
    Greeter greeter = new Greeter();
    greeter.setHelloPhrase("Hello");
    greeter.sayHello("Al");

    greeter.setHelloPhrase("Hola");
    greeter.sayHello("Lorenzo");

    greeter.setHelloPhrase("Yo");
    Bar bar = new Bar(greeter);
    bar.sayHello("Adrian");
  }
}

class Greeter {

  private String helloPhrase;

  public void setHelloPhrase(String helloPhrase) {
    this.helloPhrase = helloPhrase;
  }

  public void sayHello(String name) {
    System.out.println(helloPhrase + ", " + name);
  }

}

class Bar {

  private Greeter greeter;

  public Bar (Greeter greeter){
    this.greeter = greeter;
  }

  public void sayHello(String name) {
    greeter.sayHello(name);
  }

}
