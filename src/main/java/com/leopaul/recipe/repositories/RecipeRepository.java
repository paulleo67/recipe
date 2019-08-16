package com.leopaul.recipe.repositories;

import com.leopaul.recipe.domain.Category;
import com.leopaul.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
