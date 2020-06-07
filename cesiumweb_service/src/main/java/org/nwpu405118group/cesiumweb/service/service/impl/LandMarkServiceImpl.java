package org.nwpu405118group.cesiumweb.service.service.impl;






import org.nwpu405118group.cesiumweb.service.entity.LandMark;
import org.nwpu405118group.cesiumweb.service.utils.IdWorker;
import org.nwpu405118group.cesiumweb.service.repository.LandMarkRepository;
import org.nwpu405118group.cesiumweb.service.service.LandMarkService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class LandMarkServiceImpl implements LandMarkService {
    @Autowired
    private LandMarkRepository landMarkRepository;
    @Autowired
    private IdWorker idWorker;

    @Override
    public List<LandMark> findAll() {
        return landMarkRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        landMarkRepository.deleteById(id);
    }

    @Override
    public void add(LandMark landmark) {
        landmark.setId(idWorker.nextId() + "");
        landmark.setTime(new Date());
        landmark.setIsChecked(true);
        landMarkRepository.save(landmark);
    }
}
