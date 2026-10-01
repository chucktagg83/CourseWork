import { createContext } from "react";

// GlobalContext defines context for the entire application, allowing us to share state and functions across components without prop drilling.
const globalContext = createContext({
    // Define any global state or functions here that you want to share across components
    user: {},  //Default user is an empty object, can store user info like firstName, lastName, email, etc.
    /*client: {},
    product: [],
    addProductToCart: () => {} // Placeholder function for adding a product to the cart, can be implemented later
    */
    })

export default globalContext;