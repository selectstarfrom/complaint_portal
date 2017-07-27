package com.complaintportal.server.service.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.complaintportal.server.model.entities.AbstractEntity;
import com.complaintportal.server.service.dto.AbstractDTO;

public abstract class AbstractEntityTOConverter<E extends AbstractEntity, D extends AbstractDTO> {

	Class<?> entityClass;
	Class<?> dtoClass;

	public D getDto(E pEntity) {

		D lTarget = getNewDtoInstance();
		BeanUtils.copyProperties(pEntity, lTarget);
		return lTarget;
	}

	public List<D> getDtos(List<E> pEntity) {

		List<D> lTargets = new ArrayList<>();

		for (E lEntity : pEntity) {
			D lTo = getDto(lEntity);
			lTargets.add(lTo);
		}

		return lTargets;
	}

	public E getEnity(D pDto) {
		E lTarget = getNewEntityInstance();
		BeanUtils.copyProperties(pDto, lTarget);
		return lTarget;
	}

	public List<E> getEnities(List<D> pDtos) {
		List<E> lTargets = new ArrayList<>();

		for (D lDto : pDtos) {
			E lTo = getEnity(lDto);
			lTargets.add(lTo);
		}

		return lTargets;
	}

	abstract D getNewDtoInstance();

	abstract E getNewEntityInstance();

}
