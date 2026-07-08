public class Ascii {
    public static void main(String[] args) {
        for(char c='A';c<='Z';c++){
            System.out.println(c+" "+(c+0));//(int)c both are correct
        }
    }
}
