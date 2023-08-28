// object q2 {
//   def main(args: Array[String]): Unit = {
//     def getwords(): List[Int] = {
//       val input = scala.io.StdIn.readLine()
//       val word = input.split(" ").toList
//       word
//     }

//     def wordleagth(word:List[String]):Int={
//         word.map(_.length).reduce(_ + _);
//     }
//     }

    

//     def printfullleagth(): Unit = {
//         val wordl=wordleagth(word);
//         println(wordl);
//     }

//     printfullleagth();
//   }

object q2 {
  def main(args: Array[String]): Unit = {
    def getWords(): List[String] = {
      val input = scala.io.StdIn.readLine()
      val words = input.split(" ").toList
      words
    }

    def wordLength(words: List[String]): Int = {
      words.map(_.length).reduce(_ + _)
    }

    def printFullLength(): Unit = {
      val words = getWords()
      val totalWordLength = wordLength(words)
      println("Words:")
      println(words)
      println("\nTotal Word Length:")
      println(totalWordLength)
    }

    printFullLength()
  }
}

