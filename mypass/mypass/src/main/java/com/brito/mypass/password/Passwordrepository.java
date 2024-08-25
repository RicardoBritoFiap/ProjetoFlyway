package com.brito.mypass.password;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Passwordrepository extends JpaRepository<Passwordmodel, Long> {
    
}
