package org.apache.syncope.core.rest.cxf.service;

import org.apache.syncope.core.logic.MyRestLogic;
import org.apache.syncope.common.rest.api.service.MyRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyRestServiceImpl extends AbstractServiceImpl implements MyRestService {

    @Autowired
    private MyRestLogic logic;

    @Override
    public String getMessage() {
        return logic.getMessage();
    }
}
