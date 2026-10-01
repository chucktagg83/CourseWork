import { useState } from "react";

function Admin() {
    //const [state, setState] = useState(initialState);
    const [productTitle, setProductTitle] = useState("");
    const [productCategory, setProductCategory] = useState("");
    const [productImage, setProductImage] = useState("");
    const [productPrice, setProductPrice] = useState("");
    const [products, setProducts] = useState([]);

    function saveProduct() {
        console.log("Saving product...");

        const product = {
            title: productTitle,
            categroy: productCategory,
            image: productImage,
            price: productPrice
        }

        setProducts([...products, product]); // Spread operator to add the new product to the existing list of products
    
        // Clear the form fields after saving the product
        setProductTitle("");
        setProductCategory("");
        setProductImage("");
        setProductPrice(""); 
    }
    
    return(
        <div>
            <h1 className='text-center mt-0 w-100' style={{fontSize: "8rem"}}>Store Administration</h1>
            <p className="fs-2 text-secondary d-flex justify-content-center">If you are interested in selling products on our site, please allow us to see a sample!</p>
            <p className="fs-2 text-secondary d-flex justify-content-center">💲💲💲 We collect a 10% surcharge per transaction 💲💲💲</p>

            <section>
                <h2 className='text-uppercase text-center'>Add Product</h2>

                <div className='d-flex justify-content-center  card text-lg-center text-uppercase p-3 w-90 fs-5 bg-light'>
                    <div className='card-body'>
                        <label className="form-label">Title</label>
                        <input 
                            type='text' 
                            className="form-control" 
                            value={productTitle} 
                            onChange = {(event) => setProductTitle(event.target.value)}
                            />
                    </div>
                    
                    <div className='card-body'>
                        <label className="form-label p-2">Category</label>
                        <input 
                            type='text' 
                            className="form-control"
                            value={productCategory}
                            onChange={(event) => setProductCategory(event.target.value)}
                            />
                    </div>

                    <div>
                        <label className="form-label p-2">Image <span className="text-secondary">(URL)</span></label>
                        <input 
                            type="text" 
                            className="form-control" 
                            placeholder="https://www.image.com/1"
                            value={productImage}
                            onChange={(event) => setProductImage(event.target.value)}
                            />
                    </div>

                    <div>
                        <label className="form-label p-2">Price</label>
                        <input 
                            type="number" 
                            className="form-control"
                            value={productPrice}
                            onChange={(event) => setProductPrice(event.target.value)}
                            />
                    </div>

                    <div>
                        <button className="btn btn-success p-2 m-2" onClick={saveProduct}>Introduce Product</button>
                    </div>
                </div>
                <div className='bg-primary-subtle text-dark p-3 m-3 rounded'>
                    <h4 className='d-flex justify-content-center m-4'>Products List:</h4>

                    {
                        products.length === 0
                        ? <p>No products added yet.</p>
                        : (
                            <div className='row '>
                                {products.map(product => (
                                    <div key={product.title} className='col-md-4 mb-3'>
                                        <div className='card'>
                                            <div style={{height: '300px', objectFit: 'cover'}}>
                                                <img src={product.image} alt={product.title} className='card-img-top h-75'></img>
                                            </div>
                                            <div className='card-body'>
                                                <p>{product.category}</p>
                                                <h5>{product.title}</h5>
                                                <p>${product.price}</p>
                                            </div>
                                        </div>
                                    </div>
                                ))}
                            </div>
                        )
                    }
                </div>
            </section>
        </div>
            
    )
}

export default Admin