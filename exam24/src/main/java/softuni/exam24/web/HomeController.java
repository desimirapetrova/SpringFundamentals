package softuni.exam24.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import softuni.exam24.model.binding.SelectedMyShip;
import softuni.exam24.model.entity.Ship;
import softuni.exam24.model.entity.User;
import softuni.exam24.model.service.ShipServiceModel;
import softuni.exam24.model.view.ShipViewModel;
import softuni.exam24.service.ShipService;
import softuni.exam24.service.UserService;
import softuni.exam24.util.CurrentUser;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    private final CurrentUser currentUser;
    private final ShipService shipService;
    private final UserService userService;
    private final ModelMapper modelMapper;

    public HomeController(CurrentUser currentUser, ShipService shipService, UserService userService, ModelMapper modelMapper) {
        this.currentUser = currentUser;
        this.shipService = shipService;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping()
    public String index(Model model) {

        if (currentUser.getId() == null) {
            return "index";
        }

        List<ShipViewModel> ships = shipService.findAll();
        List<User>users=userService.findALl();
        List<Ship>shipsFromOtherUser=shipService.findAllFromOtherUser(currentUser);
        model.addAttribute("users",users);
        model.addAttribute("ships", ships);
        model.addAttribute("otherShips",shipsFromOtherUser);

        List<ShipViewModel>allships=shipService.findAllOrderById();
        model.addAttribute("allships",allships);

        List<Ship>myships=shipService.findAllFromloggediUser(currentUser);
        model.addAttribute("myships",myships);
        
        shipService.fire();
        return "home";
    }
//    @PostMapping()
//    public String fire(){
//        shipService.fire();
//        return "home";
//    }
}
