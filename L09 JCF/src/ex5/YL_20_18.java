package ex5;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class YL_20_18 {
    public static void main(String[] args) {
        File f = new File("L09 JCF/src");
        System.out.printf("Size = %,d bytes",  getSize(f));
    }

//    long getSize(File directory) {
//        long size = 0;
//        add directory to the queue;
//        while (queue is not empty) {
//            Remove an item from the queue into t;
//            if (t is a file)
//                size += t.length();
//            else
//                add all the files and subdirectories under t into the queue;
//        }
//        return size;
//    }

    public static long getSize(File directory) {
        long size = 0;
        Queue<File> queue = new LinkedList<>();
        queue.add(directory);
        while (!queue.isEmpty()) {
            File t = queue.remove();
            if (t.isFile()) {
                size += t.length();
            } else {
                // t is a directory
                File[] subfiles = t.listFiles();
                if (subfiles != null) {
                    Collections.addAll(queue, subfiles);
                }
            }
        }
        return size;
    }
}
