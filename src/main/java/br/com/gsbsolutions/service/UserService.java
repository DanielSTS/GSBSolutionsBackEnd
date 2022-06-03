package br.com.gsbsolutions.service;

import br.com.gsbsolutions.dto.UserDto;
import br.com.gsbsolutions.models.User;
import br.com.gsbsolutions.repositories.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

import static br.com.gsbsolutions.mapper.UserMapper.*;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> findAll(){
        return UserToUserDTOList(userRepository.findAll());
    }

    public UserDto save(UserDto userDto){
        User user = userRepository.save(UserDtoToUser(userDto));
        if (user != null)  {
            userDto.setId(user.getId());
            return userDto;
        }
        return null;
    }

}
