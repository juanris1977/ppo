package service;

import java.util.ArrayList;
import java.util.Date;

import model.Pedido;

public class PedidosService {
	ArrayList <Pedido> pedidos = new ArrayList <>();
	
	public void nuevoPedido (String producto, Date fecha, double precio) {
		pedidos.add(new Pedido(producto, fecha, precio));
	}
	
	public Pedido pedidoReciente () {
		Pedido pedido= null;
		Date reciente= new Date(0);
		
		/*for (int i=0;i<pedidos.size();i++) {
			if(pedidos.get(i).getFecha().after(reciente)) {
				reciente=pedidos.get(i).getFecha();
				pedido = pedidos.get(i);
			}*/
		for(Pedido p: pedidos) {
			if(p.getFecha().after(reciente)) {
				reciente=p.getFecha();
				pedido = p;
			}
			
		
		}
		
		return pedido;
		
	}
	
	public Pedido [] mostrarPedidos () {   // voy a devolver un array de pedidos con todos sus datos 
		
		Pedido [] res = new Pedido [pedidos.size()];
		for (int i=0;i<pedidos.size();i++) {
			res[i]=pedidos.get(i);
		}
		
		return res;
		
	}
}
