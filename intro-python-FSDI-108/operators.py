# 1. Artithmetic Operators
# crtl + 

x = 1
y = 2
res = 0

res = x + y
print(res)

res = x - y
print(res)

res = x / y
print(res)

res = x * y
print(res)

# 2. Assignment Operators - used to assign values to variables
# = means "put this value inside the (variables)"

x = 5
x += 5
x -= 3
x *= 3
x /= 3
print(x)

# 3. Comparison Operator
# - Used to compare two values
# same as if else

# == (equal to), != (not equal), <= >= (less/greater than)

# 4. Logical Operator - used to combine conditional statements
# used with booleans True/False
# and -> Both must be True
x = 3
y = 10
z = 10

print(x == y and y == z)    # False, because both conditions must be True
print(x == y or y == z)     # or -> at least one must be True
print(not x == y)           # not -> flips True to False (vice versa)

# 5. Identity operators - used to compare the objects, not if theyre equal
# but if theyre actually the same object
# is -> checks if two things are the exact same
# is not -> checks if they are NOT the same
x = 3
y = 3
print(x is y)
print(x is not y)

# 6. Membership Operator - used to test if a seqence is presented in an object
# in -> checks if something exist in a sequence (list)
# not in -> checks if something does NOT exist inside
x = [1, 2, 3, 4, 5] # this is a list
print(4 in x) 
print(9 not in x)