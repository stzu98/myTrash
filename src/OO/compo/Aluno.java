package OO.compo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	String nome;
	
	final List<Curso> cursos = new ArrayList<>();
	
	public Aluno() {
		
	}
			
	public Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(String nome) {
		this.adicionarCurso(new Curso(nome));
	}
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso cursoProcurado(String nome) {
				
		for (Curso c : this.cursos) {
			
			if(c.nome.equalsIgnoreCase(nome)){
				return c;
			}
			
			
		}
		return null;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}
	
	
}
