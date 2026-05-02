package com.proyectoiub.servicios;

import com.j256.ormlite.dao.Dao;
import com.proyectoiub.entidades.*;
import java.time.LocalTime;

public class Servicios {
    public static Profesor crearProfesor(Dao<Profesor, Integer> dao, Profesor profesor) throws Exception {
        dao.create(profesor);
        return profesor;
    }

    public static Estudiante crearEstudiante(Dao<Estudiante, Integer> dao, Estudiante estudiante) throws Exception {
        dao.create(estudiante);
        return estudiante;
    }

    public static Aula crearAula(Dao<Aula, Integer> dao, Aula aula) throws Exception {
        dao.create(aula);
        return aula;
    }

    public static Curso crearCurso(Dao<Curso, Integer> dao,Aula aula,Profesor profesor, Curso curso) throws Exception {
        dao.create(curso);
        return curso;
    }

    public static Horario crearHorario(Dao<Horario, Integer> dao, Curso curso, Horario horario) throws Exception {
        dao.create(horario);
        return horario;
    }

    public static CursoEstudiante crearCursoEstudiante(Dao<CursoEstudiante, Integer> dao,Curso curso,Estudiante estudiante, CursoEstudiante ce) throws Exception {
        dao.create(ce);
        return ce;
    }
}
