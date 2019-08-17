package example

object Hello extends Greeting with App {
  val any = List(1, true, "three")
  println("hello")
  println(greeting)
}

trait Greeting {
  if (false) println("bad code")
  lazy val greeting: String = "hello"
}
