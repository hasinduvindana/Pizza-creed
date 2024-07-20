package lk.pizzacreed.hasinduvindana.repository;

import lk.pizzacreed.hasinduvindana.dao.ShoppingBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasket, Long> {

}
