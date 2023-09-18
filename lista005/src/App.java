import ProjetoVeiculosEstagiario.Aviao;
import ProjetoVeiculosEstagiario.Caminhao;
import ProjetoVeiculosEstagiario.Carro;
import ProjetoVeiculosEstagiario.Moto;
import ProjetoVeiculosEstagiario.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
    
    Caminhao caminhao1 = new Caminhao(120, "CAMINHAOZAO", "V98", "AZUL", 1972, 1974, "2T", "3T", 2, 12, "VOLVO", 97, "DIESEL", "REGINO", "CARGA", 3, "LKJHGDASHJK21", "ASCS1234", "ASDAXSD123", "MS", "CAMPO GRANDE", 6, "MADEIRA");
    caminhao1.imprimir();

    Onibus onibus1 = new Onibus(19, "Busao", "a52", "AZUL", 1972, 1981, "5T", "6T", 45, 8, "Chevrolet", 80, "Diesel", "Guaicurus", "EXECUTIVO", 50, "ASD54AS", "JDK-4521", "123ASD32", "MS", "CAMPO GRANDE", 2, "Tiradentes-Centro");
    onibus1.imprimir();

    Carro carro1 = new Carro(9, "TRITON", "L200", "BRANCA", 2011, 2013, "2T", "2.5T", 4, 4, "MITSUBISHI", 150, "FLEX", "FULANO", "PASSEIO", 4, "SDSAS123", "ASD1234", "ASDADC123", "MS", "CAMPO GRANDE", 4, false);
    carro1.imprimir();

    Moto moto1 = new Moto(10, "FAN", "CG 125", "VERMELHA", 2000, 2009, "120KG", "180KG", 1, 2, "HONDA", 90, "GASOLINA", "ANDRÉ", "MOTOCICLETA", 2, "abcdefghij", "HUP2302", "1234ASDAI", "MS", "CAMPO GRANDE", "RETO");
    moto1.imprimir();

    Aviao aviao1 = new Aviao(12 , "Boeing", "727JK", "BRANCO", 2011, 2012, "70T", "75T", 89, 4, "Boeing", 23000, "GASOLINA", "GOL LTDA", "AÉREO", 
    95, 2, "P1231");
    aviao1.imprimir();

    //professor, no decorrer do processo, surgiram algumas dúvidas, como por exemplo:
    //"ônibus tem eixo? avião tem placa? avião tem renavam? existe moto com mais de um motor? etc... 
    //Creio que não afetará na nota esses conceitos, mas sim o diagrama e o código bem produzidos, 
    //mas achei pertinente comentar sobre essas dúvidas que me ocorreram."

    }
}
