package za.ac.cput.service;

import za.ac.cput.domain.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService  {

    List<Location> findAll();
    void deleteById(String id);
    Optional<Location> read(String s);
}
