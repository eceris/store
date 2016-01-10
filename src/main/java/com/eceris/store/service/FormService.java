package com.eceris.store.service;

import java.util.List;

import com.eceris.store.domain.Form;
import com.eceris.store.domain.model.FormModel;

public interface FormService {

    Form createForm(FormModel model);

    Form updateForm(FormModel model);

    void deleteForm(Long id);

    Form getForm(Long id);

    List<Form> getForms();

}
