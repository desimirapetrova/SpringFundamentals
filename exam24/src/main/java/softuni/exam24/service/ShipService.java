package softuni.exam24.service;

import softuni.exam24.model.entity.Ship;
import softuni.exam24.model.service.ShipServiceModel;
import softuni.exam24.model.service.UserServiceModel;
import softuni.exam24.model.view.ShipViewModel;
import softuni.exam24.util.CurrentUser;

import java.util.List;

public interface ShipService {
    void addShip(ShipServiceModel shipServiceModel);

    List<ShipViewModel> findAll();
    List<ShipViewModel>findAllOrderById();

    List<Ship> findAllFromOtherUser(CurrentUser currentUser);

    List<Ship> findAllFromloggediUser(CurrentUser currentUser);

    void fire();

}
