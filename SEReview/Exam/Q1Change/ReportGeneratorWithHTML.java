package com.company.javaRelearn.SEReview.Exam.Q1Change;

public class ReportGeneratorWithHTML extends ReportGenerator {

    public ReportGeneratorWithHTML(String title) {
        super(title);
    }

     //Routine/Temporal Coupling // Control Coupling // Stamp Coupling?
    public void print(Exam e) {
        String report = "";
        report += String.format("<h1>%s</h1>\n", title);
        report += String.format("<h1>Exam Report for exam %s</h1>\n",
                e.getName());
        for (ExamScript s : e.getSubmissions()) {
            boolean isSimilarToAny = false;
            for (ExamScript s2 : e.getSubmissions()) {
                isSimilarToAny = isSimilar(s, s2) || isSimilarToAny;
            }
            report += String.format("<li>%s | %s | %s</li>\n",
                    s.getStudent(), s.getTimeTaken().toString(),
                    isSimilarToAny);
            // More reporting, unshown
        }


        System.out.println(report);
    }
}
