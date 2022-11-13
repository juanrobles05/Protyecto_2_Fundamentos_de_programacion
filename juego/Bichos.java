public class Bichos {
    public static int salud = 0;
    public static Bichos bichos[][] = new Bichos[2][2];
    public static int numA = 0;
    public String nombre = "";

    public Bichos(int s, String nombre) {
        this.salud = s;
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        Bichos.salud = salud;
    }

    public static int getNumeroAleatorio() {
        numA = (int) (Math.random() * ((4 - 1) + 1)) + 1;
        return numA;
    }

    public static void AsignarAleatorio() {
        numA = getNumeroAleatorio();
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                bichos[f][c] = BichoAleatorio();
            }
        }
    }

    public static Bichos BichoAleatorio() {
        int tipo = 0;
        Bichos j = null;
        tipo = (int) (Math.random() * ((3 - 1) + 1)) + 1;
        if (tipo == 1) {
            j = new BichosNormales();
        } else if (tipo == 2) {
            j = new BichosAliens();
        }
        return j;
    }

    public static String fraseAbuela() {
        int numRandom = 0;
        numRandom = (int) (Math.random() * ((3 - 1) + 1)) + 1;
        String text = "";
        if (numRandom == 1) {
            text = "Cuando era pequeña era la mejor porque jugaba todos los dias";
        } else if (numRandom == 2) {
            text = "Cuando era pequeña era la mejor porque jugaba todos los dias";
        } else if (numRandom == 3) {
            text = "La mejor opcion siempre fue usar la bomba atomica";
        } else if (numRandom == 4) {
            text = "Odio que los bichos muten por eso toca tirarles una bomba atomica";
        } else if (numRandom == 5) {
            text = "Me acuerdo que antes habian mas armas para matar los bichos";
        }
        return text;
    }

    public static String mostrarTablero() {
        return "-----------------------------------------------" + "\n" + "|" + bichos[0][0] + "|"
                + bichos[0][1] + "|"
                + "\n"
                + "|" + bichos[1][0] + "|" + bichos[1][1] + "|" + "\n"
                + "-----------------------------------------------";
    }

    public static void dispararBala(int pos1, int pos2) {
        bichos[pos1][pos2].setSalud(salud - 5);
        if (bichos[pos1][pos2].getSalud() <= 0) {
            bichos[pos1][pos2] = null;
        }
    }

    public static void bombaAtomica(int posx, int posy) {
        bichos[posx][posy].setSalud(salud - 20);
        if (bichos[posx][posy].getSalud() <= 0) {
            bichos[posx][posy] = null;
        }
    }

    public static void bichoMutante() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {

            }
        }
    }
}