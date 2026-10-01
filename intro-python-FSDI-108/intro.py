print("Hello World from Python!") # No semicolons needed
print(2)
print(5 + 3)
print(True)

# shrotcuts
# Save file - ctrl + s
# Run last command in terminal - up arrow 

# COMMENTS adsfjasdlf
# jalsdfldsf
"""
This is a comment
    this too
asdf;lsdjf
"""

# Variables and concatenation
name = "Chuck"
age = 23
print(name) # prints the variable value

# concatenation (joining strings with +)
# concatenation cant combine string and integer
# Fix it- cast age to string using str()
print("My name is " + name + " and I am " + str(age) + " years old")

name = "Michale"
age = 30
middle_name = "Javier"
last_name = "Flores"
found = False # Boolean variable

print(name)
print("My name is " + name + " and I am " + str(age) + " years old.")
print("Did he show up to class? " + str(found))


name = "Rick"
occupation = "Lawyer"
age = 22
print("My friend " + name + " is the youngest " + occupation + " at his firm, at " + str(age) + " years old.")

# F-string
# Cleaner way to format strings
work = "sdgku"
job = "professor"
# start with f"", variable in {}
print(f"I work at {work} my job is {job}!")

# Multi-line f-string
print(f"""
my name is {name} {middle_name} {last_name}
I like python!
    Type    indentations       
""")

# type function
print(type(name))  #<class 'str'>
print(type(age))   #<class 'int'>
print(type(found)) #<class 'bool'>

# casting (changing data types)
print(20 + int("20"))
print(20 + age)
print(20 + 2.98)

# User input
# input() lets the user type values into the terminal
user_name = input("Enter your name: ")
print(f"Hello, {user_name}")

# input() always returns a string
print(input("Enter your age: "))

# Example: converting input to int
new_age = int(input("Enter your age: "))
print(age + new_age)

slice = int(input("How many slices of pizza? "))
guests = int(input("How many people?" ))
per_person = slice / guests
print(per_person)

