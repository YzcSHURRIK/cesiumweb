package org.nwpu405118group.cesiumweb.service.service;

import org.nwpu405118group.cesiumweb.service.entity.User;

public interface UserService {
    User login(String email, String password);
}
