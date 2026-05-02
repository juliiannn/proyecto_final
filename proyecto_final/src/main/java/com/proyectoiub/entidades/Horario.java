package com.proyectoiub.entidades;

import java.time.*;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@DatabaseTable
public class Horario {
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String dia;
    
    @DatabaseField
    private String horaInicio;
    
    @DatabaseField
    private String horaFin;
    
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Curso curso;
    
    public Horario(){
        
    }
    public Horario(String dia, String horaInicio, String horaFin, Curso curso) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.curso = curso;
    }  
}
