import { useState } from 'react'
import { Tabs, TabsProps } from 'antd'
import HostList from '@components/hostList'
import ClusterList from '@components/clusterList'
import VmList from '@components/vmList'

import './index.less'

export interface IDataCenterTabsPropsType {
  params: Record<string, any>
}

export default function DataCenterTabs(props: IDataCenterTabsPropsType) {
  const { params } = props
  const onTabChange = (key: string) => {
    setActiveKey(key)
  }
  const items: TabsProps['items'] = [
    // {
    //   label: `摘要`,
    //   key: 'abstract',
    //   children: <div>摘要</div>,
    // },
    {
      label: `集群`,
      key: 'cluster',
      children: <ClusterList params={params} />,
    },
    {
      label: `主机信息`,
      key: 'host',
      children: <HostList params={params} />,
    },
    {
      label: `虚拟机`,
      key: 'vm',
      children: <VmList params={params} />,
    },
  ]
  const [firstTab] = items
  const { key } = firstTab
  const [activeKey, setActiveKey] = useState<string>(`${key}`)
  return (
    <>
      <Tabs
        onChange={onTabChange}
        activeKey={activeKey}
        tabBarGutter={0}
        items={items}
        tabBarStyle={{ margin: 0 }}
        className='custom-tabs'
      />
    </>
  )
}
