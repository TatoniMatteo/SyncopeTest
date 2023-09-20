package org.apache.syncope.core.logic;

import org.springframework.stereotype.Component;

@Component
public class MyRestLogic {

    public String getMessage() {
        return "{\"message\": \"Hello World\"}";
    }
}
