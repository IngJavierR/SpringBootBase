package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IprojectFacade;
import mx.com.axity.services.service.IprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class projectFacade implements IprojectFacade {

    @Autowired
    private IprojectService projectService;

    public List<UserTO> getAllUsers() {
        return this.projectService.getUsers();
    }
}
