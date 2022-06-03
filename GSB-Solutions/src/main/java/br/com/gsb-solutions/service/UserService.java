package br.com.projetocrud.projetocrud.service;

import br.com.projetocrud.projetocrud.models.User;
import br.com.projetocrud.projetocrud.repositories.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){

        return userRepository.findAll();
    }


    public User save(User user){

        return userRepository.save(user);

    }


    public Optional<User> findById(Long id){


        return userRepository.findById(id);
    }

    public User upade(User user){

        return userRepository.save(user);
    }

    public void delete(Long id){

        userRepository.deleteById(id);
    }


}
