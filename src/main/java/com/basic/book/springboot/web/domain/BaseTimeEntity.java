package com.basic.book.springboot.web.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 필드들을 컬럼으로 인식하도록함
@EntityListeners(AuditingEntityListener.class) // Auditing 기능
// Entity들의 날짜를 자동으로 관리하는 역할 -> Posts class가 상속받도록 함
public class BaseTimeEntity {

    @CreatedDate // Entity가 생성되어 저장될 때 시간이 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // Entity의 값을 변경할 때 조회 시간 자동 저장
    private LocalDateTime modifiedDate;
}
