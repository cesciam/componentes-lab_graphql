package com.cenfotec.graphql.graphql.Repositories;

import com.cenfotec.graphql.graphql.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
