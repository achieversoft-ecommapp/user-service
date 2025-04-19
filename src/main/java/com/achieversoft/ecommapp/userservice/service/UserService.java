package com.achieversoft.ecommapp.userservice.service;


import com.achieversoft.ecommapp.commonapplibrary.response.ServiceResponse;
import com.achieversoft.ecommapp.userservice.common.exception.ApplicationException;
import com.achieversoft.ecommapp.userservice.model.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * The type User service.
 */
@Service
@Slf4j
public class UserService {

    WebClient webClient = WebClient.builder().baseUrl("http://localhost:8082/userdata").build();

    /*private final UserDataClient client;

    public UserService(UserDataClient client) {
        this.client = client;
    }*/

    /**
     * Gets user by id.
     *
     * @param id the id
     * @return the user by id
     * @throws ApplicationException the user data exception
     */
    public Object getUserById(String id) throws ApplicationException {
        return "client.getUserById(id)";
    }

    /**
     * Gets users.
     *
     * @return the users
     * @throws ApplicationException the user data exception
     */
    public Mono<ServiceResponse> getUsers() throws ApplicationException {
        return webClient.get().uri("/api/details/all").retrieve().bodyToMono(ServiceResponse.class);
    }

    /**
     * Save or update user string.
     *
     * @param list the list
     * @return the string
     * @throws ApplicationException the user data exception
     */
    public Object saveOrUpdateUser(List<Users> list) throws ApplicationException {
        return "client.saveOrUpdateUser(list)";
    }

    /**
     * Delete all user string.
     *
     * @return the string
     * @throws ApplicationException the user data exception
     */
    public Object deleteAllUser() throws ApplicationException {
        return "client.deleteAllUser()";
    }

    /**
     * Delete user string.
     *
     * @param id the id
     * @return the string
     * @throws ApplicationException the user data exception
     */
    public Object deleteUser(String id) throws ApplicationException {
        return "client.deleteUser(id)";
    }


}
