def number(n: Int): Boolean = {
	if(n<2) return (n%2 == 0)
	return (number(n-2))
}

print(number(3))
