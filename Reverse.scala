package forloop

import scala.io.StdIn.readInt

object Reverse {

  def main (args: Array[String] ) : Unit ={

    println("Enter the number")
    val number = readInt()

    for(i<-number to 1 by -1)
      {
        println(i)
      }

  }

}
