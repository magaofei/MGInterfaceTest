package com.magaofei.tool.service;


import com.magaofei.tool.dao.InterfaceResult;

import java.util.List;

public interface InterfaceResultService {

    List<InterfaceResult> listInterfaceResults(int limit, int offset);

    void saveInterfaceResult(InterfaceResult interfaceResult);

    InterfaceResult getInterfaceResultById(int id);


}
