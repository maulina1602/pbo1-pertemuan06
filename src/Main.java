public class Main {
    public static void main(String[] args) {
        System.out.println("5 ATRIBUT & METHOD");
        Planet planet = new Planet();

        planet.nama = "Bumi";
        planet.warna = "Biru";
        planet.rotasi = 24;
        planet.revolusi = 365;
        planet.diameter = 12745;

        //memanggil method
        planet.tatasurya();
        planet.cahaya();
        planet.kelapkelip();
        planet.mengelilingi();
        planet.satelit();

        //memanggil constructor
        System.out.println("C O N S T R U C T O R");
        Planet planet1 = new Planet("Bumi", "Biru");
        Planet planet2 = new Planet("Bumi");
        Planet planet3 = new Planet("Bumi", "Biru", 24, 356, 12745);

        //memanggil method overloading
        System.out.println("O V E R L O A D I N G");
        planet.namaPlanet();
        planet.namaPlanet("+++++++++++++++++++++++++++++++++++++++++++++");
        planet.namaPlanet("Bumi", "Biru", 24, 356, 12745);

        //memanggil overriding
        System.out.println("O V E R R I D I N G");
        Bumi n = new Bumi();

        planet.namaPlanet("+++++++++++++++++++++++++++++++++++++++++++++");
        n.namaPlanet("Bumi", "Biru", 24, 356, 12745);
        planet.namaPlanet("+++++++++++++++++++++++++++++++++++++++++++++");
        n.namaPlanet("Bumi", "Biru", 24, 356, 12745);
    }
}
