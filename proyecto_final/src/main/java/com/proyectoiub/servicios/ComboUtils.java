package com.proyectoiub.servicios;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilidad única para manejar conversiones a componentes visuales (ComboBox)
 */
public class ComboUtils {



    public static class Item {
        private final int id;
        private final String label;

        public Item(int id, String label) {
            this.id = id;
            this.label = label;
        }

        public int getId() { return id; }
        public String getLabel() { return label; }

        @Override
        public String toString() {
            return label; 
        }
    }

    public static <T> List<Item> map(List<T> entities, String displayField) {
        List<Item> items = new ArrayList<>();

        if (entities == null) return items;

        for (T entity : entities) {
            try {
                Field idF = null;
                Class<?> currentClass = entity.getClass();

                while (currentClass != null) {
                    try {
                        idF = currentClass.getDeclaredField("id");
                        idF.setAccessible(true);
                        break;
                    } catch (NoSuchFieldException e) {
                        currentClass = currentClass.getSuperclass();
                    }
                }

                if (idF == null) {
                    throw new NoSuchFieldException("id");
                }

                int id = (int) idF.get(entity);
                Field labelF = null;
                Class<?> labelClass = entity.getClass();

                while (labelClass != null) {
                    try {
                        labelF = labelClass.getDeclaredField(displayField);
                        labelF.setAccessible(true);
                        break;
                    } catch (NoSuchFieldException e) {
                        labelClass = labelClass.getSuperclass();
                    }
                }

                if (labelF == null) {
                    throw new NoSuchFieldException(
                        "No existe el campo '" + displayField + "' en la jerarquía de " + entity.getClass().getSimpleName()
                    );
                }

                String label = String.valueOf(labelF.get(entity));

                items.add(new Item(id, label));

            } catch (NoSuchFieldException | IllegalAccessException e) {
                System.err.println("Error mapeando entidad: " + e.getMessage());
            }
        }

        return items;
    }
}