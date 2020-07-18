object caesar {

  def main(args: Array[String]): Unit = {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val Encryption = (char:Char,key:Int,stri:String) => stri((stri.indexOf(char.toUpper)+key)%stri.size)

    val Decryption = (char:Char,key:Int,stri:String) => stri((stri.indexOf(char.toUpper)-key)%stri.size)

    val cipher = (algo:(Char,Int,String) => Char,s:String,key:Int,stri:String) => s.map(algo(_,key,stri))

    val ct = cipher(Encryption,"Helloo",4,alphabet)

    val pt = cipher(Decryption,ct,4,alphabet)

    println(ct)
    println(pt)

  }

}
