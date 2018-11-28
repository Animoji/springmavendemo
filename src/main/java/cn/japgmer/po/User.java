package cn.japgmer.po;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "addtime", columnDefinition = "timestamp",  updatable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Timestamp addtime;

}

