import { useContext } from 'react';
import GlobalContext from '../state/globalContext';

function FluidExample() {
  const { user } = useContext(GlobalContext);

  return (<img src={user?.avatar} alt="" className="rounded-circle"/>
  );
}

export default FluidExample;