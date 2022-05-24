
package gestionemployés;

import java.sql.Date;
import java.sql.Time;

public class User {
    
    private String Matricule;
    private String Noms;
    private String Prenoms;
    private String Numero;
    private String Poste;
    private Date Date_Travail;
    private String Absence;
    private Time Heure_Entree;
    private Time Heure_Sortie;
    private String Employe;
    
    public User(String Mat, String Nms, String Prns, String Num ,String Pst, Date Dt,   
                    String Abs, Time He ,Time Hs ,String Emp)
     {
         this.Matricule = Mat;
         this.Noms = Nms;
         this.Prenoms= Prns;
         this.Numero = Num;
         this.Poste = Pst;
         this.Date_Travail= Dt;
         this.Absence = Abs;
         this.Heure_Entree = He;
         this.Heure_Sortie= Hs;
         this.Employe = Emp;
     }

    User(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMat()
     {
       return Matricule;
     }
    
    public String getNms()
      {
          return Noms;
      }
    
    public String getPrns()
    {
        return Prenoms;
    }
    
    public String getNum()
    {
        return Numero;
    }
    
    public String getPst()
    {
        return Poste;
    }
    
    public Date getDt()
    {
        return Date_Travail;
    }
    
    public String getAbs()
    {
        return Absence;
    }  
    
    public Time getHe()
    {
        return Heure_Entree;
    }     
    
    public Time getHs()
    {
        return Heure_Sortie;
    }  
    
    public String getEmp()
    {
        return Employe;
    }       


}
