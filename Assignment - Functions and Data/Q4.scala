object Q4 {

  class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    var acNumber: Int = n
    var balance: Double = b

    override def toString = "["+nic+":"+acNumber +":"+ balance+"]"

    //List of Accounts with negative balances
    val overdraft: List[Account] => List[Account] = (a:List[Account]) => a.filter(x=>x.balance<0)

    //Total of all account balances
    val sumBalance : List[Account] => Account =  (a:List[Account]) => a.reduce((y, z)=>new Account("all", 0, y.balance+z.balance))

    //If balance is positive deposit interest is .05
    //If balance is negative overdraft interest is .1
    val interest: List[Account] => List[Account] = (a:List[Account])=>a.map(y=>(if(y.balance<0) new Account(y.nic, y.acNumber, y.balance*1.05) else new Account(y.nic, y.acNumber, y.balance*1.2)))
  }

  def main(args: Array[String]): Unit = {

    val bank:List[Account] = List{
      new Account("a1", 12001, -5000000.00) // Account A
      new Account("a2", 12002, -1000000.00) // Account B
    }

    println("Accounts with negative balances : " + bank.head.overdraft(bank))

    val x = bank.head.sumBalance(bank)

    println("Sum of all account balances : " + x.balance)
    println("Balance after Interest : " + bank.head.interest(bank))

  }

}
