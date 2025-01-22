package lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        //  task 1
        System.out.println("---------------task1-------------------");
        File file = new File("files/input.txt");
        List <String> inputStrings = fileToListString(file);
        for (String str : inputStrings) {
            System.out.println(str);
        }

        //  task 2
        System.out.println("---------------task2-------------------");
        File fileOutput = new File("files/output.txt");
        writeStringToFile("string one",fileOutput);
       //  print result task 2
        List <String> stringsFromFileOutout = fileToListString(fileOutput);
        for (String str : stringsFromFileOutout) {
            System.out.println(str);
        }

        // task 3
        System.out.println("----------------task3-------------------");
        File firstfile = new File("files/firstfile.txt");
        File secongfile = new File("files/secondfile.txt");
        File result = new File("files/result.txt");

        gluingFiles(firstfile, secongfile, result);
        //print result task 3
        List <String> stringsFromResult = fileToListString(result);
        for (String str : stringsFromResult) {
            System.out.println(str);
        }

        // task 4 var#1
        System.out.println("---------------------task4 var#1-------------------");
        File fileForTask4v1 = new File("files/task4v1.txt");
        exchangeSymbolByString(fileForTask4v1);
        // print result task 4 var#1
        List <String> stringsFromTask4v1 = fileToListString(fileForTask4v1);
        for (String str : stringsFromTask4v1) {
            System.out.println(str);
        }

        // task 4 var#2
        System.out.println("---------------------task4 var#2-------------------");
        File fileForTask4v2 = new File("files/task4v2.txt");
        exchangeSymbolByChar(fileForTask4v2);
        // print result task 4 var#1
        List <String> stringsFromTask4v2 = fileToListString(fileForTask4v1);
        for (String str : stringsFromTask4v2) {
            System.out.println(str);
        }

    }

    public static void exchangeSymbolByString(File filename) {
        String stringLine = "";
        long currentSeek = 0;
        String stringNew = "";

        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {

            do {
                currentSeek = raf.getFilePointer();
                stringLine = raf.readLine();
                if (stringLine != null) {
                    if (!stringLine.matches("[a-zA-Z0-9]")) {
                        stringNew = stringLine.replaceAll("[^a-zA-Z0-9]", "\\$");
                        raf.seek(currentSeek);
                        raf.writeBytes(stringNew);
                        raf.writeBytes("\n");
                    }
                }
            } while (stringLine != null);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }


    public static void exchangeSymbolByChar(File filename){
        try (RandomAccessFile raf = new RandomAccessFile(filename,"rw")) {
            int code;
            while ((code = raf.read()) != -1) {
                if ((Character.isLetterOrDigit(code) || Character.isISOControl(code))) {
                    continue;
                } else{
                    raf.seek(raf.getFilePointer() - 1);
                    raf.write('$');
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public static void gluingFiles(File firstfile, File secondfile, File resultfile) {
        String tempstr = "";
        try (var buffread1 = new BufferedReader(new FileReader(firstfile));
             var buffread2 = new BufferedReader(new FileReader(secondfile));
             var buffwrite = new BufferedWriter(new FileWriter(resultfile))) {

            while ((tempstr = buffread1.readLine()) != null) {
                buffwrite.write(tempstr);
                buffwrite.write("\n");
            }

            while ((tempstr = buffread2.readLine()) != null) {
                buffwrite.write(tempstr);
                buffwrite.write("\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeStringToFile (String str, File filename) {
        try (var fileWriter = new FileWriter(filename)) {
            fileWriter.write(str);
            fileWriter.write("\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static List <String> fileToListString(File fileName){
        String str = "";
        List <String> strings = new ArrayList<>();

        try (var buffread = new BufferedReader(new FileReader(fileName))) {
            while ((str = buffread.readLine()) != null) {
                strings.add(str);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return strings;
    }
}
