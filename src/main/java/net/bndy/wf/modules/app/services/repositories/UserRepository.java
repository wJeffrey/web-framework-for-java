package net.bndy.wf.modules.app.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bndy.wf.modules.app.models.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
