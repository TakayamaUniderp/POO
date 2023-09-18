public class App {
    public static void main(String[] args) throws Exception {
        
    Aviao a1 = new Aviao(12 , "Boeing", "727JK", "BRANCO", 2011, 2012, "70T", "75T", 89, 4, "Boeing", 23000, "GASOLINA", "GOL LTDA", "AÉREO", 
    95, 2, "P1231");
    a1.imprimir();

    Onibus o1 = new Onibus(19, "Busao", "a52", "AZUL", 1972, 1981, "5T", "6T", 45, 8, "Chevrolet", 80, "Diesel", "Guaicurus", "EXECUTIVO", 50, "ASD54AS", "JDK-4521", "123ASD32", "MS", "CAMPO GRANDE", 2, "Tiradentes-Centro");
    o1.imprimir();

    Moto m1 = new Moto(10, "FAN", "CG 125", "VERMELHA", 2005, 2009, "120KG", "180KG", 1, 2, "HONDA", 90, "GASOLINA", "ANDRÉ", "MOTOCICLETA", 2, "abcdefghij", "HUP2302", "1234ASDAI", "MS", "CAMPO GRANDE", "RETO");
    m1.imprimir();

    Carro c1 = new Carro(9, "TRITON", "L200", "BRANCA", 2012, 2013, "2T", "2.5T", 4, 4, "MITSUBISHI", 150, "FLEX", "FULANO", "PASSEIO", 4, "SDSAS123", "ASD1234", "ASDADC123", "MS", "CAMPO GRANDE", 4, false);
    c1.imprimir();

    Caminhao ca1 = new Caminhao(120, "CAMINHAOZAO", "V98", "AZUL", 1972, 1974, "2T", "3T", 2, 12, "VOLVO", 97, "DIESEL", "REGINO", "CARGA", 3, "LKJHGDASHJK21", "ASCS1234", "ASDAXSD123", "MS", "CAMPO GRANDE", 6, "MADEIRA");
    ca1.imprimir();
    
    }
}
