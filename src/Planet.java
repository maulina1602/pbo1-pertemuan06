public class Planet {

    //atribut
    String nama;
    String warna;
    int rotasi;
    int revolusi;
    double diameter;

    public Planet(){
    }


    //behavior/method
    void tatasurya() {
        System.out.println("Saya juga merupakan bagian dari Tata Surya");
        System.out.println("Salah satu bagian dari saya adalah " + nama + " warnanya " + warna);
        System.out.println("Waktu Rotasi\t:" + rotasi + " jam");
        System.out.println("Waktu Revolusi \t:" + revolusi + " hari");
        System.out.println("Diameter \t\t:" + diameter + " km");
        System.out.println();
    }

    void cahaya() {
        System.out.println("Saya tidak memiliki cahaya tapi hanya memantulkan cahaya matahari");
        System.out.println();
    }

    void kelapkelip() {
        System.out.println("Saya tidak berkelap kelip, tapi berkilau terang");
        System.out.println("kalau ingin melihat saya kalian pandang langit di malam hari");
        System.out.println("cari yg menyerupai bintang yg paling terang tapi tidak kelap kelip");
        System.out.println();
    }

    void mengelilingi() {
        System.out.println("Saya juga megelilingi matahari dengan arah yang sama pada orbitnya");
        System.out.println("masing masing yang berbentuk ellips");
        System.out.println();
    }

    void satelit() {
        System.out.println("Kebanyakan dari saya memiliki satelit");
        System.out.println("pengiring/bulan yang berputar mengelilingi saya");
        System.out.println();
    }

    //constructor
    Planet(String nama, String warna){
        System.out.println("Hallooooo saya merupakan sebuah planet dengan nama " + nama + " dan warna " + warna);
    }
    Planet(String nama){
        System.out.println("Bagian dari saya yaitu " + nama);
    }
    Planet(String nama, String warna, int rotasi, int revolusi, double diameter) {
        System.out.println("Dengan warna " + warna);
        System.out.println("waktu rotasinya " + rotasi + " jam dan waktu revolusinya" + revolusi + " hari");
        System.out.println(nama + " mempunyai diameter " + diameter);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }

    //method overloading//
    void namaPlanet(){
        System.out.println(nama);
        System.out.println(warna);
        System.out.println(rotasi);
        System.out.println(revolusi);
        System.out.println(diameter);
    }
    void namaPlanet (String karakter){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(nama);
        System.out.println(warna);
        System.out.println(rotasi + " jam");
        System.out.println(revolusi + " hari");
        System.out.println(diameter + "km");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    void namaPlanet (String nama, String warna, int rotasi, int revolusi, double diameter){
        System.out.println("Nama planet \t:" + nama);
        System.out.println("Warna \t\t\t:" + warna);
        System.out.println("Waktu Rotasi \t:" + rotasi + " jam");
        System.out.println("Waktu Revolusi \t:" + revolusi + " hari");
        System.out.println("Diameter \t\t:" + diameter +"km");
    }
}
