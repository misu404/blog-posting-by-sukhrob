package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Address extends AbsEntity {

    private String lon;

    private String lat;

    private String target;

}
