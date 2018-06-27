package com.magaofei.tool.service.impl;

import com.magaofei.tool.dao.InterfaceResult;
import com.magaofei.tool.dao.mapper.InterfaceResultMapper;
import com.magaofei.tool.service.InterfaceResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterfaceResultServiceImpl implements InterfaceResultService {

    private InterfaceResultMapper interfaceResultMapper;

    @Autowired
    InterfaceResultServiceImpl(InterfaceResultMapper interfaceResultMapper) {
        this.interfaceResultMapper = interfaceResultMapper;
    }

    @Override
    public List<InterfaceResult> listInterfaceResults(int limit, int offset) {
        return interfaceResultMapper.listInterfaceResults(limit, offset);
    }

    @Override
    public void saveInterfaceResult(InterfaceResult interfaceResult) {
        interfaceResultMapper.saveInterfaceResult(interfaceResult);
    }

    @Override
    public InterfaceResult getInterfaceResultById(int id) {
        return interfaceResultMapper.getInterfaceResultById(id);
    }

}
