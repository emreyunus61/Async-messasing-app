package com.sixtyone.asyncmessasingapp.model;

public abstract class GenericModel<Model,DTO> {

    public abstract void mapFromCorrespondingDTO(DTO dtoObject);
}
