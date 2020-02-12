package com.joole.fans.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

//    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    private String username = null;

//    private final String password = null;

    private String image = null;


    public JwtResponse(String jwttoken, String username, String image) {

        this.jwttoken = jwttoken;

        this.username = username;

        this.image = image;
    }

    public String getToken() {

        return this.jwttoken;
    }

    public String getUsername() {
        return username;
    }

    public String getImage() {
        return image;
    }
}
