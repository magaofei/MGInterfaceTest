package com.magaofei.tool.service.impl;

import com.magaofei.tool.dao.InterfaceTask;
import com.magaofei.tool.dao.mapper.InterfaceTaskMapper;
import com.magaofei.tool.service.InterfaceTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InterfaceTaskServiceImpl implements InterfaceTaskService {


    private final InterfaceTaskMapper interfaceTaskMapper;

    @Autowired
    public InterfaceTaskServiceImpl(InterfaceTaskMapper interfaceTaskMapper) {
        this.interfaceTaskMapper = interfaceTaskMapper;
    }

    @Override
    public List<InterfaceTask> listInterfaceTask(int limit, int offset) {
        return interfaceTaskMapper.listInterfaceTasks(limit, offset);
    }
}
