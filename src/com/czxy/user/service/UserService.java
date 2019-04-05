package com.czxy.user.service;

import com.czxy.user.dao.UserDao;
import com.czxy.user.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserDao dao=new UserDao();
    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> list() {
        return dao.list();
    }

    /**
     * 添加用户信息
     * @param user
     */
    public void add(User user) {
        dao.add(user);


    }

    /**
     * 查询用户信息
     * @param user
     * @return
     */
    public List<User> findUser(User user) {
        List<User> atlist =new ArrayList<User>();
        List<User> list = dao.list();
        for (User u : list) {
             if (u.getUserName().contains(user.getUserName())){
                 atlist.add(u);
             }
        }
        return atlist;
    }

    /**
     *  删除某个用户
     * @param user
     */
    public void delUser(User user) {
        List<User> list = dao.list();
        list.remove(user);
        dao.save(list);
    }

    /**
     *
     * @param bean
     * @return
     */
    public User view(User bean) {
        User reslt=null;
        List<User> temp = dao.list();
        for (User u : temp) {
            if (u.getId().equals(bean.getId())){
            reslt=u;
            }
        }
      return reslt;
    }

    /**
     *
     * @param bean
     */
    public void edit(User bean) {
      List<User> temp=dao.list();
         temp.remove(bean);
         temp.add(bean);
         dao.save(temp);
    }
}
