package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Setter
@Getter
@ToString
@SQLDelete(sql = "update user set deleted=true where id=?")
@Where(clause = "deleted=false")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbsEntity {

    private String firstName;

    private String lastName;

}
