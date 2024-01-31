def sum (a,b):
    return a+b
def subtract (a,b):
    return a-b
def multiply (a,b):
    return a*b
def divide (a,b):
    return a%b

print("simple calculator:")
print("1.sum")
print("2.subtract")
print("3.multiply")
print("4.divide")
choice = input("select your choice(1/2/3/4):")
a = int(input('Enter first number :'))
b = int(input('Enter second number :'))
if choice == '1':
    print(a,'+',b,'=',sum(a,b))
if choice == '2':
    print(a,'-',b,'=',subtract(a,b))
elif choice == '3':
    print(a,'*',b,'=',  multiply(a,b))
elif choice == '4':
    print(a,'/',b,'=', divide(a,b))
else:
    print('Invalid input')

