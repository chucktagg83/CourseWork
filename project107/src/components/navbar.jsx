//Imports
import { useContext } from 'react'; 
import GlobalContext from '../state/globalContext';

import { Link } from 'react-router-dom';
import { IconUser } from '@tabler/icons-react';



function Navbar(){
  const user = useContext(GlobalContext).user; // Accessing the user object from the global context using useContext hook 
    return(
        <nav className="navbar navbar-expand-lg bg-body-tertiary">
  <div className="container-fluid">
    <a className="navbar-brand" href="#">
      Hometown Farmer's Market
    </a>
    <button
      className="navbar-toggler"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span className="navbar-toggler-icon" />
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <Link className="nav-link active" to={"/"}>
            Home
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" to={"/Catalog"}>
            Catalog
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" to={"/About"}>
            About
          </Link>
        </li>

        <li className="nav-item">
          <Link className="nav-link" to={"/Contact"}>
            Contact Us
          </Link>
        </li>
          
        <li className="nav-item">
          <Link className="nav-link" to={"/Admin"}>
           Admin 
          </Link>
        </li>
        <li className="nav-item">
          <Link className="btn btn-secondary" to={"/profile"}>
          <IconUser stroke={2} /> {user.firstName} {user.lastName}
          </Link>
        </li>
      </ul>
      <form className="d-flex" role="search">
        <input
          className="form-control me-2"
          type="search"
          placeholder="Search"
          aria-label="Search"
        />
        <button className="btn btn-outline-success" type="submit">
          Search
        </button>
      </form>
    </div>
  </div>
</nav>

    )
}

export default Navbar;