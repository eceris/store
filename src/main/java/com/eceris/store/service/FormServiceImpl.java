package com.eceris.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.eceris.store.domain.Form;
import com.eceris.store.domain.model.FormModel;
import com.eceris.store.repository.FormRepository;

public class FormServiceImpl implements FormService {

    @Autowired
    FormRepository formRepository;

    @Override
    @Transactional
    public Form createForm(FormModel model) {
        Form entity = new Form(model);
        return formRepository.save(entity);
    }

    @Override
    @Transactional
    public Form updateForm(FormModel model) {
        Form form = formRepository.findOne(model.getId());
        form.setType(model.getType());
        form.setContent(model.getContent());
        form.setDescription(model.getDescription());
        return formRepository.save(form);
    }

    @Override
    @Transactional
    public void deleteForm(Long id) {
        formRepository.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Form getForm(Long id) {
        return formRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Form> getForms() {
        return formRepository.findAll();
    }
}
