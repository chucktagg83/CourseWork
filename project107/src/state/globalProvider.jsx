import { useState } from "react";
import GlobalContext from "../state/globalContext";

const GlobalProvider = (props) => {
    // const [state, setState] = useState(initialState); // Example of how to use state in the provider, can be customized based on your needs
    const [user, setUser] = useState({
        id: 65,
        firstName: "Chuck",
        lastName: "Tagg",
        email: "cwtaggart@sdgku.edu",
        avatar: "https://i.etsystatic.com/16078885/r/il/938f4f/4015918690/il_1080xN.4015918690_6jhr.jpg",
        address: {
            street: "6452 9th Ave",
            city: "Aurora",
            state: "CO",
            zip: "80011"
        }
    })

    return (
        <GlobalContext.Provider value={{
            user // user: user 
        }}>

        {props.children} {/* This allows any child components wrapped by GlobalProvider to access the context values provided here, making it a powerful way to share state and functions across the entire application without prop drilling. */}
        </GlobalContext.Provider>
    )
}

export default GlobalProvider;