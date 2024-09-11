package cl.cvasoft.backpaes.service.impl;

import cl.cvasoft.backpaes.builder.VOBuilderFactory;
import cl.cvasoft.backpaes.dao.UsersDAO;
import cl.cvasoft.backpaes.model.Users;
import cl.cvasoft.backpaes.model.vo.UsersVO;
import cl.cvasoft.backpaes.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UsersServiceImpl implements UsersService {
    private final UsersDAO usersDAO;

    public UsersServiceImpl(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @Override
    @Transactional
    public UsersVO crearUsuario(UsersVO usersVO) {
        Users usuario = new Users();
        usuario.setUsername(usersVO.getUsername());
        usuario.setContrasena(usersVO.getContrasena());
        usuario.setTipoUsuario(usersVO.getTipoUsuario());
        usuario.setActivo(usersVO.getActivo());
        System.out.println("usuario: "+usuario);
        usuario = this.usersDAO.crearUsuario(usuario);

        return VOBuilderFactory.getUsersVOBuilder(usuario).build();
    }
}
