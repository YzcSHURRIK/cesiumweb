package org.nwpu405118group.cesiumweb.service.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/*
 * 用户实体
 * */

@Entity
@Table(name="user")
@Data public class User {
    @Id
    private String id;
    private String email;
    private String password;
    private String nickname;
    private String sex;
    private Date birthday;
    private String image;
    private String information;
}
