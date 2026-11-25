package com.example.lostandfound.repository;

import com.example.lostandfound.entity.Category;
import com.example.lostandfound.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {
}
