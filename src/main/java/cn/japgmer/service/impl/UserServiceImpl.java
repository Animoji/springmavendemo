package cn.japgmer.service.impl;

import cn.japgmer.po.User;
import cn.japgmer.repository.UserRepository;
import cn.japgmer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> login(User user) {
        return userRepository.verifyUsrPwd(user);
    }

    public Long saveUser() {
        User user = new User();
        user.setUsername("slb");
        user.setPassword("123456");
        return userRepository.save(user);

    }
}
