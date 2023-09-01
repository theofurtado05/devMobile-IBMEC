package control;

public class CalculadoraIMC {


    public String calcularImc(double peso, double altura, int idade, String sexo){
        double IMC = peso / (altura*altura);
        if(idade >= 65){
            if(sexo.equals("Masculino")){
                if (IMC < 22){
                    return "Baixo peso";
                } else if (IMC >= 22 && IMC <= 27){
                    return "Peso normal";
                } else if (IMC > 27 && IMC <= 30){
                    return "Sobrepeso";
                } else if (IMC > 30 && IMC <= 35){
                    return "Obesidade grau I";
                } else if (IMC > 35 && IMC < 40){
                    return "Obesidade grau II";
                } else{
                    return "Obesidade grau III";
                }
            } else {
                if (IMC < 22){
                    return "Baixo peso";
                } else if (IMC >= 22 && IMC <= 27){
                    return "Peso normal";
                } else if (IMC > 27 && IMC <= 32){
                    return "Sobrepeso";
                } else if (IMC > 32 && IMC <= 37){
                    return "Obesidade grau I";
                } else if (IMC > 37 && IMC < 42){
                    return "Obesidade grau II";
                } else{
                    return "Obesidade grau III";
                }

            }
        } else {
            if (IMC < 16){
                return "Baixo peso muito grave";
            } else if (IMC >= 16 && IMC < 17){
                return "Baixo peso grave";
            } else if (IMC >= 17 && IMC < 18.50){
                return "Baixo peso";
            } else if (IMC >= 18.50 && IMC < 25){
                return "Peso normal";
            } else if (IMC >= 25 && IMC < 30){
                return "Sobrepeso";
            } else if (IMC >= 30 && IMC < 35){
                return "Obesidade grau I";
            } else if (IMC >= 35 && IMC < 40){
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III";
            }
        }

    }

}

