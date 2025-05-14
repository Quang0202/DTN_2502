package backend.service;

import backend.repository.IManufacturerRepository;
import backend.repository.ManufacturerRepository;
import entity.Manufacturer;

public class ManufacturerService implements IManufacturerService{
    private IManufacturerRepository iManufacturerRepository;

    public ManufacturerService() {
        iManufacturerRepository = new ManufacturerRepository();
    }

    public Manufacturer findManufacturerById(int id) {
        return iManufacturerRepository.findManufacturerById(id);
    }
}
