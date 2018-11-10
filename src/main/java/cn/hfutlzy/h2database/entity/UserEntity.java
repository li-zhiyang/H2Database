package cn.hfutlzy.h2database.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author : lzyli
 * CreateDate : 2018/10/14 16:05
 * Description :
 */
@Entity
@Table(name = "t_user")
@Data
public class UserEntity {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String url;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
