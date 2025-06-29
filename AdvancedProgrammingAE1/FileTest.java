package com.company.javaRelearn.AdvancedProgrammingAE1;

public class FileTest {
    public static void main(String[] args) {
//        File courseworkpdf = new File("courseworkpdf",1);
//        File courseworkzip = new File("coursework zip file",2);
//
//        Directory coursework = new Directory("coursework");
//        coursework.add(courseworkpdf);
//        coursework.add(courseworkzip);
//
//        Directory unittests = new Directory("unit tests");
//        File test1 = new File("unit test 1",56);
//        unittests.add(test1);
//
//        Directory unittests2 = new Directory("unit tests 2");
//        File test2 = new File("unit test 2",100);
//        File test3 = new File("unit test 3",300);
//        Directory unittests3 = new Directory("unit tests 3");
//        File test4 = new File("unit test 4",400);
//        unittests.add(test2);
//
//        unittests2.add(test3);
//
//        unittests.add(unittests2);
//        unittests3.add(test4);
////        unittests.add(unittests3);
//        coursework.add(unittests);
//        coursework.add(unittests3);
//        coursework.remove(courseworkzip);
//        System.out.println(coursework.display("\t"));
////
//        System.out.println( coursework.search("unit test 2").getName() );
//        System.out.println( coursework.search("unittests").getName() );
//        System.out.println( coursework.search("unit test 3").getName() );
//        System.out.println( coursework.search("unit test 4").getName() );
//        System.out.println( coursework.search("unit tests 3").getName() );
//        System.out.println( coursework.search("courseworkpdf").getName() );
//        File courseworkpdf = new File("courseworkpdf",1);
//        File courseworkzip = new File("coursework zip file",2);
//
//        Directory coursework = new Directory("coursework");
//        coursework.add(courseworkpdf);
//        coursework.add(courseworkzip);
//
//        Directory unittests = new Directory("unit tests");
//        File test1 = new File("unit test 1",56);
//        unittests.add(test1);
//
//        coursework.add(unittests);
//        coursework.remove(courseworkzip);
//        System.out.println(coursework.display("\t"));
//
//        System.out.println( coursework.search("unit test 1").getName() );
//        Directory dic1 = new Directory("dir1");
//        Directory dic2 = new Directory("dir2");
//        Directory dic3 = new Directory("dir3");
//        Directory dic4 = new Directory("dir4");
//        Directory dic5 = new Directory("dir5");
//
//        File coursework = new File("coursework",90);
//        File coursework1 = new File("coursework1",90);
//
//        dic4.add(dic5);
//        dic3.add(dic4);
//        dic3.add(coursework1);
//        dic2.add(dic3);
//        dic1.add(dic2);
//        dic5.add(coursework);
//        System.out.println(dic1.display("\t"));
//        dic5.remove(coursework);
//        System.out.println(dic1.display("\t"));
//        File file1 = new File("file1",1);
//        File file2 = new File("file2",2);
//        File file3 = new File("file3",3);
//        File file4 = new File("file4",4);
//        File file5 = new File("file5",5);
//        File file6 = new File("file6",6);
//
//        Directory Root = new Directory("Root");
//        Directory Dir1 = new Directory("Dir1");
//        Directory Dir2 = new Directory("Dir2");
//        Directory Dir3 = new Directory("Dir3");
//        Directory Dir4 = new Directory("Dir4");
//        Directory Dir5 = new Directory("Dir5");
//        Directory Dir6 = new Directory("Dir6");
//        Directory Dir7 = new Directory("Dir7");
//        Directory Dir8 = new Directory("Dir8");
//
//        Root.add(Dir1);
//        Root.add(Dir2);
//        Root.add(file1);
//        Dir1.add(Dir3);
//        Dir3.add(file2);
//        Dir3.add(Dir4);
//        Dir3.add(file3);
//        Dir4.add(Dir5);
//        Dir5.add(file4);
//        Dir5.add(Dir6);
//        Dir6.add(Dir7);
//        Dir7.add(file5);
//        Root.add(file6);
//        Dir7.add(Dir8);
//
//
//        System.out.println(Root.display("\t"));
//
//        Dir5.remove(Dir6);
//
//        System.out.println(Root.display("\t"));
//
//        System.out.println(Root.search("file6").getName() );
//        System.out.println(Root.search("file10").getName());
        File courseworkpdf = new File("courseworkpdf",1);
        File courseworkzip = new File("coursework zip file",2);

        Directory coursework = new Directory("coursework");
        coursework.add(courseworkpdf);
        coursework.add(courseworkzip);

        Directory unittests = new Directory("unit tests");
        File test1 = new File("unit test 1",56);
        unittests.add(test1);

        coursework.add(unittests);
        coursework.remove(courseworkzip);
        System.out.println(coursework.display("\t"));

        System.out.println( coursework.search("unit test 1").getName() );
    }
}
