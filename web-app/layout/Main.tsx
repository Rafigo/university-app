import type { NextPage } from 'next';
import { useRouter } from 'next/router';
import { Layout } from 'antd';
import AppHeader from './AppHeader';

const MainLayout: NextPage = ({ children }) => {
  const router = useRouter();

  if (router.pathname === '/account/register') {
    return <Layout>{children}</Layout>;
  }

  return (
    <Layout>
      <AppHeader />
      {children}
    </Layout>
  );
};

export default MainLayout;
