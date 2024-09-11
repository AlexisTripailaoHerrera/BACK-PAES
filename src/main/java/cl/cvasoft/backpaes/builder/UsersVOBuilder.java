package cl.cvasoft.backpaes.builder;


import cl.cvasoft.backpaes.model.Users;
import cl.cvasoft.backpaes.model.vo.UsersVO;

import java.util.Objects;

public class UsersVOBuilder {
    private Users users;

    public UsersVOBuilder(Users users) {
        this.users = users;
    }

    public UsersVO build() {
        if (Objects.isNull(users)) {
            return null;
        }
        UsersVO usersVO = new UsersVO();
        usersVO.setId(users.getId());
        usersVO.setUsername(users.getUsername());
        usersVO.setContrasena(users.getContrasena());
        usersVO.setTipoUsuario(users.getTipoUsuario());
        usersVO.setActivo(users.isActivo());
        return usersVO;
    }
}
