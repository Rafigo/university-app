import type { NextPage } from 'next';
import AppRegisterForm from './AppRegisterForm';

const AppRegister: NextPage = () => {
  return (
    <div className="app-register">
      <AppRegisterForm />
    </div>
  );
};

export default AppRegister;
