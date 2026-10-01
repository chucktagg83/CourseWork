"""
    A function is a block of code that only runs when its called.
    We can pass data to function using (parameters), and they can return data.
    
    def function_name(parameters):
        #Code block (indented)
        # Perform actions using the parameters
        return value # optional
        
"""

# Simple function without parameters
def my_function():
    print("This is my function")  #this runs when the function is called
    
my_function()

def other_function():
    print("This is another function")
    
other_function()
my_function()

# Function with parameters
def print_full_name(first_name, last_name, middle_name):
    print(f"The name is: {first_name} {last_name} {middle_name}")
    
    
print_full_name("Chuck", "Tagg", "W")

# Functions that return values
# instead of just printing, functions can send back (return) data

def get_full_name(fname, lname):
    return f"{fname} {lname}"  # Sends back the full name as text

# Store the returned value in a variable
full_name = get_full_name("Chuck", "Tagg")
print(full_name)

# functions with default parameters
# A default parameter means the function will use that value-
# if no argument is provided when calling the function

def greet(name="student"):
    print(f"Hello, {name}! Welcome to class")
    
# Calling with no argument -> use the default
greet()

# Calling with argument -> overrides the default
greet("Chuck")