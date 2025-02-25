/*package com.example.ltc_qt_22.service;

import com.example.ltc_qt_22.dto.UserGroupDto;
import com.example.ltc_qt_22.entity.Group;
import com.example.ltc_qt_22.entity.User;
import com.example.ltc_qt_22.entity.UserGroup;
import com.example.ltc_qt_22.repository.GroupRepository;
import com.example.ltc_qt_22.repository.UserGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository groupRepository;
    private final UserGroupRepository userGroupRepository;

    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    public List<User> getGroupUsers(Long groupId) {
        List<UserGroupDto> userGroups = userGroupRepository.findUserGroupsWithDetails(groupId);
        return userGroups;
    }
}
*/