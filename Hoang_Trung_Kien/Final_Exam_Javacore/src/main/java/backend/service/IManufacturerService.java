package backend.service;

import entity.Manufacturer;

public interface IManufacturerService {
    Manufacturer findManufacturerById(int id);
}
