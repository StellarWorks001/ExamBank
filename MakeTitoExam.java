


import java.util.Vector;

public class MakeTitoExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Tito Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("Where is Tito joining the WEbex from?"));
            question.setChoiceA(("Lake Park @ West Valley City"));
            question.setChoiceB(("From a beach in Florida"));
            question.setChoiceC(("From a casino in Vegas"));
            question.setChoiceD(("From the cloud"));
            question.setAnswer(("a"));
            questions.addElement(question);
        }
        {
            Question question = new Question();
            question.setQuery(("What does Tito do at Discover"));
            question.setChoiceA(("Project Management"));
            question.setChoiceB(("Developer"));
            question.setChoiceC(("Business Analyst"));
            question.setChoiceD(("Still finding his way"));
            question.setAnswer(("b"));
            questions.addElement(question);
        }
        return exam;
    }

}
