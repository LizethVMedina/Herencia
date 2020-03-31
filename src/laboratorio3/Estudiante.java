/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Lizeth
 */
public class Estudiante extends Persona2{
    private String carnet;
    private double prom;
    private int numMat;
    
    public Estudiante()
    {
    
    }
    public Estudiante(String nombre, String apellido, int edad, double peso, String carnet,double prom,int numMat)
    {
    super(nombre,apellido,edad,peso);
    this.carnet=carnet;
    this.prom=prom;
    this.numMat=numMat;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getProm() {
        return prom;
    }

    public int getNumMat() {
        return numMat;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    public void setNumMat(int numMat) {
        this.numMat = numMat;
    }
    public double calculoProm(int numMat)
    {
      double acu=0;
      double not;
      for (int i= 0 ; i<numMat;i++)
      {
         not=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
         acu=acu+not;
      }
      prom=acu/numMat;
      return (prom);
    }
    public void imprimirProm( String nombre,String apellido, double prom) 
    {
    JOptionPane.showMessageDialog(null, ""+nombre+""+apellido+"Tiene un promedio de"+prom);
    }
    public Estudiante datosEstudiante()
    {
         Estudiante estudiante=new Estudiante();
         String nombre,apellido,carnet;
         int edad;
         double peso,not,prom;
         
        carnet=leerDatoTipoCadena("Ingrese el carnet");
        nombre=leerDatoTipoCadena("Ingrese el nombre");
        apellido=leerDatoTipoCadena("Ingrese el apellido");
        edad = leerDatoTipoEntero("Ingrese la edad");
        peso = leerDatoTipoReal("Ingrese el peso");
        numMat=leerDatoTipoEntero("Ingrese el numero de materias");
         
        prom=calculoProm(numMat);
        
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setEdad(edad);
        estudiante.setPeso(peso);
        estudiante.setCarnet(carnet);
        estudiante.setProm(prom);
        estudiante.setNumMat(numMat);
        return(estudiante);
    }

      public void imprimirReporte()
    {
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "El codigo del carnet es:" + carnet);
        JOptionPane.showMessageDialog(null,"El numero de materias es: " + numMat);
        JOptionPane.showMessageDialog(null, "El promedio es: " + prom);
    }
    public void estadoEstudiante(int edad)
    {
        String estado;
        if (edad < 21)
        {
            estado = "Menor de edad (-18)";
        }
        else
        {
            estado = "Mayor de edad (+18)";
        }
        JOptionPane.showMessageDialog(null," " + nombre + " " + apellido + " " +  " es:  " + " " + estado);

    }

 

}
   

