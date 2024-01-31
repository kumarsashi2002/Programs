print("Enter a natural number:")
n=int(input())
sum = 0
if n<1:
    print('Non natural number')
else :
    for i in range(1,n+1):
        sum += n
        n-=1
    print('The sum of these natural numbers is :',sum)

