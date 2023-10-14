package ListaMovimiento;

public class BatallaPokemon {
    public static void main(String[]args){
       PokemonTipo Pokemon1=new PokemonTipo("Gyarados",10,"Volador");
       PokemonTipo Pokemon2=new PokemonTipo("Jolteon",10,"Electrico");
       
       realizarAtaque(Pokemon1,Pokemon2,"Hidrobomba");
       realizarAtaque(Pokemon2,Pokemon1,"Impactrueno");
       
       System.out.println(Pokemon1.getNombre()+"tiene ahora"+Pokemon1.getHP()+"tiene puntos de vida ");
    }

    public static void realizarAtaque(Pokemon Ata, Pokemon obj, String ataque) {
        int  danio= dano(ataque);
        int PuntosVida=objetivo.getHP()
            PuntosVida=danio;
        objetivo.setHP(PuntosVida);
        System.out.println(Ata.getNombre()+ "ataca a "+ obj.getNombre()+ "con" + ataque+ "y causa" + dano + "Puntos de daño");
                public static int dano (String ataque){
                    return 1;
    }
                }
                }
