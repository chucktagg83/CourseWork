import { BrowserRouter, Routes, Route} from 'react-router-dom'
// import order doesn't matter, but looks cleaner if grouped an in alphabetical order
import About from "./pages/About";
import Admin from "./pages/Admin";
import Catalog from "./pages/catalog";
import Contact from "./pages/Contact";
import Home from "./pages/Home";
import NotFound from "./pages/NotFound";
import Profile from "./pages/profile";

import Footer from "./components/footer";
import Navbar from "./components/navbar";

import GlobalProvider from "./state/globalProvider";

import 'bootstrap/dist/css/bootstrap.min.css';
// import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import './App.css'

function App() {
  return (
    <GlobalProvider>
      <BrowserRouter>
        <div className='d-flex flex-column min-vh-100'>
          <Navbar />
          <main className='flex-grow-1'>
            <Routes>
              <Route path='/' element={<Home />} />
              <Route path='/about' element={<About />} />
              <Route path='/catalog' element={<Catalog />} />
              <Route path='/contact' element={<Contact />} />
              <Route path='/admin' element={<Admin />} />
              <Route path='/profile' element={<Profile />} />
              <Route path='*' element={<NotFound />} />
            </Routes>
          </main>
          <Footer />   
        </div>
        
      </BrowserRouter>
    </GlobalProvider>
  )
}

export default App;