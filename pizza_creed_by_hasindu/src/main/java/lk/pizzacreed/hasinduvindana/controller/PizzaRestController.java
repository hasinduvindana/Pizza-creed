package lk.pizzacreed.hasinduvindana.controller;


import lk.pizzacreed.hasinduvindana.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaRestController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/api/pizzas")
    public Object getAllPizzas() {
        return pizzaService.getAllPizzas();
    }
}
