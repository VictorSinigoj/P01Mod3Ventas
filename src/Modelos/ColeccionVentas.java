/*
 Preuba 1 Módulo 3

 Considere la clase ColeccionVentas la cual tiene 4 métodos:
 ✓ boolean Agregar(Venta v): Agrega un objeto del tipo Dato a la colección.
 ✓ boolean Eliminar(String codigo): Ubica mediante el código y elimina un objeto de la colección.
 ✓ ArrayList<Venta> Listar(): Retorna una lista con todos los objetos de la colección.
 ✓ boolean Modificar(Venta v): Modifica un objeto de la colección.

 ✓ En la clase ColeccionVentas, agregar un método llamado “subTotal” que nos entregue el subtotal de
 una venta (precio*cantidad)
 */
package Modelos;

import java.util.ArrayList;

/**
 * @author Víctor Sinigoj
 */
public class ColeccionVentas {
    private int valor;
    
    private ArrayList<Venta> base;

    public ColeccionVentas() {
        this.base = new ArrayList<Venta>();
    }

    // Listar

    public ArrayList<Venta> Listar() {
        return this.base;
    }

    // Agregar

    public boolean Agregar(Venta venta) {
        return this.base.add(venta);
    }

    //Modificar

    public boolean  Modificar(Venta d){
        for(int i=0;i<base.size();i++){
            if(base.get(i).getCodigo().equals(d.getCodigo())){
                base.get(i).setCodigo(d.getCodigo());                
                return true; 
            }            
        }
        return false;
    }

    // Eliminar

    public boolean Eliminar(String codigo) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }


     public int subTotal(Venta venta) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(venta.getCodigo())) {
                this.base.get(i).setCodigo(venta.getCodigo());
                this.base.get(i).setPrecio(venta.getPrecio());
                this.base.get(i).setCantidad(venta.getCantidad());
                valor = venta.getPrecio() * venta.getCantidad() ;
                return valor;
            }        
        }
          return valor;
     }

}
   
