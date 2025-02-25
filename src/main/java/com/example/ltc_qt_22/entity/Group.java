/*package com.example.ltc_qt_22.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserGroup> userGroups = new ArrayList<>();


    @Column(name = "group_id")
    private Integer groupId;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(length = 255)
    private String description;

    @Column(nullable = false)
    private Integer maxPerson;

    @Column(nullable = false)
    private Integer currentPerson;

    @Column(nullable = false)
    private Boolean isPublic;

    @Column(length = 255)
    private String groupPassword;

    @Column(length = 255)
    private String alarmEndDate;

    @Column(length = 255)
    private String alarmTime;

    @Column(nullable = false)
    private Integer viewCount;

    @Column(length = 255)
    private String groupThumbnailImageUrl;

    @Column(length = 255)
    private String status;

    @Column(length = 255)
    private String alarmUnlockContents;

    private LocalDateTime deletedAt;

    @Column(length = 255)
    private String groupName;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;



}*/
