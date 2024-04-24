package com.example.demo.Service;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Dto.LoginDTO;
import com.example.demo.payload.response.LoginMesage;


public interface UserService {
    String addUser(UserDTO userDTO);

    LoginMesage loginUser(LoginDTO loginDTO);

}