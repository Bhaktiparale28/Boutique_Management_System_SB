package cts.project.sprint2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cts.project.sprint2.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
