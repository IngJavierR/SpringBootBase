package mx.com.axity.services.facade;

import jdk.jshell.spi.ExecutionControl;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProjectFacade {

    @Autowired
    private IProjectService projectService;

    public List<UserTO> getAllUsers() throws ExecutionControl.NotImplementedException {
        //throw new ExecutionControl.NotImplementedException("Error");
        return this.projectService.getUsers();
    }
}
