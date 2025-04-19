package com.achieversoft.ecommapp.userservice.controller;


import com.achieversoft.ecommapp.commonapplibrary.response.MonoResponseHelper;
import com.achieversoft.ecommapp.commonapplibrary.response.ServiceResponse;
import com.achieversoft.ecommapp.userservice.common.exception.ApplicationException;
import com.achieversoft.ecommapp.userservice.model.Users;
import com.achieversoft.ecommapp.userservice.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

import static com.achieversoft.ecommapp.commonapplibrary.constants.GlobalConstants.HTTP_STATUS_CODE_200;
import static com.achieversoft.ecommapp.commonapplibrary.constants.GlobalConstants.SUCCESS_STATUS_MESSAGE;
import static com.achieversoft.ecommapp.commonapplibrary.constants.GlobalConstants.SUCCESS_STAUS;
import static com.achieversoft.ecommapp.userservice.common.constants.ApplicationConstants.DEL_ALL_USER_DETAILS;
import static com.achieversoft.ecommapp.userservice.common.constants.ApplicationConstants.DEL_USER_DETAILS_BY_ID;
import static com.achieversoft.ecommapp.userservice.common.constants.ApplicationConstants.GET_ALL_USER_DETAILS;
import static com.achieversoft.ecommapp.userservice.common.constants.ApplicationConstants.GET_USER_DETAILS_BY_ID;
import static com.achieversoft.ecommapp.userservice.common.constants.ApplicationConstants.SERVICE_NAME;
import static com.achieversoft.ecommapp.userservice.common.constants.ApplicationConstants.UPDATE_USER_DETAILS;


/**
 * The type User controller.
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    /**
     * Get user by id response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping("/details/{id}")
    @Operation(description = "Get user by id")
    public Object getUserById(@PathVariable String id, HttpServletRequest request){
        try{
            return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
                    service.getUserById(id),GET_USER_DETAILS_BY_ID,SUCCESS_STAUS,SERVICE_NAME+":"+request.getServerPort());
        }catch (Exception e){
            throw new ApplicationException(e.getMessage(),GET_USER_DETAILS_BY_ID);
        }
    }

    /**
     * Get users response entity.
     *
     * @return the response entity
     */
    @GetMapping("/details/all")
    public Mono<ServiceResponse> getUsers(){
        try{
//            return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
//                    service.getUsers(),GET_ALL_USER_DETAILS,SUCCESS_STAUS,SERVICE_NAME);
            return service.getUsers();
        }catch (Exception e){
            throw new ApplicationException(e.getMessage(),GET_ALL_USER_DETAILS);
        }
    }

    /**
     * Save or update user response entity.
     *
     * @param list the list
     * @return the response entity
     */
    @PutMapping("/details/updt")
    public Object saveOrUpdateUser(@RequestBody List<Users> list){
        try{
            return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
                    service.saveOrUpdateUser(list),UPDATE_USER_DETAILS,SUCCESS_STAUS,SERVICE_NAME);

        }catch (Exception e){
            throw new ApplicationException(e.getMessage(),UPDATE_USER_DETAILS);
        }

    }

    /**
     * Delete user response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @PostMapping("/details/dlt/{id}")
    public Object deleteUser(@PathVariable String id){
        try{
            return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
                    service.deleteUser(id),DEL_USER_DETAILS_BY_ID,SUCCESS_STAUS,SERVICE_NAME);
        }catch (Exception e){
            throw new ApplicationException(e.getMessage(),DEL_USER_DETAILS_BY_ID);
        }

    }

    /**
     * Delete all user response entity.
     *
     * @return the response entity
     */
    @PostMapping("/details/dlt/all")
    public Object deleteAllUser(){
        try{
            return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
                    service.deleteAllUser(),DEL_ALL_USER_DETAILS,SUCCESS_STAUS,SERVICE_NAME);
        }catch (Exception e){
            throw new ApplicationException(e.getMessage(),DEL_ALL_USER_DETAILS);
        }

    }



}
