package softuni.exam24.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam24.model.entity.Ship;
import softuni.exam24.model.service.ShipServiceModel;
import softuni.exam24.model.view.ShipViewModel;
import softuni.exam24.repository.ShipRepository;
import softuni.exam24.service.CategoryService;
import softuni.exam24.service.ShipService;
import softuni.exam24.service.UserService;
import softuni.exam24.util.CurrentUser;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShipServiceImpl implements ShipService {

    private final ModelMapper modelMapper;
    private final CategoryService categoryService;
    private final ShipRepository shipRepository;
    private final UserService userService;
    private final CurrentUser currentUser;
    public ShipServiceImpl(ModelMapper modelMapper, CategoryService categoryService, ShipRepository shipRepository, UserService userService, CurrentUser currentUser) {
        this.modelMapper = modelMapper;
        this.categoryService = categoryService;
        this.shipRepository = shipRepository;
        this.userService = userService;
        this.currentUser = currentUser;
    }

    @Override
    public void addShip(ShipServiceModel shipServiceModel) {
        Ship ship=modelMapper.map(shipServiceModel,Ship.class);
        ship.setUser(userService.findById(currentUser.getId()));
        ship.setCategory(categoryService.findByCategoryEnum(shipServiceModel.getCategory()));
        shipRepository.save(ship);
    }

    @Override
    public List<ShipViewModel> findAll() {
        return shipRepository.findAll().stream()
                .map(ship -> modelMapper.map(ship,ShipViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<ShipViewModel> findAllOrderById() {
        return shipRepository.findAllByOrderById().stream()
                .map(ship->modelMapper.map(ship,ShipViewModel.class)).collect(Collectors.toList());
    }

    @Override
    public List<Ship> findAllFromOtherUser(CurrentUser currentUser) {
        return shipRepository.findAllWhereNotMine(currentUser.getId()).stream().map(ship -> modelMapper.map(ship,Ship.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Ship> findAllFromloggediUser(CurrentUser currentUser) {
        return shipRepository.findAllWhereMine(currentUser.getId()).stream().map(ship -> modelMapper.map(ship,Ship.class))
                .collect(Collectors.toList());
    }

    @Override
    public void fire() {


    }



}
