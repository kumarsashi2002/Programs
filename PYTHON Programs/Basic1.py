'''# We can write many statements/expressions in a print function.Each separated by Comma
print('kss',"kss",5)
a=4
# We can declare any number of variables in a single line
a,b,c=20,10.25,'Dutta'
a=20; b=10.25; c='Dutta
# Use type() to check type of a variable
print(type(a))
print(type(b))
print(type(c))
print(isinstance(a,int))
# Find Address of a variables using id() method.
print(id(a),"\n",id(b))
print(a+b,a-b,a*b,a/b,a%b)
print(a**b,a//b) 
print(bool(25),bool(12.265))
print(bool(0))
'''


'''#Multi-Lining Demonstration
sum=2+3+3+4+5+\
    25+36+15
print(sum)'''



'''# Conversion
a=20; b=56.3; c='kss'; d='35'
print(type(a),type(b),type(c),type(d))

a=float(a)
a=float(20)
print(float(a))
print(a)
print(int(b),int(56.3))
print(int(d),float(d))  # Converts numeric string to int/float
#print(int(c))  # Can't convert from string to int/float
'''



'''# Demonstration of Built-in-Functions
print(min(10,80,4))
print(max(20,89,16))
print(abs(-56))
print(bin(6))
print(hex(26))
'''


# # Taking input from keyboard
# print("Enter values of a,b,and c:")
# a=int(input())  #Takes only Integer input
# b=float(input())  #Takes float/integer input
# c=str(input())  #Takes string/numeric string input
# print("Entered Number is:" ,a,b,c)
# d=int(input("Enter a Number: "))
# print("You Entered : ",d)

i=5
print(f"kss{i}d")