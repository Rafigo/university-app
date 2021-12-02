import '../styles/globals.css';
import type { AppProps } from 'next/app';
import 'antd/dist/antd.css';
import '../styles/sass/index.scss';
import MainLayout from '../layout/Main';

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <MainLayout>
      <Component {...pageProps} />
    </MainLayout>
  );
}

export default MyApp;
