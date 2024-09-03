package hospitalprivado;

import java.util.Scanner;

public class HospitalPrivado 
{

    public static void main(String[] args) 
    {
        Scanner info = new Scanner (System.in);
        Paciente pacienteUm = new Paciente("","");
        
        System.out.println("Digite o nome do paciente: ");
        pacienteUm.setNome(info.nextLine());
        System.out.println("Digite o tipo de enfermidade: ");
        pacienteUm.setTipoEnfermidade(info.nextLine());
    
    while(true)
    {
        Scanner entradaDados = new Scanner (System.in);
        System.out.println("Digite uma opçao do menu : \n [1] Relatorio do paciente. \n [2] Alterar enfermidade.");
        int opcao = entradaDados.nextInt();
        if(opcao == 1)
        {
            System.out.println("" + pacienteUm.relatorioPaciente());
        }
        else if (opcao==2)
                {
                    System.out.println("Digite o nome tipo de enffermidade: ");
                    pacienteUm.setTipoEnfermidade(info.nextLine());
                }
        else 
        {
            System.out.println(" Fim ");
            break;
        }
    }
    }
}