package com.mkt.mytest.admin.service.dto;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.util.StringUtils;


public class UserDto {

    private Long id;

    private String firstName;

    private String familyName;

    private String email;

    private String phone;

    private String language;

    private String login;

    private String password;

    private Date burthDate;

    private Set<AuthorityDto> authorities = new HashSet<AuthorityDto>();

    private Boolean enabled;

    private Long pictureId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBurthDate() {
        return burthDate;
    }

    public void setBurthDate(Date burthDate) {
        this.burthDate = burthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Set<AuthorityDto> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<AuthorityDto> authorities) {
        this.authorities = authorities;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public String getAuthoritiesAsString() {
        StringBuffer sb = new StringBuffer();
        /*for (AuthorityDto a : this.getAuthorities()) {
            sb.append(a.getName());
            sb.append(", ");
        }
        return StringUtils.substring(sb.toString(), 0, sb.length() - 2);*/
        return null;
    }

}
