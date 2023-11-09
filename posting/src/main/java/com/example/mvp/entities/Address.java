package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.Where;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Where(clause = "status='active'")
public class Address extends AbsEntity {

    private String lon;

    private String lat;

    private String target;

}
