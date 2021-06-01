package com.domain.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {
    
    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "id is require")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private  Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
