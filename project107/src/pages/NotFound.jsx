import { Link } from 'react-router-dom';

function NotFound() {
    return (
        <div>
            <h1 className='bg-danger bg-opacity-75'>404 - Not Found</h1>
            <p>You stepped out of the Matrix! Go back! <Link to={"/"} className='btn btn-dark'>Go Home</Link></p>

            
        </div>
    )
}

export default NotFound;