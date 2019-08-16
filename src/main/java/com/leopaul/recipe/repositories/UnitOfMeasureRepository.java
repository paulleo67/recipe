package com.leopaul.recipe.repositories;

import com.leopaul.recipe.domain.Category;
import com.leopaul.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
