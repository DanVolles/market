package senaijavadev.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // Indica que a classe é uma classe controller
@RequestMapping (path = "/product") // Indica que a url vai começar com /product (após o caminho da aplicacao)
public class ProductController {

    @Autowired
    private ProductRepository pRepository;

    @PostMapping (path="/add")
    public @ResponseBody String addNewProduct (
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam Double value
    ) {
        Product p = new Product();
        p.setProductName(name);
        p.setDescription(description);
        p.setValue(value);
        pRepository.save(p);
        return "Saved";
    }

    @GetMapping (path = "/all")
    public @ResponseBody Iterable <Product> getAllProducts () {
        return pRepository.findAll();
    }
}
