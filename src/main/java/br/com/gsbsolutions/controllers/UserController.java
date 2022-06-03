package br.com.gsbsolutions.controllers;

import br.com.gsbsolutions.dto.UserDto;
import br.com.gsbsolutions.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @ApiOperation(value = "Esta operação retorna uma lista de usuários.")
    @GetMapping
    public List<UserDto> findAll(){
        return userService.findAll();
    }
    @ApiOperation(value = "Esta operação cria um novo usuário")
    @PostMapping
    public UserDto save(@RequestBody UserDto user){
        return userService.save(user);
    }

}
