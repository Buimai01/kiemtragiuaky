package org.example.baiktra.repository;

import org.example.baiktra.model.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends CrudRepository<Computer,Long> {
}
