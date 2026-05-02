package com.proyectoiub.entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Data
@DatabaseTable
public class Profesor extends Persona{
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String especialidad;
    
    @DatabaseField
    private double salario;

    public Profesor() {
    }
    
    public Profesor(String especialidad, double salario,  String nombre, String identificacion, String email) {
        super(nombre, identificacion, email);
        this.especialidad = especialidad;
        this.salario = salario;
    }
    
    public void dictarClase(Curso curso){
        
    }
    
    
}
