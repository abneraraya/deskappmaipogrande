/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Model.Productor;
import deskappp.Deskappp;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author abner
 */
public class CtrlProductor {
      private final static Log LOGGER = LogFactory.getLog(Deskappp.class);
    /**
     * @param args the command line arguments
     */
    
    public void Buscartodo(){
        ArrayList lista = new ArrayList<Productor>();
        String array[];
        array= new String[100];
        LOGGER.info("INICIO CLIENTE REST CONSUMO SERVICIO MOCKABLE");
        
        String url = "http://127.0.0.1:8000/api/usuario/productor/";
        
        RestTemplate client = new RestTemplate();
        ResponseEntity<Productor[]> response = client.exchange(url, HttpMethod.GET, null, Productor[].class);
        
        Productor[] productores = response.getBody();
        
        Productor pro =new Productor();
        
        for(Productor productor : productores) {
            //LOGGER.info("Productor -> " + productor);
            System.out.println(productor);
            pro.setIdproductor(productor.getIdproductor());
            pro.setRut(productor.getRut());
            pro.setNombre(productor.getNombre());
            pro.setAlias(productor.getAlias());
            pro.setUsername(productor.getUsername());
            pro.setDireccion(productor.getDireccion());
            pro.setTelefono(productor.getTelefono());
            pro.setUserpass(productor.getUserpass());
            lista.add(pro);            
        }
        LOGGER.info("FIN CLIENTE REST CONSUMO SERVICIO MOCKABLE");
    }
    
   public void BuscarPorId(int id){
   
        String url = "http://127.0.0.1:8000/api/usuario/productor/"+id;
        System.out.println(url);
        RestTemplate client = new RestTemplate();
        ResponseEntity<Productor> response = client.exchange(url, HttpMethod.GET, null, Productor.class);
        
       Productor productores = response.getBody();
        
       System.out.println(productores);
        

   }
   
   public void AgregarProductor(){
   
   }
   public void EliminarPorId(int id){
       try {
             String url = "http://127.0.0.1:8000/api/usuario/productor/"+id;
        System.out.println(url);
        RestTemplate client = new RestTemplate();
        ResponseEntity<Productor> response = client.exchange(url, HttpMethod.GET, null, Productor.class);
        
       Productor productores = response.getBody();
        
       } catch (Exception e) {
       }
   }
}
