package br.com.kleberalbinomoreira.reesc;

import br.com.kleberalbinomoreira.reesc.orm.Professor;
import br.com.kleberalbinomoreira.reesc.repository.ProfessorRepository;
import br.com.kleberalbinomoreira.reesc.service.CrudProfessorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ReescApplication implements CommandLineRunner {
	private CrudProfessorService professorService;
	private ProfessorRepository repository;
	public ReescApplication (CrudProfessorService  professorService){
		this.professorService = professorService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ReescApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Boolean isTrue = true;
		Scanner scanner = new Scanner(System.in);

		while (isTrue) {
			System.out.println("Qual entidade você deseja interagir?");
			System.out.println("0 - Sair");
			System.out.println("1 - Professor");

			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					this.professorService.menu(scanner);
					break;
				default:
					isTrue = false;
					break;
			}
		}
	}
}
