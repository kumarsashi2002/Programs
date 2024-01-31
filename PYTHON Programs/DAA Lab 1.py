# #      1st
# print('Enter the value in km')
# km=float(input())
# miles = km * 0.62
# print('Value in miles is:',miles)


# #          2nd
# print("Enter the value in celcius")
# celcius = float(input())
# fahrenheit = ((celcius*9/5) + 32)
# print("The value in Fahrenheit is :",fahrenheit)


# #        3rd
# print('Enter any three numbers')
# a = int(input())
# b = int(input())
# c = int(input())
# if a>b and b>c:
#     print("greatest number is:",a)
# elif b>a and a>c:
#     print("greatest number is :",b)
# else:
#     print("greatest number is :",c)


# #     5th
# print("enter any number")
# a = int(input())
# factorial = 1
# while a>1:
#     factorial *=a
#     a-=1
# print(factorial)


# #          6th
# print("Enter a natural number:")
# n=int(input())
# sum = 0
# if n<1:
#     print('Non natural number')
# else :
#     for i in range(1,n+1):
#         sum += n
#         n-=1
#     print('The sum of these natural numbers is :',sum)


# #         7th
# print("Enter an interval:")
# lower = int(input('Enter lower bound:\n'))
# upper = int(input('Enter upper bound:\n'))
# print("print all prime numbers between lower and upper bound ")
# for n in range(lower, upper+1):
#     if n > 1:
#         for i in range(2, n):
#             if n % i == 0:
#                 break
#         else:
#                 print(n)



# #         10th
# vowels = "aeiou"
# name=input("Enter name:\n")
# name = name.casefold()
# count = {}.fromkeys(vowels,0)
# for char in name:
#     if char in count:
#         count[char] +=1
# print(count)



#  #      8th
# def sum (a,b):
#     return a+b
# def subtract (a,b):
#     return a-b
# def multiply (a,b):
#     return a*b
# def divide (a,b):
#     return a%b

# print("simple calculator:")
# print("1.sum")
# print("2.subtract")
# print("3.multiply")
# print("4.divide")
# choice = input("select your choice(1/2/3/4):")

# a = int(input('Enter first number :'))
# b = int(input('Enter second number :'))
# if choice == '1':
#     print(a,'+',b,'=',sum(a,b))
# if choice == '2':
#     print(a,'-',b,'=',subtract(a,b))
# elif choice == '3':
#     print(a,'*',b,'=',  multiply(a,b))
# elif choice == '4':
#     print(a,'/',b,'=', divide(a,b))
# else:
#     print('Invalid input')


#        
# def fiboRec(n):
#     if n<=1:
#         return n
#     else:
#         return(fiboRec(n-1) + fiboRec(n-2))
# terms = int(input("How many terms :"))

# if terms <= 0:
#     print("Enter a positive number")
# else:
#     print("Fibonacci sequence:")
#     for i in range(terms):
#         print(fiboRec(i))


#      Last
# def GCD(x,y):
#     if (y==0):
#         return x
#     else:
#         return GCD(y,x%y)

# x = int(input("Enter the first number :"))
# y = int(input("Enter the second number :"))
# num = GCD(x,y)
# print("GCD of two number s : ")
# print(num)


#     group B
# def insertionsort(arr):
#     for i in range(1,len(arr)):
#         key = arr[i]
        
#         j=i-1
#         while j>=0 and key < arr[j]:
#             arr[j+1]= arr[j]
#             j-=1

#         arr[j+1]=key    

# arr = [55,12,77,8,2,105]
# print("Unsorted array is :",arr)
# insertionsort(arr)
# print("Sorted array is :")
# for i in range(len(arr)):
#     print("%d"%arr[i])



