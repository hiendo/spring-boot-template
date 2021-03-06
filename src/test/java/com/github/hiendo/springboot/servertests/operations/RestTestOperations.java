
package com.github.hiendo.springboot.servertests.operations;


import com.github.hiendo.springboot.entities.TestEntity;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class RestTestOperations {

    private WebTarget webTarget;

    public RestTestOperations(WebTarget webTarget) {
        this.webTarget = webTarget;
    }

    public TestEntity getEntityFromController() {
        return webTarget.path("/testController").request().get(TestEntity.class);
    }

    public TestEntity getEntityFromResource() {
        return webTarget.path("/rest/testResource").request().accept(MediaType.APPLICATION_JSON_TYPE).get(
                TestEntity.class);
    }
}
