# Dictionaries store data in KEY:VALUE pairs.
# Written with curly brackets {}

student = {
    "name" : "Chuck",
    "age" : 42,
    "major" : "Information Technology"
}
print(student)

# Accessign Items
print(student["name"])  # Access by KEY, returns on the value
print(student.get("major")) # another way to access items

# Adding Items
student["graduation_year"] = 2025
print(student)

# Changing Values
student["age"] = 43
print(student)

# Removing Items
student.pop("major") # Removes KEY:VALUE pair
print(student)

# Check IF a key exists
if "name" in student:
    print("Key 'name' exists in the dictionary!")
    # if you want quotations to show up, use opposite of normal
    
# Nested Dictionary
students = {
    "student1" : {"name": "Chuck", "age": 42},
    "student2" : {"name": "Rick", "age": 40}
}
print(students["student2"]["age"]) # Access just the nested value

"""
    MINI CHALLENGE
"""
report = {
    "name": "Chuck",
    "subject": "Geography",
    "grades": (90,75,83)
}
print(report)
average = sum(report["grades"]) / len(report["grades"])
print(report["name"], report["subject"])
if average >= 90:
    print("EXCELLENT!")
elif average >= 70 and average <= 89:
    print("Good Job!")
else:
    print("Needs Improvement")
report.pop("subject")
print(report)