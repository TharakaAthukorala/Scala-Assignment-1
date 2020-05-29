def evenSum(n: Int): Int =  {
    if (n == 0) return 0 

    var sum = evenSum(n - 1) 
    if (n % 2 == 0) sum += n 
    return sum 
}

print(evenSum(9))