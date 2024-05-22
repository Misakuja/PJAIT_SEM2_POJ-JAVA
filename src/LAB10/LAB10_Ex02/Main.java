package LAB10.LAB10_Ex02;

import java.io.File;

class Main {
    public static void main(String[] args) {
        File dir = new File("src/LAB10/LAB10_Ex02/basedir");

            File[] filesMainDir = dir.listFiles();

            int maxCount = 0;
            String maxName = "";

            if (filesMainDir != null) {
                for (File filesMain : filesMainDir) {
                    if (filesMain.isDirectory()) {
                        File[] filesSubDir = filesMain.listFiles();
                        int count = 0;
                        if (filesSubDir != null) {
                            for (File fileSub : filesSubDir) {
                                if (fileSub.isFile() && !fileSub.getName().startsWith(".")) {
                                    count++;
                                }
                            }
                        }
                        if (count > maxCount) {
                            maxCount = count;
                            maxName = filesMain.getName();
                        }
                    }
                }
            }
            System.out.println("The directory with the most files is: " + maxName + ", it has " + maxCount + " files.");
        }
    }
