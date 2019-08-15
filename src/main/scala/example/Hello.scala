package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  if (false) println("bad code")
  lazy val greeting: String = "hello"
}
