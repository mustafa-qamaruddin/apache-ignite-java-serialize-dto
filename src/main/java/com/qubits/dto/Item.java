package com.qubits.dto;

import java.io.Serializable;
import org.apache.ignite.cache.query.annotations.QuerySqlField;

public class Item implements Serializable {
    @QuerySqlField(index=true)
    private String name;

    @QuerySqlField(index=false)
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
