/*package com.example.ltc_qt_22.service;


import com.example.ltc_qt_22.dto.UserGroupDto;
import com.example.ltc_qt_22.entity.Group;
import com.example.ltc_qt_22.entity.User;
import com.example.ltc_qt_22.entity.UserGroup;
import com.example.ltc_qt_22.repository.UserGroupRepository;
import com.example.ltc_qt_22.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserGroupRepository userGroupRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<UserGroupDto> getUserGroups(Long userId) {
        List<UserGroupDto> userGroups = userGroupRepository.findUserGroupsWithDetails(userId);
        return userGroups.stream()
                .map(UserGroup::getGroup)
                .collect(Collectors.toList());
    }
}*/

