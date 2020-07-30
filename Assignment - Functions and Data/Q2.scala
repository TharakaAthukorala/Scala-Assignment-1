object Q2 {

  def main(args: Array[String]): Unit = {

    class Rational(a: Int, b: Int) {
      def numer = a

      def denom = b

      def sub(r: Rational) = new Rational(this.numer * r.denom - r.numer * this.denom, this.denom * r.denom)

      override def toString = numer + "/" + denom

    }
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    println(x.sub(y).sub(z))
  }
}
