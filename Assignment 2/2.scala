// Ticket price = x

def attendees(x:Int):Int=120 + (15-x)/5*20

def revenue(x:Int):Int = attendees(x)*x

def cost(x:Int):Int = 500 + attendees(x)

def profit(x:Int):Int = revenue(x)- cost(x)

print(profit(5), profit(10), profit(15), profit(20), profit(25), profit(30), profit(35), profit(40))
