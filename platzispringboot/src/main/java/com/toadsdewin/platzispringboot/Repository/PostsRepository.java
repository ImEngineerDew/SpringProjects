package com.toadsdewin.platzispringboot.Repository;

import com.toadsdewin.platzispringboot.Entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,Long>
{

}
