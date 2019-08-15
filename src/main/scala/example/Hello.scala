package example

object Hello extends Greeting with App {
  println("hello")
  println(greeting)
}

trait Greeting {
  if (false) println("bad code")
  lazy val greeting: String = "hello"
}
