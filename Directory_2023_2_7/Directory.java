package com.company.javaRelearn.Directory_2023_2_7;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();

        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public String toString() {
            return "TreeInfo{" +
                    "files=" + files +
                    ", dirs=" + dirs +
                    '}';
        }

        public static TreeInfo walk(String start, String regex) {
            return recurseDirs(new File(start), regex);
        }

        public static TreeInfo walk(File start, String regex) {
            return recurseDirs(start, regex);
        }

        public static TreeInfo walk(File start) {
            return recurseDirs(start, ".*");
        }

        public static TreeInfo walk(String start) {
            return recurseDirs(new File(start), ".*");
        }

        static TreeInfo recurseDirs(File startDir, String regex) {
            TreeInfo result = new TreeInfo();
            for (File item : startDir.listFiles()) {
                if (item.isDirectory()) {
                    result.dirs.add(item);
                    result.addAll(recurseDirs(item, regex));
                } else {
                    if (item.getName().matches(regex)) {
                        result.files.add(item);
                    }
                }
            }
            return result;
        }
    }
}
