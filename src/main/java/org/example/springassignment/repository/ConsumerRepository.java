package org.example.springassignment.repository;
import org.example.springassignment.domain.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ConsumerRepository extends
JpaRepository<Consumer,Long>{//소비자
    Consumer findBycName(String cName);//소비자 이름으로 찾기
    Consumer findBycID(Long cID);//소비자 ID로 찾기
    void deleteBycID(Long cID);}//소비자 ID 삭제[3]