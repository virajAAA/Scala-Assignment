
package forloop

import scala.io.StdIn.readInt

object Sumoftwo {

  def main(args: Array[String]) : Unit = {

    print("Enter the number to do sum")
    var number = readInt();

    var sum = 0

    for(i<-1 to number)
      {
         sum += i;
      }
    print(sum)
  }

}
