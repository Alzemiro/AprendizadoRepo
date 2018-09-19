public class ControleFluxo3 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        if (idade < 18){
            status = "Não adulto";
        }else{
            status = "Adulto";
        }
        status = idade < 18 ? "Não Adulto" : "Adulto"; //operador ternário
        System.out.println(idade < 18 ? "Não Adulto" : "Adulto");
        System.out.println(status);
    }
}
