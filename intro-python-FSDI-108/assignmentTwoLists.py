#create a list
super_heros = [
    "superman",
    "batman",
    "professor x",
    "robin"    
]
print(super_heros)
#access item by index
print(super_heros[2])
#replace value
super_heros[2] = "wolverine"
print(super_heros)
#remove item by value
super_heros.remove("batman")
#print list and length
print(super_heros)
print(len(super_heros))