package lk.pizzacreed.hasinduvindana.repository;

import lk.pizzacreed.hasinduvindana.dao.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
