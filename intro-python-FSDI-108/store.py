from catalog import catalog # import your catalog list

# Global shopping cart
cart = []


# Everytime it runs in the terminal, I want it to run the name

# Helper Fuctions (stroe name/ menu)
def print_header(text):
    print("-------------------------")
    print(text)
    print("-------------------------")
    
def print_menu():
    print("Menu")
    print("1.- View Catalog")
    print("2.- Search Product")
    print("3.- View Cart")
    # add more options if needed
    print("4.- Clear Cart")
    print("Q.- Quit")
    
# Catalog and Cart Function
def print_catalog():
    print_header("- Our Catalog -")
    for prod in catalog:
        print(f"| {prod["id"]} | {prod["title"].ljust(15)} | ${prod["price"]:.2f}")
        
    answer = input("Type ID to add (N to close): ")
    if answer.lower() == "n":
        return
    else:
        add_product_to_cart(answer)
    print("----------------------")
    
    
def add_product_to_cart(prod_id):
    found = False
    for prod in catalog:
        if str(prod["id"]) == str(prod_id):
            found = True
            cart.append(prod)  # add protduct to the cart (bag)
            print(f"{prod["title"]} added to your cart")
            break
        
    if not found:
        print("Item does not exist")
        
def search_product():
    text = input("Search text: ").lower()
    found = False
    for prod in catalog:
        if text in prod["title"].lower():
            found = True
            print(f"| {prod["id"]} | {prod["title"].ljust(15)} | ${prod["price"]:.2f}")
            choice = input("Do you want to add this item to your cart? (y/n): ")
            if choice.lower() == "y":
                add_product_to_cart(prod["id"])
            break  # stops after first match
    if not found:
        print("Sorry, this item doesn't exist.")
    print("---------------------------")

def view_cart():
    print_header("Your Cart")
    if not cart:
        print("Your cart is empty.")
    else:
        for prod in cart:
            print(f"| {prod["id"]} | {prod["title"].ljust(15)} | ${prod["price"]:.2f}")
        cart_total()  # shows total price
            
def cart_total():
    total = 0  # start from 0 and add prices up
    for prod in cart:
        total += prod["price"] # add product price to total
    print(f"TOtal: $ {total}")
    # print(f"Total is: ${total}")

def clear_cart():
    cart.clear()
    print("Your cart has been cleared")



# main Program Loop
option = ""
while option != "q" and option != "Q":
    print_header("Welcome to STORE")
    print_menu()    
    
    option = input("Choose and option: ")
    
    if option == "1":
        print_catalog()
    elif option == "2":
        search_product()
    elif option == "3":
        view_cart()
    elif option == "4":
        clear_cart()
    elif option == "q" or option == "Q":
        print("Good Bye!")
        break
    else:
        print("** Error: invalid option")
        print("------------------------")