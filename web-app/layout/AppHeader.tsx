import type { NextPage } from 'next';
import { Avatar, Layout, Row } from 'antd';
const { Header } = Layout;
import { UserOutlined } from '@ant-design/icons';
import Link from 'next/link';

const AppHeader: NextPage = () => {
  return (
    <Header className="app-header">
      <Row justify="space-between" align="middle">
        <div>
          <h4>University</h4>
        </div>
        <div>
          <Link href="/account/register">Register</Link>
        </div>
        <div style={{ textAlign: 'right' }}>
          <Avatar size="large" icon={<UserOutlined />} />
        </div>
      </Row>
    </Header>
  );
};

export default AppHeader;
