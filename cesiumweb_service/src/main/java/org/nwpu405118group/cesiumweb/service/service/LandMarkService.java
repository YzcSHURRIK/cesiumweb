package org.nwpu405118group.cesiumweb.service.service;




import org.nwpu405118group.cesiumweb.service.entity.LandMark;

import java.util.List;

public interface LandMarkService {
    List<LandMark> findAll();

    void deleteById(String id);

    void add(LandMark landmark);
}
