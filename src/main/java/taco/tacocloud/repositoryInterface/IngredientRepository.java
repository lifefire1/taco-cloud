package taco.tacocloud.repositoryInterface;

import org.springframework.beans.factory.annotation.Autowired;
import taco.tacocloud.percistance.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}
