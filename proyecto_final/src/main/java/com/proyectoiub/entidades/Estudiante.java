package com.proyectoiub.entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@DatabaseTable
public class Estudiante extends Persona{
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String matricula;
    
    @DatabaseField
    private double promedio;
    
    public Estudiante (){
        
    }

    public Estudiante(String matricula, double promedio, String nombre, String identificacion, String email) {
        super(nombre, identificacion, email);
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public void inscribirCurso(Curso curso){
        
    }
}
