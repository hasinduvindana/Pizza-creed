package lk.pizzacreed.hasinduvindana.service;

import lk.pizzacreed.hasinduvindana.dao.Order;
import lk.pizzacreed.hasinduvindana.dao.ShoppingBasket;
import lk.pizzacreed.hasinduvindana.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Transactional
    public Order checkout(ShoppingBasket shoppingBasket) {
        //TODO: Implement this method
        return null;
    }
}
