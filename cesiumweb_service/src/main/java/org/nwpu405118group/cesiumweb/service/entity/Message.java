package org.nwpu405118group.cesiumweb.service.entity;

import java.util.Date;

/*
 * 聊天室实体
 * */
public class Message {
    private String id;
    private String senderId;
    private String receiveId;
    private Date sendTime;
    private String content;
    private Boolean isChecked;
}
