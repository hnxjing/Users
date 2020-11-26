package edu.nf.users.dao;

import edu.nf.users.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 戏精
 * @Date: 2020/11/25/19:18
 */
public interface UsersDao {
    List<Users> listUsers();

    boolean insertUsers(Users users);


}
