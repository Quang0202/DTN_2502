package backend.controller;

import backend.service.IManufacturerService;
import backend.service.ManufacturerService;
import entity.Manufacturer;

public class ManufacturerController {
    private IManufacturerService iManufacturerService;

    public ManufacturerController() {
        iManufacturerService = new ManufacturerService();
    }

    public Manufacturer findManufacturerById(int id) {
        return iManufacturerService.findManufacturerById(id);
    }


}
