object Q3 {

  def main(args: Array[String]): Unit = {

    class Account(n: Int, b: Double){

      def acNumber = n
      def balance = b

      def transfer(a: Account, b:Double) = new Account(a.acNumber, a.balance - b)

      override def toString = "[ Account Number - "+acNumber +" | Balance = "+ balance+" ]"
    }
    val x = new Account(12001, 5000000) // Account A
    val y = new Account(12002, 1000000) // Account B

    // Transferring money from Account A to Account B
    println(y.transfer(x, 500000))
    //println(x)

  }

}
