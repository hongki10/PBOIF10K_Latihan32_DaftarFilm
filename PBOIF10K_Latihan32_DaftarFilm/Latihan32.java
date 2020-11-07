/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */

class film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    public static void nowPlaying(String parName, String parGenre, double parRating,
            int parDuration){
        System.out.println("Judul film : " + parName);
        System.out.println("Genre film : " + parGenre);
        System.out.println("Rating film : " + parRating);
        System.out.println("Duration film : " + parDuration + " Menit" + "\n");    
    }
}