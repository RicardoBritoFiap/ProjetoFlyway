package com.brito.mypass.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<Usermodel, Long> {
    public Optional<Usermodel> findByUsername(String username);
}
