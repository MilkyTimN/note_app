package com.example.note_app.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "password")
    String password;

    @Column(name = "email", unique = true)
    String email;


    @CreatedDate
    @Column(name = "created_date")
    LocalDate createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    LocalDate updatedDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    Status status;



}
