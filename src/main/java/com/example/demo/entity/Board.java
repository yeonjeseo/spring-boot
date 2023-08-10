package com.example.demo.entity;

import lombok.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//import javax.persistence.*;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
@Table(name = "board")
@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(length = 255)
    private String title;

    @Column(length = 255)
    private String content;

    @Builder
    public Board(String title, String content) {
        this.title = title; this.content = content;
    }
}
