package com.domain.models.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;



@Entity
@Table(name = "tbl_suppliers")
// @JsonIdentityInfo(
//     generator =  ObjectIdGenerators.PropertyGenerator.class,
//     property = "id")

public @Data class Supplier implements Serializable{
    
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String address;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "suppliers")
    @JsonBackReference
    private Set<Product> products;

    public static long getSerialversionuid() {
        return SerialVersionUID;
    }

}
