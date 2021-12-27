package dao;

import base.BaseDao;
import entity.User;
import java.util.List;
import org.hibernate.query.Query;

public class UserDao extends BaseDao {

  public List<User> findAll(){

    Query query = getCurrentSession().createQuery(
        "select user from User user");

    return query.list();
  }

}
