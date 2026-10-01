# if -> checks a condition
# elif -> (else if) checks another condition if the first is False
# else -> runs if all other conditions are False

x = 10

if x > 0: # always need to use a colon when using if function
    print("x is positive")
elif x == 0:
    print("x is zero")
else: 
    print("x is negative")  #last resort, no need to have parameters set, will run if others are false.
    
# if file or variable is mostly typed out hit TAB to automatically fill it out

# Short Hand IF Statements
if x > 5: print("x is greater than 5")

# Short Hand if....else
print("Even") if x % 2 == 0 else print("Odd")

# Nested If statements
if x > 0:
    if x < 20:
        print("x is a positive number less than 20")
        
# Combining Conditions
age = 18

if age >= 18 and age <= 21:
    print("You are between 18 and 21 years old!")
    
    
    """
    MINI PROJECT
    """
    
print(input("Enter today's temperature in fernheit: "))
temp = input

if temp >= 86:
    print("Its Hot Outside!")
elif temp <= 68 and temp < 86:
    print("The Weather is Nice!")
elif temp >= 50 and temp < 68:
    print("Its a bit chilly!")
else:
    print("Its Cold")

if temp < 59:
    jacket = True
if jacket == True:
    print("Better wear a jacket")
else: 
    print("No jacket needed")
