package br.com.gsbsolutions.repositories;


import br.com.gsbsolutions.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {


}
