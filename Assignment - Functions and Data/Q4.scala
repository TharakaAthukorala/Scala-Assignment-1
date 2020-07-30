//object Q4 {
//
//  def main(args: Array[String]): Unit = {
//
//    var Bank:List[Account]=List()
//
//    class Account(id:String,n: Int, b: Double) {
//      val nic:String=id
//      val acNumber: Int = n
//      var balance: Double = b
//
//      override def toString = "["+nic+":"+acNumber +":"+ balance+"]"
//
//      //List of Accounts with negative balances
//      val overdraft=(b:List[Account])=> b.filter(x=>x.balance < 0)
//
//      //Total of all account balances
//      val balance=(b:List[Account])=> b.reduce(x=>)
//
//      //If balance is positive deposit interest is .05
//      //If balance is negative overdraft interest is .1
//      val interest=(b:List[Account])=>b.map()
//    }
//
//    val x = new Account("a1", 12001, -5000000) // Account A
//    val y = new Account("a2", 12002, 1000000) // Account B
//
//    println()
//
//  }
//
//}
