package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities;
// Generated 15/02/2015 12:13:53 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoVehiculo generated by hbm2java
 */
public class TipoVehiculo  implements java.io.Serializable {


     private int idTipoVehiculo;
     private String tipoVehiculoDescripcion;
     private Set vehiculos = new HashSet(0);

    public TipoVehiculo() {
    }

	
    public TipoVehiculo(int idTipoVehiculo, String tipoVehiculoDescripcion) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.tipoVehiculoDescripcion = tipoVehiculoDescripcion;
    }
    public TipoVehiculo(int idTipoVehiculo, String tipoVehiculoDescripcion, Set vehiculos) {
       this.idTipoVehiculo = idTipoVehiculo;
       this.tipoVehiculoDescripcion = tipoVehiculoDescripcion;
       this.vehiculos = vehiculos;
    }
   
    public int getIdTipoVehiculo() {
        return this.idTipoVehiculo;
    }
    
    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public String getTipoVehiculoDescripcion() {
        return this.tipoVehiculoDescripcion;
    }
    
    public void setTipoVehiculoDescripcion(String tipoVehiculoDescripcion) {
        this.tipoVehiculoDescripcion = tipoVehiculoDescripcion;
    }
    public Set getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set vehiculos) {
        this.vehiculos = vehiculos;
    }




}


