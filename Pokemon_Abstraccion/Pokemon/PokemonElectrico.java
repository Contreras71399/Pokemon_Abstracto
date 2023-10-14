package ListaMovimiento;

public class PokemonElectrico extends Pokemon{

    public PokemonElectrico(String nombre, int nivel) {
        super(nivel, nombre, Tipo.Electrico);

        ListaMovimientos ListaMovimientos = new ListaMovimientos();

    setMovimiento(0, ListaMovimientos.BuscarMovimiento("Excavar"));
    setMovimiento(1, ListaMovimientos.BuscarMovimiento("Lanzallamas"));
    setMovimiento(2, ListaMovimientos.BuscarMovimiento("Electrocañon"));
    setMovimiento(3, ListaMovimientos.BuscarMovimiento("Cuchillada"));
    }


    
    @Override
    public double Efectivo(Pokemon pokemon) {
        double Efectivo = 1.0;

        if(pokemon.getTipo() == Tipo.Agua) Efectividad = 0.5;
        if(pokemon.getTipo() == Tipo.Acero) Efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.Dragon) Efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.Fuego) Efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.Bicho) Efectividad = 0.5;
        if(pokemon.getTipo() == Tipo.Planta) Efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.Hielo) Efectividad = 2.0;
        if(pokemon.getTipo() == Tipo.Roca) Efectividad = 0.5;

        return Efectividad;
    }
