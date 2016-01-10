package com.eceris.store.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.eceris.store.domain.model.FormModel;

import lombok.Data;

@Data
@Entity
public class Form extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private FormType type;

    @Column
    private String content;

    @Column
    private String description;

    public enum FormType {
        HEADER, BODY, FOOTER;
    }

    public Form(FormModel model) {
        this.type = model.getType();
        this.content = model.getContent();
        this.description = model.getDescription();
    }
}
