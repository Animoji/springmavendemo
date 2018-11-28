package cn.japgmer.service;


import cn.japgmer.po.User;

import java.util.List;

public interface UserService {

    List<User> login(User cond);

    Long saveUser();

}
