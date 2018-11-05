package mx.com.axity.services.service;

import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class projectServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        var users = this.projectService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
