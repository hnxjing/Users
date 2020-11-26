package edu.nf.users.controller;

import edu.nf.users.dao.UsersDao;
import edu.nf.users.dao.impl.UsersDaoImpl;
import edu.nf.users.entity.Users;
import org.evergreen.web.ViewResult;
import org.evergreen.web.annotation.RequestMapping;
import org.evergreen.web.view.Json;

import java.util.List;

/**
 * @author 戏精
 * @Date: 2020/11/25/20:05
 */
@RequestMapping("/user")
public class UsersServlet {

    @RequestMapping("/list")
    public ViewResult listUsers() {
        UsersDao dao = new UsersDaoImpl();
        List<Users> list = dao.listUsers();
        return new Json(list);
    }

    @RequestMapping("/insert")
    public ViewResult insertUsers(Users users) {
        UsersDao dao = new UsersDaoImpl();
        String code = "";
        if (dao.insertUsers(users)) {
            code = "200";
        } else {
            code = "500";
        }
        return new Json(code);
    }
}
