package com.proyectoiub.entidades;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@DatabaseTable
public class CursoEstudiante {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Curso curso;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Estudiante estudiante;
    
    public CursoEstudiante(){
        
    }
    public CursoEstudiante(Curso curso, Estudiante estudiante) {
        this.curso = curso;
        this.estudiante = estudiante;
    }
    
    
}
