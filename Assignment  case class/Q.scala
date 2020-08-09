object Q {

  case class Point(a: Int, b: Int){
    def x: Int = a;
    def y: Int = b;

    def +(that: Point) = Point(this.x + that.x, this.y + that.y)

    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    def distance(that: Point): Double = Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2))

    def invert(point: Point) = Point(point.y, point.x)
  }

  def main(args: Array[String]): Unit = {
    val p1 = Point(0, 2)
    val p2 = Point(4, 5)

    val p3 = p1.move(2, 3)
    val p4 = p1.distance(p2)
    val p5 = p2.invert(p2)

    //val realDistance = p4

    println(p1 + p2)
    println(p3)
    println(p4)
    println(p5)

  }

}
