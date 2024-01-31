def fiboRec(n):
    if n<=1:
        return n
    else:
        return(fiboRec(n-1) + fiboRec(n-2))
terms = int(input("How many terms :"))

if terms <= 0:
    print("Enter a positive number")
else:
    print("Fibonacci sequence:")
    for i in range(terms):
        print(fiboRec(i))

