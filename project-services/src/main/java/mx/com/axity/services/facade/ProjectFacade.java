package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProjectFacade {

    @Autowired
    private IProjectService projectService;

    public List<UserTO> getAllUsers() {
        return this.projectService.getUsers();
    }
}
