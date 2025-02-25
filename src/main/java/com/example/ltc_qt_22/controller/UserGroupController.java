package com.example.ltc_qt_22.controller;


//import com.example.ltc_qt_22.dto.UserGroupDto;
import com.example.ltc_qt_22.entity.UserGroup;
//import com.example.ltc_qt_22.repository.GroupRepository;
import com.example.ltc_qt_22.repository.UserGroupRepository;
//import com.example.ltc_qt_22.repository.UserRepository;
//import com.example.ltc_qt_22.service.GroupService;
import com.example.ltc_qt_22.service.UserGroupService;
//import com.example.ltc_qt_22.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserGroupController {

    private final UserGroupService userGroupService;

    @GetMapping("/user/{userId}/groups")
    public List<UserGroup> getUserGroups(@PathVariable Long userId) {

        System.out.println("Controller userId: " + userId);
        return userGroupService.findUserGroupsByUserId(userId);

    }




}
