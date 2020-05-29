def sum(n: Int): Int = {
	var add = 0;
	if (n==0) 0
	else
		add = n + sum(n-1)
		return add
}
print(sum(10))