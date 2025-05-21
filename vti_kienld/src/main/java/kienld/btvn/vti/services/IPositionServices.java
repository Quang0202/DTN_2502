package kienld.btvn.vti.services;

import java.util.List;

import kienld.btvn.vti.entity.Position;

public interface IPositionServices {
    public List<Position> get_all_Positions();
    public void delete_Positions(Integer id);

}
