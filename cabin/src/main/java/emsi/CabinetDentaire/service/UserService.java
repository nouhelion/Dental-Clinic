package emsi.CabinetDentaire.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import emsi.CabinetDentaire.dto.UserRegistrationDto;
import emsi.CabinetDentaire.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}