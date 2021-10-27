/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author abner
 */

@Getter
@Setter
@ToString
public class ContratoProductor {
    
    public int idcontratoproductor;
    public String  fechainicio;
    public String fechatermino;
    public int esrenovable;
    public String fechadepago;
    public String obligaciones;
    public int idproductor;

    public ContratoProductor(int idcontratoproductor, String fechainicio, String fechatermino, int esrenovable, String fechadepago, String obligaciones, int idproductor) {
        this.idcontratoproductor = idcontratoproductor;
        this.fechainicio = fechainicio;
        this.fechatermino = fechatermino;
        this.esrenovable = esrenovable;
        this.fechadepago = fechadepago;
        this.obligaciones = obligaciones;
        this.idproductor = idproductor;
    }

    public ContratoProductor() {
    }


    
    
}
