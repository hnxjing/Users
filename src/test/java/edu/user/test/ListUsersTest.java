package edu.user.test;

import edu.nf.users.dao.UsersDao;
import edu.nf.users.dao.impl.UsersDaoImpl;
import edu.nf.users.entity.Users;
import org.junit.Test;

import java.util.List;

/**
 * @author 戏精
 * @Date: 2020/11/26/7:05
 */

public class ListUsersTest {

    @Test
    public void listUsers(){
        UsersDao dao = new UsersDaoImpl();
        List<Users> users = dao.listUsers();
        users.forEach( users1 -> {
            System.out.println(users1.getName());
        });
    }

    @Test
   public void insertUsers(){
       UsersDao dao = new UsersDaoImpl();
       Users u= new Users();
       u.setName("阿南");
       u.setAge(20);
       u.setSex("男");
       u.setEmail("969464304@qq.com");
       u.setAddress("江西赣州");
       boolean b= dao.insertUsers(u);
       System.out.println(b);
   }
}
