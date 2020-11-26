package edu.nf.users.dao.impl;

import edu.nf.users.dao.UsersDao;
import edu.nf.users.entity.Users;
import edu.nf.users.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 戏精
 * @Date: 2020/11/25/19:39
 */
public class UsersDaoImpl implements UsersDao {

    @Override
    public List<Users> listUsers() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).listUsers();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public boolean insertUsers(Users users) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).insertUsers(users);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
