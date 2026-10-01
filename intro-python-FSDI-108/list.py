# Lists are used to store MULTIPLE items in a singel variable.
# Think of a container that can hold many items
# Lists are written with square brackets []

my_list = [10, 20, 30, 40, 50]
print(my_list)

# list can contain different data types
mixed_list = [1, "apple", 3.5, True]
print(mixed_list)

# You can access list items by their INDEX number
# (Indexing starts at 0)

fruits = ["apple", "banana", "cherry"]
print(fruits[0])
print(fruits[2])

# You can also use a NEGATIVE indexes to count from the end
print(fruits[-1])
print(fruits[-2])

# Modifying List Items
fruits[1] = "mango"
print(fruits)

# Adding Items
fruits.append("orange")  # Adds to the END
print(fruits)

fruits.insert(1, "kiwi")  # Adds to a SPECIFIC index
print(fruits)

# Removing Items
fruits.remove("apple")  # Removes by value
print(fruits)

fruits.pop()   # Removes the last item from the list
print(fruits)

# Looping through a list
for fruit in fruits:  # fruit is a variable, can be word
    print(fruit)
    
# check if item exists
if "mango" in fruits:
    print("Yes, mango is in the list")

# List length
print(len(fruits))  # Number of items in list