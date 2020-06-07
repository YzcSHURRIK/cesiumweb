package org.nwpu405118group.cesiumweb.service.service.impl;

import org.nwpu405118group.cesiumweb.service.entity.User;
import org.nwpu405118group.cesiumweb.service.repository.UserRepository;
import org.nwpu405118group.cesiumweb.service.service.UserService;
import org.nwpu405118group.cesiumweb.service.utils.BcryptTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        System.out.println("database:"+user);
        if(user==null)return null;

        if (BcryptTools.match(password, user.getPassword())) {
            return user;
        }
        return null;
    }
}
