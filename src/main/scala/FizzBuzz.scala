abstract case class FizzBuzz(value: String)

object FizzBuzz {

  def apply(i: Int): FizzBuzz = i match {
    case _ if i % (3 * 5) == 0 => new FizzBuzz("FizzBuzz"){}
    case _ if i % 3 == 0 => new FizzBuzz("Fizz"){}
    case _ if i % 5 == 0 => new FizzBuzz("Buzz"){}
    case _ => new FizzBuzz ("") {}
  }
}