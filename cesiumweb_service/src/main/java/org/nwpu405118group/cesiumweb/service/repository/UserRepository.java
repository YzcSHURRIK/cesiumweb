package org.nwpu405118group.cesiumweb.service.repository;

import org.nwpu405118group.cesiumweb.service.entity.LandMark;
import org.nwpu405118group.cesiumweb.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository  extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
    User findByEmail(String email);
}
