package com.innova.domain;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    /*
    * El elemento de la tabla solo indica el nombre de la tabla.
    * El elemento pkColumnName es el nombre de la columna de clave
    * principal en la tabla que identifica de forma única al generador,
    * y el elemento valueColumnName es el nombre de la columna que almacena
    * el valor de secuencia de identificación real que se genera. En
    * este caso, la tabla se llama ID_GEN, el nombre de la columna de
    * clave primaria (la columna que almacena los nombres de los generadores)
    * se llama GEN_NAME y la columna que almacena los valores de la secuencia
    * de id se llama GEN_VAL.
    * El nombre del generador se convierte en el valor almacenado en la
    * columna pkColumnName para esa fila y el proveedor lo usa para buscar
    * el generador y obtener su último valor asignado.
    * */
    @Id
    @TableGenerator(name = "data_gen",
            table = "ID_GEN",
            pkColumnName = "GEN_NAME",
            valueColumnName = "GEN_VAL",
            initialValue = 0,
            allocationSize = 50)

    @GeneratedValue(generator = "data_gen")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
