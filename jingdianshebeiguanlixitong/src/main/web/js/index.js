$('#tt').tree({
        data: [{
            text: '设备管理',
            state: 'closed',
            children: [{
                text: '设备增加'
            },{
                text: '出库管理'
            },{
                text: '出库查询'
            },{
                text: '入库管理'
            },{
                text: '入库查询'
            },{
                text: '设备盘点'
            }]
        },{
            text: '运行管理',
            state: 'closed',
            children: [{
                text: '设备故障登记'
            },{
                text: '故障维修管理'
            },{
                text: '维修记录查询'
            },{
                text: '设备启用管理'
            },{
                text: '启用记录查询'
            },{
                text: '设备封存管理'
            },{
                text: '封存记录查询'
            }]
        },{
            text: '报废管理',
            state: 'closed',
            children: [{
                text: '到期设备查询'
            },{
                text: '设备报废管理'
            },{
                text: '报废设备查询'
            }]
        },{
            text: '预防维护',
            state: 'closed',
            children: [{
                text: '到期维护设备查询'
            },{
                text: '设备预防维护计划'
            },{
                text: '设备预防维护管理'
            },{
                text: '设备预防维护查询'
            }]
        },{
            text: '基础信息',
            state: 'closed',
            children: [{
                text: '系统参数设置'
            },{
                text: '组织机构设置'
            },{
                text: '职工档案设置'
            },{
                text: '所在仓库管理'
            },{
                text: '供应厂商维护'
            },{
                text: '生产厂商维护'
            }]
        },{
            text: '系统维护',
            state: 'closed',
            children: [{
                text: '角色授权管理'
            },{
                text: '查询操作记录'
            },{
                text: '操作数据清理'
            },{
                text: '数据备份恢复'
            }]
        },{
            text: '权限管理',
            state: 'closed',
            children: [{
                text: '系统'
            },{
                text: '组织'
            },{
                text: '职工'
            },{
                text: '所在'
            },{
                text: '供应'
            },{
                text: '生产'
            }]
        }
        ]
    });