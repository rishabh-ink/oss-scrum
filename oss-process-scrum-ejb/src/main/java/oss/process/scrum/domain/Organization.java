/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.domain;

/**
 *
 * @author gpuliyar
 */
public class Organization {
    private String name;
    private String id;
    private String description;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
