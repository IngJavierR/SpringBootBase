package mx.com.axity.web.rest;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.ProjectFacade;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    final static Logger log = Logger.getLogger(HelloController.class);

    @Autowired
    ProjectFacade projectFacade;

    @RequestMapping("/users")
    public List<UserTO> index() {
        log.info("Se invoca /users");
        return this.projectFacade.getAllUsers();
    }
}
