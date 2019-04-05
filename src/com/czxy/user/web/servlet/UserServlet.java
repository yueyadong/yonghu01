package com.czxy.user.web.servlet;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;
import com.czxy.user.domain.User;
import com.czxy.user.service.UserService;

import java.util.List;

public class UserServlet extends BaseServlet {
    //每个Servlet  方法需要调用 service
    // static 共享  会出现线程安全问题一个请求一个线程
    private UserService service = new UserService();

    /**
     * 查询所有信息
     *
     * @return
     */
    public String list() {
        List<User> userList = service.list();
        getRequest().setAttribute("userList", userList);
        return "forward:/user/list.jsp";
    }

    /**
     * 添加指定用户
     *
     * @return
     */
    public String add() {
        User user = toBean(User.class);
        user.setId(CommonUtils.uuid());
        service.add(user);
        return "forward:/user?method=list";
    }

    /**
     * 查询用户信息
     *
     * @return
     */
    public String findUser() {
        User user = toBean(User.class);
        List<User> userlist = service.findUser(user);
        getRequest().setAttribute("userList", userlist);
        return "forward:/user/list.jsp";
    }

    /**
     * 删除用户
     *
     * @return
     */
    public String delUser() {
        User user = toBean(User.class);
        service.delUser(user);
        return "forward:/user?method=list";
    }

    /**
     * 查看信息
     *
     * @return
     */
    public String view() {
        User bean = toBean(User.class);
        //通过前端传递的ID  获取到  对应的用户数据
        User user = service.view(bean);
        getRequest().setAttribute("user", user);
        return "forward/user/view.jsp";
    }

    /**
     * 用户数据查询展示
     *
     * @return
     */
    public String ediView() {
        User bean = toBean(User.class);
        bean = service.view(bean);
        getRequest().setAttribute("user", bean);
        return "/user/edit.jsp";
    }

    /**
     *
     * @return
     */
    public String edit(){
        User bean = toBean(User.class);
        service.edit(bean);
        return "/user?method=list";
    }
}
