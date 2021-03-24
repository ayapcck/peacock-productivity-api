package com.peacockProductivity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotNull
    @Column(name="name")
    private String name;

    @Column(name="profileImgSrc")
    private String profileImgSrc;

    @ManyToOne
    @JoinColumn(name="rid_fk")
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImgSrc() {
        return profileImgSrc;
    }

    public void setProfileImgSrc(String profileImgSrc) {
        this.profileImgSrc = profileImgSrc;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role rid) {
        this.role = role;
    }
}
