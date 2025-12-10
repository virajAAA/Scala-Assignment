package forloop

import scala.io.StdIn.readInt

object Factorial {

  def main (args: Array[String]): Unit = {

    println("Here !! we weill find out the factorial")

    println("Enter the number ")
    var number = readInt()
    var fact = 1
    for(i<-number to 1 by -1)
      {
        fact = fact * i
      }
      println(fact)
  }


}
