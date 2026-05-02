package com.proyectoiub.entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@DatabaseTable
public class Curso {
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String idCurso;
    
    @DatabaseField
    private String nombreCurso;
    
    @DatabaseField
    private int creditos;
    
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Aula aula;
    
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Profesor profesor;
    
    public Curso (){
        
    }
    public Curso(String idCurso, String nombreCurso, int creditos, Aula aula, Profesor profesor) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
        this.aula = aula;
        this.profesor = profesor;
    }  
}
