package forloop

import scala.io.StdIn.readInt

object Evennumber {

  def main (args: Array[String]) : Unit = {

    println("Enter the number")
    var number = readInt();

    for(i<-1 to number)
      {
        if(i%2==0)
          {
            println(s"Even number $i")
          }
          else
            {
              println(s"Odd Number $i")
            }
      }
  }
}
