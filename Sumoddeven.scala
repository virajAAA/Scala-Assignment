package forloop

import scala.io.StdIn.readInt

object Sumoddeven {

  def main(args: Array[String]): Unit = {

    println("Enter the number to find till odd and even")
    var number = readInt()
    var Esum = 0
    var Osum = 0
    for(i<-1 to number)
      {
        if(i%2==0)
          {

            Esum = Esum + i;
          }
        else
          {
            Osum =Osum + i;
          }


      }
    println(s"Even numbers sum is $Esum")
    println(s"ODD numbers sum is $Osum")
  }

}
