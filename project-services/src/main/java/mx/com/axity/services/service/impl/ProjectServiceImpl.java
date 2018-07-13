package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.service.IProjectService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Override
    public List<UserTO> getUsers() {
        List<UserTO> users = new ArrayList<>();
        var user = new UserTO(){{
            setId(1);
            setName("Javier");
            setLastName("Rodriguez");
            setAge(10);
        }};
        users.add(user);
        return users;
    }
}
