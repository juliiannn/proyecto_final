package com.proyectoiub.entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@DatabaseTable
public class Aula {
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private int numero;
    
    @DatabaseField
    private int capacidad;
    
    @DatabaseField
    private String edificio;
    
    public Aula(){
        
    }

    public Aula(int numero, int capacidad, String edificio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.edificio = edificio;
    }
    
}
