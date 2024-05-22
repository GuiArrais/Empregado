public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido");
        }
    }

    public String toString() {
        String salarioFormatado = String.format("%.2f", salario);
        return "\nNome: " + nome + "\nIdade: " + idade + "\nSalário: R$" + salarioFormatado;
    }

    public void promover() {
        if (idade > 18) {
            double aumento = this.salario * 0.25;
            aumentarSalario(aumento);
        } else {
            System.out.println("O funcionário não atende os requisitos para a promoção");
        }
    }

    public void aumentarSalario(double percentualAumento) {
        this.salario += percentualAumento;
        System.out.printf("O salário foi aumentado para: R$%.2f \n", this.salario);
    }

    public void demitir(int motivo) {
        if (motivo == 1) {
            System.out.println("Justa causa. \nO funcionário deverá cumprir aviso prévio");
        } else if (motivo == 2) {
            double multa = this.salario * 0.4;
            this.salario -= multa;
            System.out.printf("Decisão do empregador. \nMulta de 40%% aplicada. \nSalário atual: R$%.2f \n", this.salario);
        } else if (motivo == 3) {
            if (salario >= 1000 && salario < 2000) {
                this.salario = 1500;
            } else if (salario >= 2000 && salario < 3000) {
                this.salario = 2500;
            } else if (salario >= 3000 && salario < 4000) {
                this.salario = 3500;
            } else {
                this.salario = 4000;
            }
            System.out.printf("Aposentadoria. \nSalário de aposentadoria aplicado. \nSalário: R$%.2f \n", this.salario);
        }
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Feliz aniversário " + this.nome + "!!!");
        System.out.println("Idade atual: " + this.idade + " anos");
    }
}