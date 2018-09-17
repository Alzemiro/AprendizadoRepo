public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int salario = 1000;
        //salario += 1000;
        salario = salario + (int) (salario * 0.1) ;
        // o int é chamado de cast, neste caso força a variavel para inteiro
        System.out.println(salario);
    }

}
