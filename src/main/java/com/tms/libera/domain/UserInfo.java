package com.tms.libera.domain;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.Role;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(exclude = "updatedAt")
public class UserInfo {
    @Id
   // @SequenceGenerator(name = "mySeqGen", sequenceName = "user_info_id_seq", allocationSize = 1)
    //@GeneratedValue(generator = "mySeqGen")
    private Integer id;

    //@Column(name = "first_name")
    private String firstName;

   // @Column(name = "last_name")
    private String lastName;

    //@Column(name = "created")
    private LocalDateTime createdAt;

   // @Column(name = "updated")
    private LocalDateTime updatedAt;

   // @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
