package OO.compo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(String aluno) {
		this.adicionarAluno(new Aluno(aluno));
	}
	
	void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		aluno.cursos.add(this);
	}

	
}
