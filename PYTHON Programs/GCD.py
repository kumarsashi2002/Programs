def GCD(x,y):
    if (y==0):
        return x
    else:
        return GCD(y,x%y)

x = int(input("Enter the first number :"))
y = int(input("Enter the second number :"))
num = GCD(x,y)
print("GCD of two numbers : ")
print(num)
