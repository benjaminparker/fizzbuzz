import caseclass.FizzBuzz

trait FizzBuzzIO {
  def toScreen(fbs: Seq[FizzBuzz]): Unit = {
    val vs = fbs.map( _.value)
    println(vs.mkString(" "))
  }
}
