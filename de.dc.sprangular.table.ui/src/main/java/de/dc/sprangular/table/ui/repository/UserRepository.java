package de.dc.sprangular.table.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.dc.sprangular.table.ui.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}