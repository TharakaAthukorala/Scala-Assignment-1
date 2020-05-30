def isprime(num: Int, i: Int): Any = {
    if (i == 1){
        return 1;
    }
    else{
       if (num % i == 0){
         return 0;
       }
       else{
         return isprime(num, i - 1);
       }       
    }
}

def prime(num: Int): Any = {
	var check = isprime(num, num/2);

    if (check == 1){
        print(num);
    }
}
//prime(7)

def printPrime(n: Int): Unit = { 
    for(i <- 2 to n){
    	if (prime(i) == n){
    		print(i)

    	}
      //println(i)
    } 
} 

printPrime(10)
