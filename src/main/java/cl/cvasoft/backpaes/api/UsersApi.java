package cl.cvasoft.backpaes.api;

import cl.cvasoft.backpaes.model.vo.UsersVO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public interface UsersApi {

    @PostMapping(path = "crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    UsersVO crearUsuario(@RequestBody UsersVO usersVO);

}
