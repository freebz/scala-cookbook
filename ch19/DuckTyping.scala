class Dog { def speak() { println("woof") } }
class Klingon { def speak() { println("Qapla!") } }

object DuckTyping extends App {

  def callSpeak[A <: { def speak(): Unit }](obj: A) {
    obj.speak()
  }

  callSpeak(new Dog)
  callSpeak(new Klingon)

}
