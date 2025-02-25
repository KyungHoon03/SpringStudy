package com.example.ltc_qt_22.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")  // DB 컬럼은 그대로 user_id
    private Integer id;          // 엔티티 내부에서는 id 또는 userId 로 사용

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserGroup> userGroups = new ArrayList<>();

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "kakao_id", length = 255)
    private String kakaoId;

    @Column(name = "apple_id", length = 255)
    private String appleId;

    @Column(name = "nick_name", length = 255)
    private String nickName;

    @Column(name = "profile_image_url", length = 255)
    private String profileImageUrl;

    @Column(name = "refresh_token", length = 255)
    private String refreshToken;

    @Column(name = "ranking_page_view_count")
    private Integer rankingPageViewCount;

    @Column(name = "user_leave_reason", length = 255)
    private String userLeaveReason;

    @Column(name = "fcm_token", length = 255)
    private String fcmToken;

    @Column(name = "device_token", length = 255)
    private String deviceToken;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "name", length = 255)
    private String name;
}
