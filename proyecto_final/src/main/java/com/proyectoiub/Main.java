package com.proyectoiub;
import com.proyectoiub.entidades.*;
import com.proyectoiub.infraestructure.*;
import com.proyectoiub.servicios.*;

public class Main {

    public static void main(String[] args) {
        try {
            DatabaseConfig dbconfig = new DatabaseConfig();
            var profesorDao = dbconfig.getProfesorDao();
            var estudianteDao = dbconfig.getEstudianteDao();
            var aulaDao = dbconfig.getAulaDao();
            var cursoDao = dbconfig.getCursoDao();
            var horarioDao = dbconfig.getHorarioDao();
            var cursoEstudianteDao = dbconfig.getCursoestDao();

            System.out.println("Â¡Todas las entidades guardadas con Ã©xito!");
            dbconfig.cerrar();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
