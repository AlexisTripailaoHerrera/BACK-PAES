package cl.cvasoft.backpaes.builder;


import cl.cvasoft.backpaes.model.Users;

public class VOBuilderFactory {

    public VOBuilderFactory() {

    }

    public static UsersVOBuilder getUsersVOBuilder(Users users) {
        return new UsersVOBuilder(users);
    }
}
