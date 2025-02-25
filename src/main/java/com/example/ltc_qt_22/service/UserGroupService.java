package com.example.ltc_qt_22.service;


//import com.example.ltc_qt_22.dto.UserGroupDto;
//import com.example.ltc_qt_22.entity.Group;
import com.example.ltc_qt_22.entity.User;
import com.example.ltc_qt_22.entity.UserGroup;
//import com.example.ltc_qt_22.repository.GroupRepository;
import com.example.ltc_qt_22.repository.UserGroupRepository;
//import com.example.ltc_qt_22.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserGroupService {
    private final UserGroupRepository userGroupRepository;

    public List<UserGroup> findUserGroupsByUserId(Long userId) {

        System.out.println("service userId: " + userId);

        return userGroupRepository.findByUser_Id(userId);


    }

}
