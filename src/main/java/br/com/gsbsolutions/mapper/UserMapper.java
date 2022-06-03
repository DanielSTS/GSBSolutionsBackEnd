package br.com.gsbsolutions.mapper;

import br.com.gsbsolutions.dto.UserDto;
import br.com.gsbsolutions.models.User;
import org.springframework.beans.BeanUtils;
import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static List<UserDto> UserToUserDTOList(List<User> users){

    List<UserDto> lista = new ArrayList<UserDto>();

        for (User u : users ) {
            lista.add(UserToUserDto(u));
        }
        return lista;
    }

    public static UserDto UserToUserDto(User user){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }

    public static User UserDtoToUser(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }

}
