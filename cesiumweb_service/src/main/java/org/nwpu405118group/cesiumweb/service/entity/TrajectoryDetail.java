package org.nwpu405118group.cesiumweb.service.entity;

import java.util.Date;

/*
 * 轨迹详细实体
 * */
public class TrajectoryDetail {
    private String id;
    private String userId;
    private String trajectoryId;
    private Double longitude;//经度
    private Double latitude;//纬度
    private Double altitude;//高度
    private Date insertTime;
    private String content;
}
