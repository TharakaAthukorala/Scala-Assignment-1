object Q1 {

  def main(args: Array[String]): Unit = {

    class Rational(x: Int, y: Int){
      private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
      val numer = x / gcd(x, y)
      val denom = y / gcd(x, y)

      override def toString = numer + "/" + denom

      def neg() = new Rational(-this.numer, this.denom)
    }
    val a = new Rational(2, 5)
    val b = new Rational(7, 11)
    println(b.neg())

  }

}
