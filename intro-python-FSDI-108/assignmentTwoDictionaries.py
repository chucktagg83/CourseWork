#create a dictionary with key:value pairs
employee = {
    "name": "Chuck Taggart",
    "position": "Analyst",
    "qualified": True
}
print(employee)
print(len(employee))
#access items by index
print(employee["name"])
print(len(employee))
#adding new keys
employee["experience"] = "3 years"
print(employee)
print(len(employee))
#updating existing values
employee["position"] = "senior analyst"
print(employee)
print(len(employee))
#Removing keys
employee.pop("qualified")
print(employee)
print(len(employee))

#dictionary and legnth printed after each step