package kr.ac.kopo.wnddjgld.springboot_jdbctest.controller;


import kr.ac.kopo.wnddjgld.springboot_jdbctest.domain.Detail;
import kr.ac.kopo.wnddjgld.springboot_jdbctest.domain.Product;
import kr.ac.kopo.wnddjgld.springboot_jdbctest.reoository.DetailRepository;
import kr.ac.kopo.wnddjgld.springboot_jdbctest.reoository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private DetailRepository detailRepository;

    public String requestInsert(Model model) {
        Product product = new Product();
        product.setName("Iphone 17");
        product.setPrice(1200000);

        Detail detail = new Detail();
        detail.setDescription("아이폰 17 2025 신형");
        detail.setWeight(200f);
        detail.setWidth(75f);
        detail.setHeight(150f);

        product.setDetail(detail);
        productRepository.save(product);



        return "viewPage05";
    }
}

