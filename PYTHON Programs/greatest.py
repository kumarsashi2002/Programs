print('Enter any three numbers')
a = int(input())
b = int(input())
c = int(input())
if a>b and b>c:
    print("greatest number is:",a)
elif b>a and a>c:
    print("greatest number is :",b)
else:
    print("greatest number is :",c)
