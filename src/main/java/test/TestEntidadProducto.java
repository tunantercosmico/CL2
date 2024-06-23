package test;

import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl2 producto = new TblProductocl2();
        ClassProductoImp crud = new ClassProductoImp();

        /*
        //Testeamos el metodo registrar
        producto.setNombrecl2("Jabón");
        producto.setPrecioventacl2(3.50);
        producto.setPreciocompcl2(3.00);
        producto.setEstadocl2("sellado");
        producto.setDescripcl2("Jabon de manos");
        crud.RegistrarProducto(producto);
        */

        
        //Testeamos el metodo listar
        List<TblProductocl2> listarProducto = crud.ListarProducto();
        for(TblProductocl2 p:listarProducto){
            System.out.println("Código: "+p.getIdproductocl2()+"\n"+
                                "Nombre: "+p.getNombrecl2()+"\n"+
                                "Precio de Venta: "+p.getPrecioventacl2()+"\n"+
                                "Precio de Compra: "+p.getPreciocompcl2()+"\n"+
                                "Estado: "+p.getEstadocl2()+"\n"+
                                "Descripción: "+p.getDescripcl2()+"\n");
        }
		
	}

}
