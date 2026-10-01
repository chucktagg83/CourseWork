import Product from "../components/Product";
import "./Catalog.css";
import DataService from "../services/dataService";
import { useEffect, useState } from "react";

function Catalog(){
    const [products, setProducts] = useState ([]);
    const [categories, setCategories] = useState ([]);// To hold the categories data 
    const [productsToDisplay, setProductsToDisplay] = useState ([]); // To hold the products to display based on the selected category
   
   function loadCatalog(){
    let service = new DataService();
    let data = service.getProducts();
    setProductsToDisplay(data);//initially display all products
    let cats = ["fruit","berry"]//create a placeholder for the categories
    setCategories(cats);
   }

   function filter(category)
   {
    let list = [];
    // find the products that match the category
    for(let i=0; i < products.length; i++)
    {
        let prod = products[i];
        if (prod.category === category)
        {
            list.push(prod);
        }
    }
    setProductsToDisplay(list);
   }

    // const products = [];
    useEffect(()=>
        {
            // load your data
            let service = new DataService();
            let data = service.getProducts();
            setProducts(data);
            loadCatalog();
    },[]); //the empty array [] means this effect runs only ONCE 


       return(
        <div className="catalog">
            <h1>Check our amazing products</h1>
            <div className='filter-buttons'>
            {categories.map(cat => <button key={cat} onClick={() => filter(cat)}>{cat}</button>)}
            </div>
            <br/>
            <div className="products-grid"> 
               {productsToDisplay.map(prod => <Product key={prod._id} data={prod}/>)} 
            </div>
        </div>
    )
}

export default Catalog;