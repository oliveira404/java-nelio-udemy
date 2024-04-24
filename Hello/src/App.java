import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
    

    Aluno aluno1 = new Aluno(); 
    
    String alunoscadastraveis = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar?"); 
    
    List<Aluno> alunos = new ArrayList<Aluno>(); 
     
    for (int quantidade = 1; quantidade <= Integer.parseInt(alunoscadastraveis); quantidade++) { 
     
     String nomeString = JOptionPane.showInputDialog("Informe o nome do " + quantidade + "º aluno:"); 
     aluno1.setNome(nomeString); 
      
     for (int pos = 1; pos <= 3; pos++) { 
      String nomeDisciplina = JOptionPane.showInputDialog("Informe a " + pos + "ª disciplina:"); 
      String notaDisciplina = JOptionPane 
        .showInputDialog("Informe a nota em " + nomeDisciplina + " do aluno " + aluno1.getNome() + ": "); 
      ObjetoDisciplinaComLista discilplinaDaLista = new ObjetoDisciplinaComLista(); 
      discilplinaDaLista.setDisciplina(nomeDisciplina); 
      discilplinaDaLista.setNota(Double.parseDouble(notaDisciplina)); 
      aluno1.getDisciplinas().add(discilplinaDaLista); 
     } 
     alunos.add(aluno1); 
    } 
    for (Aluno aluno : alunos) { 
     System.out.println("O Aluno " + aluno.getNome() + " teve a  média de " 
       + aluno.getMediaNota() + ", portanto esta "+aluno.getAlunoAprovado()+"!"); 
     System.out.println("------------------------------------------------------------------------"); 
    }  
   } 
  }