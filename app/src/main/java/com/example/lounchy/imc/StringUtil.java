package com.example.lounchy.imc;




public class StringUtil {


    public static String calculaImc(float altura, float peso){



        altura = altura / 100;
        float imc = peso / (altura * altura);

            String resultado;


        if (imc < 16) {
            resultado = "Su IMC es: " + imc + "\n" + "Peligroso!"+"\n"+"Usted está desnutrido."+"\n"+" Urgentamente visita su médico!";
        } else if (imc >= 16 && imc <= 18) {
            resultado = "Su IMC es: " + imc + "\n" + "Cuidado!"+"\n"+"Usted está bajo peso."+"\n"+" Visita su médico";
        } else if (imc > 18 && imc <= 25) {
            resultado = "Su IMC es: " + imc + "\n" + "Muy bien!"+"\n"+" Usted tiene peso ideal!";
        } else if (imc > 25 && imc <= 31) {
            resultado = "Su IMC es: " + imc + "\n" + "Cuidado!"+"\n"+" Usted tiene sobrepeso."+"\n"+" Visita su médicoo! ";
        } else if (imc > 31 ) {
            resultado = "Su IMC es: " + imc + "\n" + "Peligroso!"+"\n"+" Usted tiene obesidad."+"\n"+" Urgente visita su médico!";
            
        }   else  {
            resultado = "Ha producido un error! Compruebe si usted ha introducido corectamente su altura y su peso";
        }
        return resultado;
    }

}
