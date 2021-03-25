package lectures.part1Basics

object expressions extends App {

  val x = 1 + 2  // Expressions
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ...... Side effects
  println(aVariable)

  // Instructions Vs Expressions
  
}
