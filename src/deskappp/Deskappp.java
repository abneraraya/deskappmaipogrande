/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskappp;

import Controladores.CtrlProductor;
import Controladores.CtrlContratoProductor;

/**
 *
 * @author abner
 */
public class Deskappp {

  
    public static void main(String[] args) {
       CtrlProductor p = new CtrlProductor();
       p.BuscarPorId(3);
       CtrlContratoProductor cp = new CtrlContratoProductor();
       cp.buscartodos();
    }
    
}
