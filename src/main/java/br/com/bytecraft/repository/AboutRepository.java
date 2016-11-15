package br.com.bytecraft.repository;

import br.com.bytecraft.model.About;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends CrudRepository<About, Integer> {
}
