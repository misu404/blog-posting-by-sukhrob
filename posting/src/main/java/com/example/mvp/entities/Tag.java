package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "tags")
@SQLDelete(sql = "update tags set status='inactive' where id=?")
@Where(clause = "status='active")
public class Tag extends AbsEntity {

    @ManyToMany(mappedBy = "tags")
    private Set<Blog> blogs = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "user")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "user_tagged")
    private User userTagged;

}
