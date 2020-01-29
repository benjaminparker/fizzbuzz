import caseclass.FizzBuzz

object FizzBuzzScreenOutput {

  def main(args: Array[String]): Unit = {
    val max = args(0).toInt
    val fbs = (1 to max).map(FizzBuzz(_))
    new FizzBuzzIO{}.toScreen(fbs)
  }

}
