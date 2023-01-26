package danil.shrimp.Rest.service;

import danil.shrimp.Rest.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRoles();

    List<Role> getUniqAllRoles();

    void saveRole(Role roleAdmin);
}
