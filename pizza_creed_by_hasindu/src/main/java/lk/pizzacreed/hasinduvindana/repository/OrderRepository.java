package lk.pizzacreed.hasinduvindana.repository;

import lk.pizzacreed.hasinduvindana.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}