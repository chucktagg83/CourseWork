function About() {
    return (
        <div className='m-5'>
            <div>
                <h1>About Us!</h1>
                
                <p className='d-flex justify-content-center fs-3'>Welcome to Our Online Store, Happy Shopping!</p>  
                <p className='d-flex justify-content-center fs-4'> Lorem ipsum, dolor sit amet consectetur adipisicing elit. Vitae, accusamus laboriosam sapiente asperiores iste numquam neque odit ullam illo doloremque, voluptate consectetur esse sint temporibus adipisci dolorum! Rerum ex, impedit odio, quasi consequuntur excepturi cupiditate quo ullam non esse vero eaque debitis consectetur dicta veritatis.</p> 
            <hr />
            </div>
            <div className='d-flex justify-content-center border-light-subtle m-5'>
                <img src={"/public/images/farmersMarket.png"} alt="Our Lot"></img>
            </div>
            <div className='table-bordered border-dark d-flex justify-content-center text' >
                <table className='table-bordered border' style={{width: '80%'}}>
                    <thead>
                        <tr>
                            <th style={{ border: '3px solid black', fontSize: '1.5rem' }}>Booth Location</th>
                            <th style={{ border: '3px solid black', fontSize: '1.5rem' }}>Booth Size</th>
                            <th style={{ border: '3px solid black', fontSize: '1.5rem' }}>Price p/Day</th>
                            <th style={{ border: '3px solid black', fontSize: '1.5rem' }}>Price p/Month</th>   
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Inside</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Small</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$50</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$350</td>
                        </tr>
                        <tr>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Inside</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Large</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$80</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$600</td>
                        </tr>
                        <tr>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Outside</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Small</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$40</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$300</td>
                        </tr>
                        <tr>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Outside</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>Large</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$70</td>
                            <td style={{ border: '1px solid black', fontSize: '1.2rem' }}>$500</td>
                        </tr>

                    </tbody>
                </table>
            </div>
            
        </div>
    )
}

export default About