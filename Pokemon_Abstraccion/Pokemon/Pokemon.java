package ListaMovimiento;

public abstract class Pokemon {
    private int hp;
    private int nivel;
    private String nombre;
    private String tipo;
    private Movimiento movimientos[];

    public Pokemon(int nivel, String nombre, String tipo) {
        this.hp = 100;
        this.nivel = nivel;
        this.nombre = nombre;
        this.tipo = tipo;
        this.movimientos = new Movimiento[4]; 
    }

    public int getHp() {
        return hp;
    }

    public int getnivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMovimiento(int index, Movimiento movimientos) {
        this.movimientos[index] = movimientos;
    }
    public Movimiento getMovimiento(int index) {
        return this.movimientos[index];
    }

    public void calculaDanio(int danio, double Efectivo){
        double puntosMenos = danio * Efectivo;
        this.hp -= puntosMenos;
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(),puntosMenos);
    }
    public void AtaqueRecibido(Movimiento movimiento, double Efectivo ) {
        System.out.printf("%s Recibe ataque %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), Efectivo);
    }

    protected boolean AtaqueHecho(Movimiento movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double Efectivo = Efectividad(pokemon);

        if(movimiento.getPp() > 0) {
            pokemon.AtaqueRecibido(movimiento, Efectivo);
            return true;
        } else {
            System.err.println("Este movimiento no tiene puntos puntos de poder");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimiento(m);
        boolean AtaqueHecho = AtaqueHecho(movimiento, pokemon);
        if(AtaqueHecho) {
            pokemon.getMovimiento(m).setPp(movimiento.getPp() - 1);
        }
    }

    public abstract double Efectividad(Pokemon pokemon);
}