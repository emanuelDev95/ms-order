package com.egvc.msorder.commons.mappers;


import com.egvc.msorder.commons.entities.AbstractEntity;

public interface GenericMapper<D,E extends AbstractEntity> {

    E toEntity(D dto);

    D toDto(E entity);


}