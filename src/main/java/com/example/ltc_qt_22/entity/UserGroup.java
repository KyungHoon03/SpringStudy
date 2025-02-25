package com.example.ltc_qt_22.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_group")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserGroup {
    public enum AlarmType {
        SOUND, VIBRATION, ALL
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_group_id;

    // 필드 이름을 'user'로 변경 (JoinColumn은 그대로 유지하여 DB 컬럼은 'user_id'로 생성)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "alarm_type", nullable = false)
    private AlarmType alarmType;

    @Column(name = "music_title", length = 255)
    private String musicTitle;

    @Column(name = "volume")
    private Integer volume;

    @Column(name = "score")
    private Integer score;

    @Column(name = "view_count")
    private Integer viewCount;

    @Column(name = "alarm_unlock_count")
    private Integer alarmUnlockCount;

    @Column(name = "is_group_master")
    private Boolean isGroupMaster;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
