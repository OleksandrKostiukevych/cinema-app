package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> findByEmail = session.createQuery(
                    "FROM Role WHERE name = :name", Role.class);
            findByEmail.setParameter("name", roleName);
            return findByEmail.uniqueResult();
        } catch (Exception e) {
            throw new DataProcessingException("Role " + roleName + " not found", e);
        }
    }
}
