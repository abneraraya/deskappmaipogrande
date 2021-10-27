/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import lombok.Getter;
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
public class Productor {

    public int idproductor;
    public String rut;
    public String nombre;
    public String alias;
    public String direccion;
    public int telefono;
    public String username;
    public String userpass;

    public Productor(int idproductor, String rut, String nombre, String alias,
            String direccion, int telefono, String username, String userpass) {
        this.idproductor = idproductor;
        this.rut = rut;
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.username = username;
        this.userpass = userpass;
    }

    public Productor() {
    }

}
