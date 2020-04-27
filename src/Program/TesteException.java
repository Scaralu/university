package Program;

public class TesteException {
    public static void main(String[] args) {
        System.out.println("Incio do main");
        metodo1();
        System.out.println("fim do main");
    }
    static void metodo1(){
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo2");
    }
    static void metodo2(){
        System.out.println("inicio do metodo 2");
        int[] array = new int[10];
        try{
            for (int i = 0; i <= 15 ; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("Index out of bounds. Existem elementos demais para serem guardados no array");
        } finally {
            System.out.println("fim do metodo2");
        }
    }

}
