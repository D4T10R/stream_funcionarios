package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionarios;

public class Program {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o caminho do arquivo? ");
        String path = sc.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Funcionarios> funcionarios = new ArrayList<>();
            
            String line = br.readLine();
            while (line != null) {
                String[] funcionario = line.split(",");
                funcionarios.add(new Funcionarios(funcionario[0], funcionario[1], Double.parseDouble(funcionario[2])));
                line = br.readLine();
            } 

            System.out.println("Entre com o salario: ");
            Double salarioProcura = sc.nextDouble();

            List<String> emailsSalarioAltos = funcionarios.stream()
                        .filter(f -> f.getSalario() > salarioProcura)
                        .map(f -> f.getEmail())
                        .collect(Collectors.toList());

            Double somaSalario = funcionarios.stream()
                        .filter(f -> f.getName().charAt(0) == 'M')
                        .map(f -> f.getSalario())
                        .reduce(0.0, (x, y) -> x + y);
            
            System.out.println("Os emails das pessoas que recebem mais que " + String.format("%.2f", salarioProcura));
            emailsSalarioAltos.forEach(System.out::println);
            System.out.println("Soma dos salarios das pessoas que começam com a letra 'M': " + somaSalario);

        } catch (IOException e) {
            e.getMessage();
        }

    }


}