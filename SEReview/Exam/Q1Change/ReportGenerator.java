package com.company.javaRelearn.SEReview.Exam.Q1Change;

public class ReportGenerator {
    protected String title;
//    public boolean writeHTML; //内容耦合
//    private boolean writeHTML; //内容耦合

    public ReportGenerator() {}

    public ReportGenerator(String title) {
        this.title = title;
    }

//    public ReportGenerator(boolean shouldWriteHTML) {
//        writeHTML = shouldWriteHTML;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSimilar(ExamScript s1, ExamScript s2) {
        return s1.getStudent().equals(s2.getStudent());
        // Implementation hidden
    }

    // Must be called before printContent //Routine/Temporal Coupling // Control Coupling
//    public void printTitle() {
//        String report = "";
//        if (writeHTML) {
//            report += String.format("<h1>%s</h1>\n", title);
//        } else {
//            report += String.format("%s\n", title);
//        }
//        System.out.println(report);
//    }

    // printTitle should always be called before printContent
//    public void printContent(Exam e) {
//        String report = "";
//        if (writeHTML) {
//            report += String.format("<h1>Exam Report for exam %s</h1>\n",
//                    e.name);
//            for (ExamScript s : e.submissions) {
//                boolean isSimilarToAny = false;
//                for (ExamScript s2 : e.submissions) {
//                    isSimilarToAny = isSimilar(s, s2) || isSimilarToAny;
//                }
//                report += String.format("<li>%s | %s | %s</li>\n",
//                        s.student, s.timeTaken.toString(),
//                        isSimilarToAny);
//                // More reporting, unshown
//            }
//        } else {
//            report += String.format("Exam Report for exam %s\n", e.name);
//            for (ExamScript s : e.submissions) {
//                boolean isSimilarToAny = false;
//                for (ExamScript s2 : e.submissions) {
//                    isSimilarToAny = isSimilar(s, s2) || isSimilarToAny;
//                }
//                report += String.format("%s, %s, %s\n",
//                        s.student, s.timeTaken.toString(),
//                        isSimilarToAny);
//                // More reporting, unshown
//            }
//        }
//        System.out.println(report);
//    }
//    public void printContent(Exam e) {
//        String report = "";
//        if (writeHTML) {
//            report += String.format("<h1>Exam Report for exam %s</h1>\n",
//                    e.getName());
//            for (ExamScript s : e.getSubmissions()) {
//                boolean isSimilarToAny = false;
//                for (ExamScript s2 : e.getSubmissions()) {
//                    isSimilarToAny = isSimilar(s, s2) || isSimilarToAny;
//                }
//                report += String.format("<li>%s | %s | %s</li>\n",
//                        s.getStudent(), s.getTimeTaken().toString(),
//                        isSimilarToAny);
//                // More reporting, unshown
//            }
//        } else {
//            report += String.format("Exam Report for exam %s\n", e.getName());
//            for (ExamScript s : e.getSubmissions()) {
//                boolean isSimilarToAny = false;
//                for (ExamScript s2 : e.getSubmissions()) {
//                    isSimilarToAny = isSimilar(s, s2) || isSimilarToAny;
//                }
//                report += String.format("%s, %s, %s\n",
//                        s.getStudent(), s.getTimeTaken().toString(),
//                        isSimilarToAny);
//                // More reporting, unshown
//            }
//        }
//        System.out.println(report);
//    }


}
