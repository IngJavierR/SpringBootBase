package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.ProjectFacade;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/users")
@Api(value="users", description="Operaciones con usuarios")
public class HelloController {

    final static Logger log = Logger.getLogger(HelloController.class);

    @Autowired
    ProjectFacade projectFacade;

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserTO>> index() {
        log.info("Se invoca /users");
        var users = this.projectFacade.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
