package com.example.ExcommerceWebsite;

import com.example.ExcommerceWebsite.Users;
import com.example.ExcommerceWebsite.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private Services userService;

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new Users());
        return "signup";
    }

    @PostMapping("/signup")
    public String submitSignupForm(@ModelAttribute("user") Users user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

    @PostMapping("/login")
    public String submitLoginForm(@ModelAttribute("user") Users user, Model model) {
        Users existingUser = userService.findByEmail(user.getEmail());
        if (existingUser != null && user.getPassword().equals(existingUser.getPassword())) {
            return "redirect:/signed";
        }
        model.addAttribute("error", "Invalid email or password");
        return "login";
    }

    @GetMapping("/home")
    public String showWelcomePage() {
        return "index";
    }

    @GetMapping("/signed")
    public String showSignedPage() {
        return "user-signed-up";
    }

    @GetMapping("/profile/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Users user = userService.findById(id);
        if (user != null) {
            model.addAttribute("user", user);
            return "profile";
        }
        return "redirect:/error";
    }

    @PostMapping("/profile/{id}")
    public String submitEditForm(@PathVariable("id") Integer id, @ModelAttribute("user") Users user) {
        user.setId(id);
        userService.saveUser(user);
        return "redirect:/signed";
    }

    @GetMapping("/mobiles")
    public String mobilePage( ){
        return "mobiles";
    }

    @GetMapping("/iphone15")
    public String mobilePage1( ){
        return "mobiles/iphone15";
    }
    @GetMapping("/iphone15pro")
    public String mobilePage2( ){
        return "mobiles/iphone15pro";
    }
    @GetMapping("/iphone15plus")
    public String mobilePage3( ){
        return "mobiles/iphone15plus";
    }
    @GetMapping("/iphone15promax")
    public String mobilePage4( ){
        return "mobiles/iphone15promax";
    }
    @GetMapping("/vivo")
    public String mobilePage5( ){
        return "mobiles/vivo";
    }
    @GetMapping("/oppo")
    public String mobilePage6( ){
        return "mobiles/oppo";
    }
    @GetMapping("/realme")
    public String mobilePage7( ){
        return "mobiles/realme";
    }
    @GetMapping("/redmi")
    public String mobilePage8( ){
        return "mobiles/redmi";
    }
    @GetMapping("/nothing")
    public String mobilePage9( ){
        return "mobiles/nothing";
    }
    @GetMapping("/samsung")
    public String mobilePage10( ){
        return "mobiles/samsung";
    }
    @GetMapping("/moto")
    public String mobilePage11( ){
        return "mobiles/moto";
    }
    @GetMapping("/techno")
    public String mobilePage12( ){
        return "mobiles/techno";
    }
    @GetMapping("/poco")
    public String mobilePage13( ){
        return "mobiles/poco";
    }
    @GetMapping("/infinix")
    public String mobilePage14( ){
        return "mobiles/infinix";
    }
    @GetMapping("/iqoo")
    public String mobilePage15( ){
        return "mobiles/iqoo";
    }
    @GetMapping("/oneplus")
    public String mobilePage16( ){
        return "mobiles/oneplus";
    }

    @GetMapping("/dresses")
    public String dressesPage( ){
        return "dresses";
    }

    @GetMapping("/kb1")
    public String dressesPage1( ){
        return "dresses/kb1";
    }
    @GetMapping("/kb2")
    public String dressesPage2( ){
        return "dresses/kb2";
    }
    @GetMapping("/kb3")
    public String dressesPage3( ){
        return "dresses/kb3";
    }
    @GetMapping("/kb4")
    public String dressesPage4( ){
        return "dresses/kb4";
    }
    @GetMapping("/kg1")
    public String dressesPage5( ){
        return "dresses/kg1";
    }
    @GetMapping("/kg2")
    public String dressesPage6( ){
        return "dresses/kg2";
    }
    @GetMapping("/kg3")
    public String dressesPage7( ){
        return "dresses/kg3";
    }
    @GetMapping("/kg4")
    public String dressesPage8( ){
        return "dresses/kg4";
    }
    @GetMapping("/m1")
    public String dressesPage9( ){
        return "dresses/m1";
    }
    @GetMapping("/m2")
    public String dressesPage10( ){
        return "dresses/m2";
    }
    @GetMapping("/m3")
    public String dressesPage11( ){
        return "dresses/m3";
    }
    @GetMapping("/m4")
    public String dressesPage12( ){
        return "dresses/m4";
    }
    @GetMapping("/w1")
    public String dressesPage13( ){
        return "dresses/w1";
    }
    @GetMapping("/w2")
    public String dressesPage14( ){
        return "dresses/w2";
    }
    @GetMapping("/w3")
    public String dressesPage15( ){
        return "dresses/w3";
    }
    @GetMapping("/w4")
    public String dressesPage16( ){
        return "dresses/w4";
    }

    @GetMapping("/laptops")
    public String laptopsPage( ){
        return "laptops";
    }

    @GetMapping("/laptop1")
    public String laptopsPage1( ){
        return "laptops/laptop1";
    }
    @GetMapping("/laptop2")
    public String laptopsPage2( ){
        return "laptops/laptop2";
    }
    @GetMapping("/laptop3")
    public String laptopsPage3( ){
        return "laptops/laptop3";
    }
    @GetMapping("/laptop4")
    public String laptopsPage4( ){
        return "laptops/laptop4";
    }
    @GetMapping("/laptop5")
    public String laptopsPage5( ){
        return "laptops/laptop5";
    }
    @GetMapping("/laptop6")
    public String laptopsPage6( ){
        return "laptops/laptop6";
    }
    @GetMapping("/laptop7")
    public String laptopsPage7( ){
        return "laptops/laptop7";
    }
    @GetMapping("/laptop8")
    public String laptopsPage8( ){
        return "laptops/laptop8";
    }
    @GetMapping("/laptop9")
    public String laptopsPage9( ){
        return "laptops/laptop9";
    }
    @GetMapping("/laptop10")
    public String laptopsPage10( ){
        return "laptops/laptop10";
    }
    @GetMapping("/laptop11")
    public String laptopsPage11( ){
        return "laptops/laptop11";
    }
    @GetMapping("/laptop12")
    public String laptopsPage12( ){
        return "laptops/laptop12";
    }
    @GetMapping("/laptop13")
    public String laptopsPage13( ){
        return "laptops/laptop13";
    }
    @GetMapping("/laptop14")
    public String laptopsPage14( ){
        return "laptops/laptop14";
    }
    @GetMapping("/laptop15")
    public String laptopsPage15( ){
        return "laptops/laptop15";
    }
    @GetMapping("/laptop16")
    public String laptopsPage16( ){
        return "laptops/laptop16";
    }

    @GetMapping("/books")
    public String booksPage( ){
        return "books";
    }

    @GetMapping("/eb1")
    public String booksPage1( ){
        return "books/eb1";
    }
    @GetMapping("/eb2")
    public String booksPage2( ){
        return "books/eb2";
    }
    @GetMapping("/eb3")
    public String booksPage3( ){
        return "books/eb3";
    }
    @GetMapping("/eb4")
    public String booksPage4( ){
        return "books/eb4";
    }
    @GetMapping("/eb5")
    public String booksPage5( ){
        return "books/eb5";
    }
    @GetMapping("/fb1")
    public String booksPage6( ){
        return "books/fb1";
    }
    @GetMapping("/fb2")
    public String booksPage7( ){
        return "books/fb2";
    }
    @GetMapping("/fb3")
    public String booksPage8( ){
        return "books/fb3";
    }
    @GetMapping("/fb4")
    public String booksPage9( ){
        return "books/fb4";
    }
    @GetMapping("/fb5")
    public String booksPage10( ){
        return "books/fb5";
    }

    @GetMapping("/orders")
    public String ordersPage( ){
        return "orders";
    }

}
