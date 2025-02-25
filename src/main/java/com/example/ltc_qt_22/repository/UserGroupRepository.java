package com.example.ltc_qt_22.repository;

import com.example.ltc_qt_22.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {


    List<UserGroup> findByUser_Id(Long id);
}
