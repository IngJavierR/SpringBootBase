package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IProjectFacade;
import mx.com.axity.services.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProjectFacade implements IProjectFacade {

    @Autowired
    private IProjectService projectService;

    public List<UserTO> getAllUsers() {
        return this.projectService.getUsers();
    }
}
