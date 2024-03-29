package ideation.platform.api.organizations.roles;

import ideation.platform.api.organizations.roles.groups.RoleGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends PagingAndSortingRepository<Role, Long> {

    Page<Role> getByOrganization_id(Long organizationId, Pageable pageable);

    Page<Role> getByRoleGroupsContains(RoleGroup roleGroup, Pageable pageable);

}
