package com.czxy.user.dao;

import cn.itcast.xml.XmlUtils;
import com.czxy.user.domain.User;

import java.util.List;

public class UserDao {

    private static final String DATABASE_PATH="D:/tmp/day05.xml";
    /**
     *查询信息
     * @return
     */
    public List<User> list() {
        return XmlUtils.readAll(DATABASE_PATH,User.class);
    }

    /**
     * 追加用户信息
     * @param user
     */
    public void add(User user) {
        XmlUtils.write(DATABASE_PATH,user,true);
    }

    /**
     *   删除后 覆盖
     * @param userlist
     */
    public void save(List<User> userlist) {
      XmlUtils.write(DATABASE_PATH,userlist,false);

    }


}
