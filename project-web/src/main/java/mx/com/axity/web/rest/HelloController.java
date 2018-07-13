package mx.com.axity.web.rest;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private IProjectService projectService;

    @RequestMapping("/")
    public List<UserTO> index() {
        return this.projectService.getUsers();
    }
}
