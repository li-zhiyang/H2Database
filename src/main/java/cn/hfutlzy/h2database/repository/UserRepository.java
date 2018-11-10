package cn.hfutlzy.h2database.repository;

import cn.hfutlzy.h2database.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : lzyli
 * CreateDate : 2018/10/14 16:12
 * Description :
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
