
import java.util.Scanner;
 
public class Principal {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int dia, mes, anoNasc, anoAtual, maxDia= 0;
        String nomeMes;
 
        System.out.println("Em numero, informe o mes de nascimento");
        mes = new Scanner(System.in).nextInt();
 
        while (mes > 12 || mes <= 0) {
            System.out.println("mes informado invalido");
            System.out.println("informe o mes de nascimento");
            mes = new Scanner(System.in).nextInt();
        }
 
        switch (mes) {
        case 1:
            nomeMes = "janeiro";
            maxDia = 31;
            break;
        case 2:
            nomeMes = "fevereiro";
            maxDia = 28;
            break;
        case 3:
            nomeMes = "marco";
            maxDia = 31;
            break;
        case 4:
            nomeMes = "abril";
            maxDia = 30;
            break;
        case 5:
            nomeMes = "maio";
            maxDia = 31;
            break;
        case 6:
            nomeMes = "junho";
            maxDia = 30;
            break;
        case 7:
            nomeMes = "julho";
            maxDia = 31;
            break;
        case 8:
            nomeMes = "agosto";
            maxDia = 31;
            break;
        case 9:
            nomeMes = "setembro";
            maxDia = 30;
            break;
        case 10:
            nomeMes = "outubro";
            maxDia = 31;
            break;
        case 11:
            nomeMes = "novembro";
            maxDia = 30;
            break;
        case 12:
            nomeMes = "dezembro";
            maxDia = 31;
            break;
        default:
            nomeMes = "mes invalido";
        }
 
        System.out.println("Agora, informe o dia de nascimento");
        dia = new Scanner(System.in).nextInt();
 
        while (dia > maxDia || dia <= 0) {
            System.out.println(nomeMes + " tem " + maxDia + " dias");
            System.out.println("dia informado invalido");
            System.out.println("informe o dia de nascimento");
            dia = new Scanner(System.in).nextInt();
        }
        System.out.println("Favor informe o ano de atual");
        anoAtual = new Scanner(System.in).nextInt();
        System.out.println("Favor informe o ano de nascimento");
        anoNasc = new Scanner(System.in).nextInt();
 
        System.out.println("voce nasceu em: " + dia + " de " + nomeMes);
        int idade = anoAtual - anoNasc;
        System.out.println("Voc� tem "+idade+" anos");        
        if (mes == 3){
            if (dia>=21)
                System.out.println("Seu signo � �ries");
            else
                System.out.println("Seu signo Peixes");}
        else if (mes == 4){
            if (dia>=21)
                System.out.println("Seu signo � Touro");
            else
                System.out.println("Seu signo �ries");}
        else if (mes == 5){
            if (dia>=21)
                System.out.println("Seu signo � G�meos");
            else
                System.out.println("Seu signo Touro");}
        else if (mes == 6){
            if (dia>=21)
                System.out.println("Seu signo � C�ncer");
            else
                System.out.println("Seu signo Touro");}
        else if (mes == 7){
            if (dia>=22)
                System.out.println("Seu signo � Le�o");
            else
                System.out.println("Seu signo C�ncer");}
        else if (mes == 8){
            if (dia>=23)
                System.out.println("Seu signo � Virgem");
            else
                System.out.println("Seu signo Le�o");}
        else if (mes == 9){
            if (dia>=23)
                System.out.println("Seu signo � Libra");
            else
                System.out.println("Seu signo Virgem");}
        else if (mes == 10){
            if (dia>=23)
                System.out.println("Seu signo � Escorpi�o");
            else
                System.out.println("Seu signo Libra");}
        else if (mes == 11){
            if (dia>=23)
                System.out.println("Seu signo � Sagit�rio");
            else
                System.out.println("Seu signo Escorpi�o");}
        else if (mes == 12){
            if (dia>=22)
                System.out.println("Seu signo � Capric�rnio");
            else
                System.out.println("Seu signo Sagit�rio");}
        else if (mes == 1){
            if (dia>=21)
                System.out.println("Seu signo � Aqu�rio");
            else
                System.out.println("Seu signo Capric�rnio");}
        else if (mes == 2){
            if (dia>=20)
                System.out.println("Seu signo � Peixes");
            else
                System.out.println("Seu signo Aqu�rio");}
 
    }
}