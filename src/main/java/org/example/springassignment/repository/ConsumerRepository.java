package org.example.springassignment.repository;
import org.example.springassignment.domain.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ConsumerRepository extends JpaRepository<Consumer,Long>{//소비자
    Consumer findBycID(Long cID);//소비자 ID로 찾기
    //Consumer findBycNumber(Long cNumber);//소비자 번호로 찾기
    void deleteBycID(Long cID);}//소비자 계정 삭제[3]