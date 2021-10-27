/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Model.ContratoProductor;

import deskappp.Deskappp;
import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author abner
 */
public class CtrlContratoProductor {

    private final static Log LOGGER = LogFactory.getLog(Deskappp.class);

    /**
     * @param args the command line arguments
     */

    public void buscartodos() {
        ArrayList lista = new ArrayList<ContratoProductor>();
        String array[];
        array = new String[100];
        LOGGER.info("INICIO CLIENTE REST CONSUMO SERVICIO MOCKABLE");

        String url = "http://127.0.0.1:8000/api/contratoproductor/";

        RestTemplate client = new RestTemplate();
        ResponseEntity<ContratoProductor[]> response = client.exchange(url, HttpMethod.GET, null, ContratoProductor[].class);

        ContratoProductor[] cproductores = response.getBody();

        ContratoProductor pro = new ContratoProductor();

        for (ContratoProductor cproductor : cproductores) {
            //LOGGER.info("Productor -> " + productor);
            System.out.println(cproductor);
            pro.setIdcontratoproductor(cproductor.getIdcontratoproductor());
            pro.setFechainicio(cproductor.getFechainicio());
            pro.setFechatermino(cproductor.getFechatermino());
            pro.setEsrenovable(cproductor.getEsrenovable());
            pro.setFechadepago(cproductor.getFechadepago());
            pro.setObligaciones(cproductor.getObligaciones());
            pro.setIdproductor(cproductor.getIdproductor());
            lista.add(pro);
        }
    }

}
