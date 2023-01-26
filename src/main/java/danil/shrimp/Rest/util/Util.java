package danil.shrimp.Rest.util;

import danil.shrimp.Rest.model.Role;
import danil.shrimp.Rest.model.User;
import danil.shrimp.Rest.service.RoleService;
import danil.shrimp.Rest.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class Util {

    private final RoleService roleService;
    private final UsersService usersService;

    @Autowired
    public Util(RoleService roleService, UsersService usersService) {
        this.roleService = roleService;
        this.usersService = usersService;
    }

    @PostConstruct
    public void initialization() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        Role roleUser = new Role("ROLE_USER");

        if (roleService.getRoles().isEmpty()) {
            roleService.saveRole(roleAdmin);
            roleService.saveRole(roleUser);
        }

        User admin = new User("admin", "admin", "admin", "admin", Set.of(roleAdmin, roleUser));
        usersService.saveUser(admin);

        roleService.saveRole(roleUser);
        User user = new User("user","user", "user", "user", Set.of(roleUser));
        usersService.saveUser(user);

    }
}
