
# Unique Combination of 3 Numbers using for loop
lst=[1,2,3]
for i in range(3):
    for j in range(3):
        for k in range(3):
            if(i!=j and j!=k and k!=i):
                print(lst[i],lst[j],lst[k])


# Unique Combination of 3 numbers using while loop
i=1
while i<=3:
    j=1
    while j<=3:
        k=1
        while k<=3:
            if i==j or j==k or k==i:
                k+=1
                continue
            else:
                print('__',i,j,k)
            k+=1
        j+=1
    i+=1


# Unique Combination of 4 numbers using for loop
lst=[1,2,3,5]
for i in range(4):
    for j in range(4):
        for k in range(4):
            for l in range(4):

                if(i!=j and i!=k and i!=l and j!=k and j!=l and k!=l):
                    print(lst[i],lst[j],lst[k],lst[l])


# Unique Combination of 2 numbers using for loop
lst=[1,2]
for i in range(2):
    for j in range(2):
        if i!=j:
            print('__',lst[i],lst[j])

