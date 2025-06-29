package com.company.javaRelearn.SEReview.Exam.Q1Change;

public class ReportGeneratorWithoutHTML extends ReportGenerator {
    public ReportGeneratorWithoutHTML(String title) {
        super(title);
    }

    //Routine/Temporal Coupling // Control Coupling
    public void print(Exam e) {
        String report = "";
        report += String.format("%s\n", title);
        report += String.format("Exam Report for exam %s\n", e.getName());
        for (ExamScript s : e.getSubmissions()) {
            boolean isSimilarToAny = false;
            for (ExamScript s2 : e.getSubmissions()) {
                isSimilarToAny = isSimilar(s, s2) || isSimilarToAny;
            }
            report += String.format("%s, %s, %s\n",
                    s.getStudent(), s.getTimeTaken().toString(),
                    isSimilarToAny);
            // More reporting, unshown
        }
        System.out.println(report);
    }
}
