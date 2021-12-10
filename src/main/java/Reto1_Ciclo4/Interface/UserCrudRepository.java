/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto1_Ciclo4.Interface;

import Reto1_Ciclo4.Modelo.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juanh
 */
public interface UserCrudRepository extends CrudRepository <User,Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    
}
