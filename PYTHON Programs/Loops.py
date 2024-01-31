#-------------Demonstration of While and For Loop-----------#

#________While_Loop_________#

# i=1
# while i<=5:
#     print(i)
#     i+=1


# num=0
# while num<10:
#     print(num,num*num)
#     num+=1
# print(num)

# a=int(input("Enter a Number: "))
# while(a!=5):
#     print(a,a*a)
#     a=int(input("Enter another Number: "))


# Iterate through a string,list and tuple using While loop.

'''i=0
s='Kolkata'
while(i<len(s)):
    print(s[i])
    i+=1

i=0
lst=['kmp',"bpt",12,32.5]
while(i<len(lst)):
    print(lst[i])
    i+=1

i=0
tpl=(10,30,5.6,'kgf')
while(i<len(tpl)):
    print(tpl[i])
    i+=1   '''

# We cannot iterate through a set or a dictionary because these are unindexed and key value pair respectively.



#__________For_Loop____________#

# for i in range(1,5):
#     print(i)


# for i in range(1,10,2):
#     print("  ",i)


# for i in range(20,1,-2):
#     print(i,i*i,i*3)


# Iterate through a string,list and tuple using For loop.
'''
Title='Duttaji'
for a in Title:   # 1st Method
    print(a)
for a in 'Duttaji':   # 2nd Method
    print("_",a)
for i,x in enumerate(Title):   # Using enumerate() Method. For printing with the index number
    print(i,x)

lst=['apples','banana',25,27.6,"kss"]
for x in lst:
    print(x)
for var in ['apples','banana',25,27.6,"kss"]:
    print("__",var)
for i,x in enumerate(lst):
    print(i,x)

tpl=('KSD',23,2.5,'g')
for var in tpl:
    print(var)
for x in ('KSD',23,2.5,'g'):
    print("__",x)  
for i,x in enumerate(tpl):
    print(i,x)

# set={10,'kD',6.5,55}
# for x in set:
#     print(set)
#     break


# dict={'Name':'Shekhar', 'age':19}
# for x in dict:
#     print(x)
#     continue



for i,ele in enumerate(Title):
    print(i,ele)  '''

# Use of else block in a while loop
# i=0
# lst=[10,20,26,13,8,50]
# while i<len(lst):
#     if lst[i]%10==0:
#         print(lst[i],' is a multiple of 10')
#         i+=1
# else:
#     print("The rests are not multiple of 10")



# Use of else block of a for loop
# for x in [10,20,26,13,8,50]:
#     if x%10==0:
#         print(x," is a multiple of 10")
# else:
#     print("The rests are not multiple 0f 10:")



# Use of break and continue (Used for both while and for loop)
 # Break statement terminates the current loop and resumes execution at the next statement
 # continue statement returns the control to the beginning of the loop
'''
i=0
while i<5:
    print(i)
    i+=1
    break
for i in range(1,10):
    print('__',i)
    break

i=0
while i<5:
    print(i)
    i+=1
    continue
for i in range(1,5):
    print('__',i)
    continue   '''



num=int(input('Enter a number '))
i=2
while i<=num-1:
    if num%i==0:
        print(num,' is not a prime number')
        break
    i+=1
else:
    print(num,' is a prime number')