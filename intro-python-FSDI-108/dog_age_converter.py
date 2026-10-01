# Ask the user for their dog's age in human years

dog_age = input("Enter your dog's age in human years: ")

# Convert the input into an integer
dog_age = int(dog_age)

# Perform calculation (multiply by 7), store in variable dog_years
dog_years = dog_age * 7

# Display the result using f-string
print(f"Your dog is {dog_years} years old in dog years!")