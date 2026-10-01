import { useState } from 'react';

function Contact() {
    //      [state, setState]
    const [isEmailVisible, setIsEmailVisible] = useState(true)

    function showEmail() {
        setIsEmailVisible(true)
    }

    function hideEmail() {
        setIsEmailVisible(false)
    }

    return (
        <div className="m-5 border border-dark p-3">
            <h1 className='fs-1 mb-3'>Contact Us! We Would Love to Hear From You!</h1>
            <p className='fs-3 mt-5'>Lorem, ipsum dolor sit amet consectetur adipisicing elit. A
            liquid hic, officia asperiores vero totam voluptatem! Perspiciatis consequuntur reprehenderit, velit debitis excepturi ut ullam odit eveniet cupiditate veniam consequatur, repudiandae voluptate quasi in quis, ad dolorum alias exercitationem animi autem. Sed quod et cupiditate fugit similique sint, delectus asperiores blanditiis soluta excepturi culpa tempora at numquam, consequatur dolorem esse voluptatem minus aperiam quia dignissimos quam, iusto dicta. Fuga iste doloremque ullam adipisci aspernatur debitis laborum ab quasi suscipit reprehenderit velit at quibusdam obcaecati dolores fugiat quae eius, ipsa dolore beatae illum. Expedita possimus natus incidunt? Sint impedit esse perspiciatis tenetur. Dolores laboriosam delectus aperiam excepturi molestias molestiae accusamus asperiores, officiis voluptas cupiditate velit dolore similique in odit praesentium natus quibusdam optio alias dolorum reprehenderit sequi dignissimos culpa consequuntur voluptates? Dignissimos hic itaque ullam, minima magni voluptate quisquam facere quas nobis quod laudantium maiores pariatur! Obcaecati distinctio, laboriosam dicta pariatur quis optio!</p>        
            <p className='fs-2 d-flex justify-content-center text-danger'>Phone: (804)-387-2083</p>
            {
                isEmailVisible == true
                ? <p className="fs-3 text-primary d-flex justify-content-center">HometownFM@gmail.com</p>
                : <p className="fs-3 text-primary d-flex justify-content-center">⬇️⬇️⬇️Click the button below to see our email⬇️⬇️⬇️</p>
            }
            <div className='d-flex justify-content-center'>
                <button className="btn btn-success p-1 m-1" onClick={showEmail}>Show my email</button>
                <button className="btn btn-dark p-1 m-1" onClick={hideEmail}>Hide my email</button>
            </div>
        </div>
    )
}

export default Contact