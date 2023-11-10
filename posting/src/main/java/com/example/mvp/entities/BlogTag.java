package com.example.mvp.entities;

import com.example.mvp.entities.template.AbsEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity(name = "blog_tags")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogTag extends AbsEntity {

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

}
