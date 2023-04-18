/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.springbootswaggerspringfox.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author hayricicek
 */
@ApiModel("Todo Entity description here")
public class Todo {
    
    @NotNull
    @ApiModelProperty(notes = "${todo.id}", example = "1", required = true, position = 0)
    private Long id;
    
    @NotNull
    @ApiModelProperty(notes = "${todo.task}", example = "Learn more Spring Boot", required = true, position = 1)
    private String task;
   
    @ApiModelProperty(notes = "${todo.description}", example = "Code Code Code", required = false, position = 2)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
