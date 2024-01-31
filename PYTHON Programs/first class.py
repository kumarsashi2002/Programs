'''# we define a variable as follows
x=1
print(x)
name='kss'
print(name)

# Multiple assignment
x,y,name=(1,2.5,'kss')
print(x,y,name)'''


#Type casting - to change type of a variable
x,y,z=(1,2.5,3.5)
x=1
y=2.5
x=str(x)
print(type(x),x)
y=int(y)
z=float(z)
print(type(x),type(y),type(z),y,z)

'''#     STRING FORMATTING
# concatenate - to insert a variable into an string
name='kss'
age='18'
print(f'Hello, my name is {name} and I am {age}')
print('hello , my name is ' +  name + ' and i am ' +  age)
#arguments by position
print('Hello my name is {name} and i am {age}'.format(name=name , age=age))
'''
'''                 #STRING methods
a='kss dutta'
print(a.capitalize())
print(a.upper())
print(a.lower())
print(a.replace('kss','Gaurav'))
print(a.find('u'))
print(a.swapcase())
print(len(a))
sub='s'
print(a.count(sub))
print(a.split())
print(a.startswith('ks'))
print(a.endswith('a'))
print(a.endswith('dutta'))
print(a.isalpha())
print(a.isnumeric())
print(a.isalnum())'''


'''      #        LISTS
# create list
numbers=[1,2,3,4]
print(numbers)

a=['apple','orange','grapes','pears']
print(a)
print(type(a))

print(a[1])
print(len(a))
a.append('mangoes')
print(a)
a.remove('mangoes')
print(a)
a.insert(2,'strawberries')
print(a)
a.pop(2)
print(a)
a.reverse()
print(a)
a.reverse()
print(a)
a.sort()
print(a)
a.sort(reverse=True)
print(a)
a[2]='banana'
print(a)'''


'''                #  TUPLES  #
# create tuples
a=('apple','orange','grapes','pears')
print(a)
print(type(a))
b1=('apples')
b2=('apples',)  # single value tuple needs trailing commas
print(type(b1),type(b2))

print(a[1])

print(len(a))

#a[0]='pears'
#print(a)     * In tuples we can't change values
#del a
#print(a)'''



'''          #  SETS     
# create set
a={'apples','orange','mangoes','pears'}
print(type(a),a)

a.add('grapes')
print(a)
a.remove('grapes')
print(a)
print('pears' in a)  # to check is pears in set a

#del a
#print(a)
a.add('pears')
print(a)   # it does not allow duplicate members
a.clear()  
print(a)'''





'''     #           DICTIONARIES     #      
#create dict
a={'first name':'Kss', 'last name':'Dutta', 'age':'18'}
print(a,type(a))

print(len(a))
print(a['first name'])
print(a.get('first name'))
a['phone']='7870771645'
print(a)
print(a.keys())
print(a.items())
a2=a.copy()
print(a2)
#list of dict
A=[{'name':'kss' , 'age':'18'},
   {'name':'gaurav','age':'20'},
   {'name':'pyare','age':'19'}]
print(A)
del(a['first name'])
print(a)
a.pop('last name')
print(a)
a.clear()
print(a)'''




            #              FUNCTIONS
# create function

  


