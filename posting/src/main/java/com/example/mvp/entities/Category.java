package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@SQLDelete(sql = "update category set status='active' where id=?")
@Where(clause = "status= 'active'")
@EqualsAndHashCode(callSuper = true)
public class Category extends AbsEntity {

    private String name;

}
