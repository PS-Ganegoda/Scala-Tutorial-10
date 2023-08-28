object q1 {
  def main(args: Array[String]): Unit = {
    def getTemp(): List[Int] = {
      val input = scala.io.StdIn.readLine()
      val temp = input.split(" ").map(_.toInt).toList
      temp
    }

    def convertTemp(celsiusTemps: List[Int]): List[Int] = {
      val fahrenheitTemps = celsiusTemps.map(x => (x * 9 / 5) + 32)
      fahrenheitTemps
    }

    def average(fahrenheitTemps: List[Int]): Double = {
      val sumtemp = fahrenheitTemps.sum
      val ave = sumtemp.toDouble / fahrenheitTemps.length
      ave
    }

    def printTempAndConverted(): Unit = {
      val celsiusTemps = getTemp()
      val fahrenheitTemps = convertTemp(celsiusTemps)
      val ave = average(fahrenheitTemps)
      
      println("Celsius Temperatures:")
      println(celsiusTemps)

      println("\nFahrenheit Temperatures:")
      println(fahrenheitTemps)

      println("Average Fahrenheit Temperature:")
      println(ave)
    }

    printTempAndConverted()
  }
}
