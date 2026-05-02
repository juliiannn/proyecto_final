package com.proyectoiub.entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@DatabaseTable
public class Persona {
    @DatabaseField
    private String nombre;
    
    @DatabaseField
    private String identificacion;
    
    @DatabaseField
    private String email;

    public Persona() {
    }
    
    
    public Persona(String nombre, String identificacion, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }
}
