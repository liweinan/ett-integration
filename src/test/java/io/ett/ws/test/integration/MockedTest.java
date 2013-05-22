package io.ett.ws.test.integration;

import io.ett.ws.test.TestHelper;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: weinanli
 * Date: 5/22/13
 * Time: 2:48 下午
 * To change this template use File | Settings | File Templates.
 */
public class MockedTest {

    @Test
    public void testCreatBZ() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(TestHelper.BASE_URL + "/mocked/bz");
        Form form = new Form().param("bug", "123").param("product", "abc");
        Response response = target.request().post(Entity.form(form));
        Assert.assertEquals(200, response.getStatus());
        Assert.assertEquals("123abc", response.readEntity(String.class));
    }

    @Test
    public void testGetMeadUrl() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(TestHelper.BASE_URL + "/mocked/mead/123/abc");
        Response response = target.request().get();
        Assert.assertEquals(200, response.getStatus());
        Assert.assertEquals("123abc", response.readEntity(String.class));

    }
}
