/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onibus;
public class Onibus {

    private boolean ocupado;
    private String nomePassageiro;
        public void setOcupar(boolean lugarOcupado){
        this.ocupado=lugarOcupado;
        }
        public void setOcupar(String nome){
            nome="Milena Castilho";
            this.nomePassageiro=nome;
        }
        public void ocupar(){
            this.setOcupar(true);
        
     
    }
       
        public boolean isOcupado() {
        return ocupado;
    }
            
}
