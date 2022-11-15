package senaijavadev.market.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import senaijavadev.market.entity.Product;
import senaijavadev.market.repository.ProductRepository;

@Controller // Indica que a classe é uma classe controller
@RequestMapping (path = "/api/product") // Indica que a url vai começar com /product (após o caminho da aplicacao)
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductRepository pRepository;

    @PostMapping ("/")
    public @ResponseBody Integer addNewProduct (@RequestBody Product objectProduct) {
        pRepository.save(objectProduct);
        return objectProduct.getId();
    }

    @GetMapping ("/")
    public @ResponseBody Iterable <Product> getAllProducts () {
        return pRepository.findAll();
    }

    @GetMapping ("/{id}")
    public @ResponseBody Optional <Product> getProduct (@PathVariable Integer id) {
        return pRepository.findById(id);
    }

    @PutMapping ("/")
    public @ResponseBody Product update (@RequestBody Product objectProduct) {
        pRepository.save(objectProduct);
        return objectProduct;
    }

    @DeleteMapping ("/{id}")
    public @ResponseBody String delete (@PathVariable Integer id) {
        pRepository.deleteById(id);
        return "Successfully deleted!";
    }
}