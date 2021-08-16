package exercises.ex05_java_to_html;

import java.io.*;
import java.util.Scanner;

/** Chapter 21 (Sets and Maps) - Exercise 5:
 * (Syntax highlighting) Write a program that converts a Java file into an HTML file. In the HTML file,
 * the keywords, comments, and literals are displayed in bold navy, green, and blue, respectively.
 *
 * Use the command line to pass a Java file and an HTML file. For example, the following command
 *               java Exercise21_05 Welcome.java Welcome.html
 * converts Welcome.java into Welcome.html.
 * Figure 21.8a shows a Java file. The corresponding HTML file is shown in Figure 21.8b.
 *
 * @author Khaled
 */

public class JavaToHTML_Conversion
{
    public static void main(String[] args) throws IOException
    {
        //file to convert:
        File javaFile = new File("Ch21_Sets_Maps/exercises/ex05_java_to_html/SrcFile_To_Convert.java");

        //new html file
        File htmlFile = new File("Ch21_Sets_Maps/exercises/ex05_java_to_html/converted.html");

        writeHtmlPre(htmlFile);
        writeJavaCode(javaFile, htmlFile);
        writeHtmlPost(htmlFile);
    }

    private static void writeHtmlPre(File htmlFile) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter(htmlFile);
        String htmlTemplatePre = "<html lang=\"en\">\n" +
                                 "" +
                                 "<head>\n" +
                                 "  <meta charset=\"utf-8\">\n" +
                                 "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                                 "\n" +
                                 "<style>\n" +
                                 "body {background-color: powderblue; display:block;}\n" +
                                 "h1   {color: blue;}\n" +
                                 "p    {color: red;}\n" +
                                 "</style>" +
                                 "  <title>Java to HTML</title>" +
                                 "</head>\n" +
                                 "\n" +
                                 "<body>\n";
        writer.println(htmlTemplatePre);
        writer.close();
    }

    private static void writeJavaCode(File javaFile, File htmlFile)
    {
        try(Scanner javaReader = new Scanner(javaFile); FileWriter write = new FileWriter(htmlFile, true))
        {
            while(javaReader.hasNextLine())
            {
                String nextLine = javaReader.nextLine();
                System.out.println(nextLine);
                write.append(nextLine);
                write.write(System.getProperty( "line.separator" ));
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void writeHtmlPost(File htmlFile) throws IOException
    {
        FileWriter write = new FileWriter(htmlFile, true);
        String htmlTemplatePre = "</body>\n" +
                                 "</html>";
        write.append(htmlTemplatePre);
        write.close();
    }
}