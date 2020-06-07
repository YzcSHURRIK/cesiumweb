package org.nwpu405118group.cesiumweb.service.repository;



import org.nwpu405118group.cesiumweb.service.entity.LandMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LandMarkRepository extends JpaRepository<LandMark,String>, JpaSpecificationExecutor<LandMark> {
}
