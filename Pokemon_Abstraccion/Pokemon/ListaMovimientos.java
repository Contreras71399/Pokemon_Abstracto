
package ListaMovimiento;

import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList <>();
    
    public ListaMovimento() {
    //movimientos de tipo electrico
        movimientos.add(new Movimento(Nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico ,pp:10 ));
        movimientos.add(new Movimento(Nombre:"ElectroCañon", puntosDeAtaque:120, Tipo.Electrico, pp:5 ))
    
        //movimientos de tipo tierra
        movimientos.add(new Movimento(Nombre:"Excavar", puntosDeAtaque:80, Tipo.Tierra, pp:10));
        movimientos.add(new Movimento(Nombre:"Disparo Lodo", puntosDeAtaque:55, Tipo.Tierra, pp:15));
        
        //movimientos de tipo fuego
        movimientos.add(new Movimento(Nombre:"Lanzallamas", puntosDeAtaque:90, Tipo.Fuego, pp:15));
        movimientos.add(new Movimento(Nombre:"Infierno", puntosDeAtaque:100, Tipo.Fuego, pp:5));
        
        //movimientos de tipo normal
        movimientos.add(new Movimento(Nombre:"Cuchillada", puntosDeAtaque:70, Tipo.Normal, pp:20));
    }
    
     public Movimiento BuscarMovimiento (String nombre) {
        for(Movimiento movimiento : movimientos) {
            if(movimiento.getNombre().equals(nombre)) {
                return movimiento;
            }
        }
        return null;
    }


    
}
    
    