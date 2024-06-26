package ru.job4j.repository;

import ru.job4j.model.Car;
import ru.job4j.model.CarBrand;
import ru.job4j.model.Engine;

import java.util.Collection;
import java.util.Optional;

public interface EngineRepository {
    Engine save(Engine engine);

    Optional<Engine> findById(int id);

    Collection<Engine> findAll();

    boolean deleteById(int id);

    boolean deleteAll();
}
