public class App {
    public static void main(String[] args) throws Exception {
        
    Aviao a1 = new Aviao(12 , "Boeing", "727JK", "BRANCO", 2011, 2012, "70T", "75T", 89, 4, "Boeing", 23000, "GASOLINA", "GOL LTDA", "AÉREO", 
    95, 2, "P1231");

    a1.imprimir();

    Onibus o1 = new Onibus(19, "Busao", "a52", "AZUL", 1972, 1981, "5T", "6T", 45, 8, "Chevrolet", 80, "Diesel", "Guaicurus", "EXECUTIVO", 50, "ASD54AS", "JDK-4521", "123ASD32", "MS", "CAMPO GRANDE", 2, "Tiradentes-Centro");
    o1.imprimir();
    
    }
}
