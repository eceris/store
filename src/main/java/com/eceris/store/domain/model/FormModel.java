package com.eceris.store.domain.model;

import com.eceris.store.domain.Form.FormType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FormModel {

    private Long id;

    private FormType type;

    private String content;

    private String description;

}
