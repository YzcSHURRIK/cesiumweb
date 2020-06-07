package org.nwpu405118group.cesiumweb.service.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/*
 * 地标实体
 * */

@Entity
@Table(name="landmark")
@AllArgsConstructor
@Data public class LandMark implements Serializable {
    @Id
    private String id;
    private String userId;
    private Double longitude;//经度
    private Double latitude;//纬度;
    private Double altitude;//高度
    private Date time;
    private String type;
    private String information;
    private String picture;
    private Boolean isChecked;
    private String name;

}
