package com.shopping.controllers;


import com.shopping.model.User;
import com.shopping.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Page<User> getAllUsers() {
        //Pageable page = Pageable.ofSize(1);
        Pageable sortedByPriceDesc = PageRequest.of(0, 3, Sort.by("lastName").descending());
        return this.userRepository.findAll(sortedByPriceDesc);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUserId(@RequestParam(name = "id")  int id) {
        return this.userRepository.findAllById(id);
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User User) {
        return this.userRepository.save(User);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user, Integer id) {
        User found_user = this.userRepository.findAllById(id);
        if(found_user != null){
            user.setId(id);
        }
        return this.userRepository.save(user);
    }
}
