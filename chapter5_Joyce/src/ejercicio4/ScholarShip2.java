/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class ScholarShip2 {
    private Double gpa;
    private Integer extra_act;
    private Integer serv_act;
    private String candidate;

    public ScholarShip2(Double gpa, Integer extra_act, Integer serv_act) {
        setGpa(gpa);
        setExtra_act(extra_act);
        setServ_act(serv_act);
        setCandidate();
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        if(gpa >= 0 && gpa <= 4.0){
            this.gpa = gpa;
            setCandidate();
        }
    }

    public Integer getExtra_act() {
        return extra_act;
    }

    public void setExtra_act(Integer extra_act) {
        if(extra_act >= 0){
            this.extra_act = extra_act;
            setCandidate();
        }
    }

    public Integer getServ_act() {
        return serv_act;
    }

    public void setServ_act(Integer serv_act) {
        if(serv_act >= 0){
            this.serv_act = serv_act;
            setCandidate();
        }
    }

    public String getCandidate() {
        return candidate;
    }

    private void setCandidate() {
        if(gpa == null || extra_act == null || serv_act == null){
            this.candidate = "ERROR";
        }
        else if(gpa >= 3.8 && extra_act >= 1 && serv_act >= 1){
            this.candidate = "Candidato a beca";
        }
        
        else if((gpa >= 3.4 && gpa < 3.8) && extra_act >= 3 && serv_act >= 3){
            this.candidate = "Candidato a beca";
        }
        
        else if((gpa >= 3.0 && gpa < 3.4) && extra_act >= 2 && serv_act >= 3){
            this.candidate = "Candidato a beca";
        }
        
        else{
            this.candidate = "No es candidato a beca";
        }
    }
    
    public String toString(){
        if(gpa != null && extra_act != null && serv_act != null)
            return String.format("GPA: %.2f\nActividades extra: %d\nServicios: %d\n%s\n", gpa, extra_act, serv_act, candidate);
        else
            return "Error al registrar al alumno.\n";
    }
}
