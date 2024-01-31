print("Enter an interval:")
lower = int(input('Enter lower bound:\n'))
upper = int(input('Enter upper bound:\n'))
print("print all prime numbers between lower and upper bound ")
for n in range(lower, upper+1):
    if n > 1:
        for i in range(2, n):
            if n % i == 0:
                break
        else:
                print(n)
