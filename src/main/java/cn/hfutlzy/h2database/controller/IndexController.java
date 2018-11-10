package cn.hfutlzy.h2database.controller;

import cn.hfutlzy.h2database.entity.UserEntity;
import cn.hfutlzy.h2database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/10/14 16:19
 * Description :
 */
@RestController
public class IndexController {

    private final UserRepository userRepository;

    @Autowired
    public IndexController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String getIndex() {
        return "Spring Boot - Spring Data JPA - H2 Web Console";
    }

    @GetMapping("/findUser")
    public List<UserEntity> findUser(){
        List<UserEntity> userEntityList;

        userEntityList = userRepository.findAll();

        return userEntityList;
    }

    @GetMapping("/saveUser")
    public String saveUser(){
        UserEntity userEntity = new UserEntity();

        userEntity.setName("nnnd");
        userEntity.setId(11L);
        userEntity.setUrl("njdndjad");

        userRepository.save(userEntity);

        return userEntity.toString();
    }
}
