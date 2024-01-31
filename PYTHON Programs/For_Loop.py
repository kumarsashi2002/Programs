#__________For_Loop____________#

# for i in range(1,5):
#     print(i)


# for i in range(1,10,2):
#     print("  ",i)


# for i in range(20,1,-2):
#     print(i,i*i,i*3)


# Iterate through a string,list and tuple using For loop.


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


set={10,'kD',6.5,55}
for x in set:
    print(set)
    break
for i,x in enumerate(set):
    print(i,x)


dict={'Name':'Shekhar', 'age':19}
for x in dict:
    print(x)
    continue
for i,x in enumerate(dict):
    print(i,x)


#__Use of enumerate() Method 
   # It is used for printing elements of a collection with its index value
for i,ele in enumerate(Title):
    print(i,ele)


# Use of else block in a for loop
for x in [10,20,26,13,8,50]:
    if x%10!=0:
        print(x," is not a multiple of 10")
        break
else:
    print("The rests are  multiple 0f 10:")


# Use of break and continue in for loop
for i in range(1,10):
    print(i)
    break
for i in range(1,5):
    print('__',i)
    continue