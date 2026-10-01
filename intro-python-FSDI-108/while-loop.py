"""
A while loop repeats a block of code as long as a condition is TRUE.
Be careful - if the condition never becomes FALSE, you'll get an INFINITE loop

while condition:
    # Code block runs as long as condition is True
"""

count = 1
while count <= 5:
    print("count is: ", count)
    count +=1  # Assignment operator which adds 1 and loop stops at =5
    
# using BREAK to stop the loop

number = 0

while True:  # Infinite loop, until you add the condition
    print(number)
    number += 1
    if number == 3:
        break  # stops the loop when it reaches 3
    
# using CONTINUE to SKIP an iteration
count = 0

while count < 5:
    count += 1
    if count == 3:
        continue  # SKIP
    print(count)
    
# else with while loop
# The else block runs when the loop condition hbecomes FALSE (not by break)

count = 1
while count < 3:
    print(count)
    count += 1
else:
    print("Loop is finished!")
    
"""
    MINI Challenge: PASSWORD CHECKER
    1. Ask the user to enter a password
    2. Check if it's correct (password: "secret123")
    3. If it's wrong, print "Wrong, Try again." and ask again
    4. Wehn they enter the correct password, print "access granted!"
"""

"""
   
password = input("Enter password: ")

if password == "secret123":
    print("Access granted!")
else:
    print("Wrong! Try again")
    print(input("Enter password"))
"""


# solution
password = "" # starts with an empty string
while password != "secret123":  # keeps looping while password is wrong
    password = input('Enter the password: ')
    if password != "secret123":  # If wrong
        print("Wrong! Try again.")
print("Access granted!")  # Once they enter correct password, while condition becomes false, so loop stops