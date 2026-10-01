# Tuples are just like lists- they can store multiple items 
# BUT!!! They are IMMUTABLE (you can't change them after creation)

my_tuple = ("apple", "banana", "cherry")
print(my_tuple)

# Accessing items
print(my_tuple[0])
print(my_tuple[1])

# Check if item exists
if "apple" in my_tuple:
    print("Yes, apple is in the tuple")
    
# Lenght of a tuple
print(len(my_tuple))

# Single item tuple
# You MUST add a comma at the end or python wont recognize it as a tuple
single = ("grape")
print(type(single))  # this is a string
tuple = ("water",)
print(type(tuple))   # this is a tuple

# Nested tuples
tuple1 = ("a", "b", "c")
tuple2 = (1, 2, 3)
combine = (tuple1, tuple2)
print(combine)

travel_bag = ("shirt", "shoes", "pants", "jacket", "underwear")
print(travel_bag)
print(travel_bag[1:3])
if "shoes" in travel_bag:
    print("Your ready to walk")
else:
    print("You forgot your shoes")
essentials = ("tootbrush", "charger", "laptop")
final_bag = (travel_bag + essentials)
print(final_bag)
print(len(final_bag))
print(final_bag[-1])
