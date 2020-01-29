package caseclass

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FizzBuzzSpec extends AnyWordSpec with Matchers {

  "FizzBuzz" should {

    "be the number supplied when not divisible by 3 or 5" in {
      FizzBuzz(2).value mustBe "2"
    }

    "be Fizz when divisible by 3" in {
      FizzBuzz(6).value mustBe "Fizz"
    }

    "be Buzz when divisible by 5" in {
      FizzBuzz(10).value mustBe "Buzz"
    }

    "be FizzBuzz when divisible by both 3 and 5" in {
      FizzBuzz(90).value mustBe "FizzBuzz"
    }
  }
}
