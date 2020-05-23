def wholesale(x : Double): Double = {
    24.95*60*x/100 + 3 + (x-50)*0.75
}

print(wholesale(60))