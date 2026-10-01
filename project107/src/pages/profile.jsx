import { useContext } from 'react';
import GlobalContext from '../state/globalContext';
import user from '../state/globalContext';
import FluidExample from '../components/FluidExample';

function Profile() {
    // const { user } = useContext(GlobalContext); // Destructuring user from the global context using useContext hook
    const user = useContext(GlobalContext).user; // Accessing the user object from the global context using useContext hook
    return (
        <div className='d-grid gap-3' style={{ height: '100vh', width: '100vw' }}>
            <div className='mt-5'>
               <h1 >Welcome to Your Profile</h1> 
            </div>
            <section className='d-flex flex-column align-items-center gap-3'>
               <h2>{user.firstName} {user.lastName}</h2> 
               <FluidExample />
               <button className='bg-secondary text-light'>Edit Profile</button>
            </section>
            <section className='d-flex flex-column align-items-center gap-3'>
                <h2>Contact Information</h2>
                <h3 className="text-secondary">
                <a href={`mailto:${user.email}`} className="text-secondary">
                    {user.email}
                </a>
                </h3>   
                <p className='font-weight-heavy'>{user.address.street}, {user.address.city}, {user.address.state} {user.address.zip}</p>
            </section>
            
            
            
        </div>
    );
}

export default Profile; FluidExample;