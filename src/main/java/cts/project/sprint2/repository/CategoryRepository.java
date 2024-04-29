package cts.project.sprint2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.project.sprint2.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
