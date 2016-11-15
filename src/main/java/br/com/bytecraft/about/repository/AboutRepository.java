package br.com.bytecraft.about.repository;

import br.com.bytecraft.about.model.About;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends CrudRepository<About, Integer> {
}
