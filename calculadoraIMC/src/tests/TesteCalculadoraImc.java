package tests;

import control.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadoraImc {

    CalculadoraIMC calcIMC;

//    "Baixo peso muito grave";
//    "Baixo peso grave";
//    "Baixo peso";
//    "Peso normal";
//    "Sobrepeso";
//    "Obesidade grau I";
//    "Obesidade grau II";
//    "Obesidade grau III";

    @Before
    public void setup(){
        calcIMC = new CalculadoraIMC();
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals(
                "Baixo peso muito grave",
                calcIMC.calcularImc(45, 1.75, 21, "Masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        Assert.assertEquals(
                "Baixo peso grave",
                calcIMC.calcularImc(49, 1.75, 21, "Masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        Assert.assertEquals(
                "Baixo peso grave",
                calcIMC.calcularImc(52, 1.75, 21, "Masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoInferior() {//1,901 - 62
        Assert.assertEquals(
                "Baixo peso",
                calcIMC.calcularImc(62, 1.901, 21, "Masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoSuperior() {// 1,902 - 67
        Assert.assertEquals(
                "Baixo peso",
                calcIMC.calcularImc(67, 1.904, 21, "Feminino"));
    }

    @Test
    public void testeAdultoPesoNormalInferior() { //IMC >= 18.50 && IMC < 25
        Assert.assertEquals(
                "Peso normal",
                calcIMC.calcularImc(70, 1.75, 21, "Masculino"));
    }

    @Test
    public void testeAdultoPesoNormalSuperior() { //IMC >= 18.50 && IMC < 25
        Assert.assertEquals(
                "Peso normal",
                calcIMC.calcularImc(68, 1.65, 21, "Masculino"));
    }

    @Test
    public void testeAdultoSobrepesoInferior() { //IMC >= 25 && IMC < 30
        Assert.assertEquals(
                "Sobrepeso",
                calcIMC.calcularImc(69, 1.65, 21, "Masculino"));
    }

    @Test
    public void testeAdultoSobrepesoSuperior() {
        Assert.assertEquals(
        "Sobrepeso",
        calcIMC.calcularImc(80, 1.634, 35, "Feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIInferior() { //IMC >= 30 && IMC < 35
        Assert.assertEquals(
                "Obesidade grau I",
                calcIMC.calcularImc(80, 1.63, 21, "Masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauISuperior() { //IMC >= 30 && IMC < 35
        Assert.assertEquals(
                "Obesidade grau I",
                calcIMC.calcularImc(92, 1.63, 21, "Masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIInferior() {//IMC >= 35 && IMC < 40
        Assert.assertEquals(
                "Obesidade grau II",
                calcIMC.calcularImc(95, 1.63, 21, "Feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIISuperior() {//IMC >= 35 && IMC < 40
        Assert.assertEquals(
                "Obesidade grau II",
                calcIMC.calcularImc(115, 1.70, 21, "Feminino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIII() {//>=40
        Assert.assertEquals(
                "Obesidade grau III",
                calcIMC.calcularImc(120, 1.70, 21, "Masculino"));
    }

    //idoso mulher
//    if (IMC < 21.9){
//        return "Baixo peso";
    @Test
    public void testeIdosoMulherBaixoPeso() {
        Assert.assertEquals(
                "Baixo peso",
                calcIMC.calcularImc(66, 1.75, 66, "Mulher"));
    }
//    } else if (IMC >= 22 && IMC <= 27){
//        return "Peso normal";
    @Test
    public void testeIdosoMulherPesoNormalInferior() {
        Assert.assertEquals(
                "Peso normal",
                calcIMC.calcularImc(68, 1.75, 66, "Mulher"));
    }

    @Test
    public void testeIdosoMulherPesoNormalSuperior() {
        Assert.assertEquals(
                "Peso normal",
                calcIMC.calcularImc(82, 1.75, 66, "Mulher"));
    }
//    } else if (IMC >= 27.1 && IMC <= 32){
//        return "Sobrepeso";

    @Test
    public void testeIdosoMulherSobrepesoInferior() {
        Assert.assertEquals(
                "Sobrepeso",
                calcIMC.calcularImc(83, 1.75, 66, "Mulher"));
    }

    @Test
    public void testeIdosoMulherSobrepesoSuperior() {
        Assert.assertEquals(
                "Sobrepeso",
                calcIMC.calcularImc(98, 1.75, 66, "Mulher"));
    }
//    } else if (IMC > 32 && IMC <= 37){
//        return "Obesidade grau I";

    @Test
    public void testeIdosoMulherObesidadeGrauIInferior() {
        Assert.assertEquals(
                "Obesidade grau I",
                calcIMC.calcularImc(99, 1.75, 66, "Mulher"));
    }

    @Test
    public void testeIdosoMulherObesidadeGrauISuperior() {
        Assert.assertEquals(
                "Obesidade grau I",
                calcIMC.calcularImc(113, 1.75, 66, "Mulher"));
    }
//    } else if (IMC > 37 && IMC < 42){
//        return "Obesidade grau II";

    @Test
    public void testeIdosoMulherObesidadeGrauIIInferior() {
        Assert.assertEquals(
                "Obesidade grau II",
                calcIMC.calcularImc(114, 1.75, 66, "Mulher"));
    }

    @Test
    public void testeIdosoMulherObesidadeGrauIISuperior() {
        Assert.assertEquals(
                "Obesidade grau II",
                calcIMC.calcularImc(128, 1.75, 66, "Mulher"));
    }
//    } else{
//        return "Obesidade grau III";
//    }
    @Test
    public void testeIdosoMulherObesidadeGrauIII() {
        Assert.assertEquals(
                "Obesidade grau III",
                calcIMC.calcularImc(129, 1.75, 66, "Mulher"));
    }

    //idoso homem
///if (IMC < 22){
//        return "Baixo peso";

    @Test
    public void testeIdosoHomemBaixoPeso() {
        Assert.assertEquals(
                "Baixo peso",
                calcIMC.calcularImc(67, 1.75, 66, "Masculino"));
    }
    //    } else if (IMC >= 22 && IMC <= 27){
//        return "Peso normal";

    @Test
    public void testeIdosoHomemPesoNormalInferior() {
        Assert.assertEquals(
                "Peso normal",
                calcIMC.calcularImc(68, 1.75, 66, "Masculino"));
    }

    @Test
    public void testeIdosoHomemPesoNormalSuperior() {
        Assert.assertEquals(
                "Peso normal",
                calcIMC.calcularImc(82, 1.75, 66, "Masculino"));
    }
//    } else if (IMC > 27 && IMC <= 30){
//        return "Sobrepeso";


    @Test
    public void testeIdosoHomemSobrepesoInferior() {
        Assert.assertEquals(
                "Sobrepeso",
                calcIMC.calcularImc(83, 1.75, 66, "Masculino"));
    }

    @Test
    public void testeIdosoHomemSobrepesoSuperior() {
        Assert.assertEquals(
                "Sobrepeso",
                calcIMC.calcularImc(91, 1.75, 66, "Masculino"));
    }
//    } else if (IMC > 30 && IMC <= 35){
//        return "Obesidade grau I";


    @Test
    public void testeIdosoHomemObesidadeGrauIInferior() {
        Assert.assertEquals(
                "Obesidade grau I",
                calcIMC.calcularImc(92, 1.75, 66, "Masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauISuperior() {
        Assert.assertEquals(
                "Obesidade grau I",
                calcIMC.calcularImc(107, 1.75, 66, "Masculino"));
    }
//    } else if (IMC > 35 && IMC < 40){
//        return "Obesidade grau II";


    @Test
    public void testeIdosoHomemObesidadeGrauIIInferior() {
        Assert.assertEquals(
                "Obesidade grau II",
                calcIMC.calcularImc(108, 1.75, 66, "Masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIISuperior() {
        Assert.assertEquals(
                "Obesidade grau II",
                calcIMC.calcularImc(122, 1.75, 66, "Masculino"));
    }
    //    } else{
//        return "Obesidade grau III";
//    }
    @Test
    public void testeIdosoHomemObesidadeGrauIII() {
        Assert.assertEquals(
                "Obesidade grau III",
                calcIMC.calcularImc(123, 1.75, 66, "Masculino"));
    }

}
