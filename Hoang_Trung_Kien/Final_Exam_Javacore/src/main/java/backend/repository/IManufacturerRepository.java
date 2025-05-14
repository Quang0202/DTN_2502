package backend.repository;

import entity.Manufacturer;

public interface IManufacturerRepository {
    Manufacturer findManufacturerById(int id);
}
