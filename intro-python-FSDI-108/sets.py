# Sets are used to store multiple items in a single variable
# Sets are UNORDERED, UNINDEXED, and have NO DUPLICATES

# Sets are written with curly brackets {}
fruits = {"apple", "banana", "cherry"}
print(fruits)

# NO DUPLICATES ALLOWED
fruits = {"apple", "banana", "apple"}
print(fruits)

# check if item exists
print("banana" in fruits)

# adding items
fruits.add("orange")
print(fruits)

# add multiple items
fruits.update(["kiwi", "mango"])
print(fruits)

# removing items
fruits.remove("banana")
print(fruits)

# If you arent sure 
fruits.discard("water")
print(fruits)

# Set operations (like in math)
set1 = {1, 2, 3, 4}
set2 = {3, 4, 5, 6}

print(set1.union(set2))  # combine both (no duplicates)
print(set1.intersection(set2))  # Common elements only
print(set1.difference(set2))  # Whats only in set1

#
# MINI CHALLENGE
#

invited_friends = {"Alex", "Sam", "Leo", "Nina"}
rsvped = {"Nina", "Sam", "Jordan"}

print(invited_friends.union(rsvped))
print(rsvped)
print(invited_friends.difference(rsvped))
invited_friends.update(["Ron", "Joe"])
print(invited_friends)
rsvped.remove("Sam")
print(len(rsvped))
if "Leo" in rsvped:
    print("Leo  not coming")
else:
    print("No, he won't be there")

