package com.qybae.NewsApplication.config;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by tedonema on 31/03/2016.
 */
public class Authority implements GrantedAuthority {

	  /** The Serial Version UID for Serializable classes. */
    private static final long serialVersionUID = 1L;
    
    private final String authority;

    public Authority(String authority) {

        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return authority;
    }
}
