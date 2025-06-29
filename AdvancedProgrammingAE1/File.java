package com.company.javaRelearn.AdvancedProgrammingAE1;

public class File implements Component {
    private String fileName;
    private int fileSize;

    public File() {}

    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public int getSize() {
        return fileSize;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public String display(String prefix) {
        if (!prefix.equals("\t")) {
            return fileName + "(" + fileSize + ")";
        }
        return null;
    }

    @Override
    public Component search(String name) {

        return null;
    }

//    public static String getDirectoryPath(java.io.File file, String fileName) {
//        String result = "";
//        for (java.io.File file1 : file.listFiles()) {
//            if (file1.isDirectory()) {
//                result = getDirectoryPath(file1,fileName);
//            } else {
//                if (file1.getName().equals(fileName)) {
//                    result = file1.getPath();
//                }
//            }
//        }
//        return result;
//    }
}
