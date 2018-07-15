package mx.com.axity.services.service.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.service.IProjectService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {

    //@Autowired
    //UserDAO userDAO;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserTO> getUsers() {

        //var usersDO = this.userDAO.findByLastName("Javier");

        //Type listType = new TypeToken<List<UserTO>>() {}.getType();
        //var usersTO = (List<UserTO>)this.modelMapper.map(usersDO, listType);

        List<UserTO> users = new ArrayList<>();
        var user = new UserTO(){{
            setId(1);
            setName("Javier");
            setLastName("Rodriguez");
            setAge(10);
        }};
        users.add(user);

        Type userDAOType = new TypeToken<List<UserDO>>() {}.getType();
        var usersDO = this.modelMapper.map(users, userDAOType);

        return users;
    }
}
