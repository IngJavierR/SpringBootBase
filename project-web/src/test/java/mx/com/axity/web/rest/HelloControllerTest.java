package mx.com.axity.web.rest;

import jdk.jshell.spi.ExecutionControl;
import mx.com.axity.services.facade.IProjectFacade;
import mx.com.axity.web.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
@ContextConfiguration(classes = {Application.class})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HelloControllerTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    IProjectFacade IProjectFacade;

    @Test
    public void exampleTest() throws ExecutionControl.NotImplementedException {

        //this.entityManager.persist(new UserDO("Javier", "Rodriguez", 1));

        var users = IProjectFacade.getAllUsers();

        Assert.assertEquals(1, users.size());
    }
}
