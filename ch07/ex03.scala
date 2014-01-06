package orderentry {
  class Foo { override def toString = "I am orderentry.Foo" }
}

package customers {
  class Foo { override def toString = "I am customers.Foo" }
  package database {
    class Foo { override def toString = "I am customers.database.Foo" }
  }
}

object PackageTests extends App {
  println(new orderentry.Foo)
  println(new customers.Foo)
  println(new customers.database.Foo)
}
