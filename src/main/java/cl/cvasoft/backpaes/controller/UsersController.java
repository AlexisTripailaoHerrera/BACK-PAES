package cl.cvasoft.backpaes.controller;

import cl.cvasoft.backpaes.api.UsersApi;
import cl.cvasoft.backpaes.model.vo.UsersVO;
import cl.cvasoft.backpaes.service.UsersService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController implements UsersApi {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public UsersVO crearUsuario(UsersVO usersVO) {
        return this.usersService.crearUsuario(usersVO);
    }
}
