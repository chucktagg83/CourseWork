"""
A for loop in python is a control structure that lets you repeat a blcok of code for 
each item in a sequence (such as list, string, tuple, range of numbers etc....)    

for variable in sequence:
    # Code block runs for each item in the sequence
"""

# Basic example
fruits = ["apple", "banana", "cherry"]

for fruit in fruits:
    print(fruit)
    
for letter in "Chuck":
    print(letter)
    
print("______________________________")

# range() generates a sequence of numbers
for x in range(2, 6):
    print(x)
    
print("______________________________")

# Step
for x in range(0, 10, 2):
    print(x)
    
"""
    MINI CHALLENGE
    

"""
num = int(input("Enter a number: "))

for i in range(1, 11):
    print(f"{num} X {i} = {num * i}")