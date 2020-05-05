package OO.compo;

public class CursoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno alunoProcura = new Aluno();
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(new Aluno("Roberto"));
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome);
			System.out.println("... e meu nome é " + aluno.nome);
		}
		System.out.println();
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("... e meu nome é " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = alunoProcura.cursoProcurado("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
