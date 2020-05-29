// a - working hours
// b - OT

def salary(a: Int, b: Int): Double = {
	return (150*a + 75*b)*0.9
}

var x = salary(40, 20)
println("The take home salary is "+ x)