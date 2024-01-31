vowels = "aeiou"
name=input("Enter name:\n")
name = name.casefold()
count = {}.fromkeys(vowels,0)
for char in name:
    if char in count:
        count[char] +=1
print(count)
