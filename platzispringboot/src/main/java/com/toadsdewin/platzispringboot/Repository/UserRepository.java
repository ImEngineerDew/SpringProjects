package com.toadsdewin.platzispringboot.Repository;

import com.toadsdewin.platzispringboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
