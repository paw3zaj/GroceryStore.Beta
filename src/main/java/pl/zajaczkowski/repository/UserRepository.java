package pl.zajaczkowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.zajaczkowski.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	User findByConfirmationToken(String confirmationToken);
    User findById(Long id);
}
