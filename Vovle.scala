package DowhileLoop

import scala.io.StdIn.readChar

object Vovle {

    def main(args: Array[String]): Unit = {

      println("Enter a character:")
      val ch = readChar()


      val c = ch.toLower

      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

        println(ch + " Vowel")
      } else {
        println(ch+ "  not Vowel")
      }
    }



}
