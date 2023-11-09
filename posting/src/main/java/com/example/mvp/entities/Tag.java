package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "tags")
@SQLDelete(sql = "update tags set status='inactive' where id=?")
@Where(clause = "status='active")
public class Tag extends AbsEntity {



}
