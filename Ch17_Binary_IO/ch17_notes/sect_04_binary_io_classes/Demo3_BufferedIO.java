package ch17_notes.sect_04_binary_io_classes;

import org.junit.Test;

import java.io.*;

public class Demo3_BufferedIO
{
    @Test
    public void testBufferedIO() throws IOException
    {
        //file
        FileOutputStream file = new FileOutputStream("Ch17_Binary_IO/ch17_notes/sect_04_binary_io_classes/crypto.dat");

        //Use BufferedOutputStream
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(file);

        //use BufferedOutputStream for DataOutputStream constructor
        DataOutputStream output = new DataOutputStream(bufferedOutputStream);

        //Write to file
        output.writeUTF("BTC");
        output.writeDouble(61200);

        output.writeUTF("Eth");
        output.writeDouble(4100);

        output.writeUTF("Mkr");
        output.writeDouble(4700);

        //MUST CLOSE
        output.close();

//        //Now read
        //file and bufferedinput at once
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("Ch17_Binary_IO/ch17_notes/sect_04_binary_io_classes/crypto.dat"));

        //use BufferedInputStream for DataInputStream constructor
        DataInputStream inputStream = new DataInputStream(bufferedInputStream);

        while(true)
        {
            try
            {
                System.out.println(inputStream.readUTF() + ": " + inputStream.readDouble());
            }
            catch(EOFException exception)
            {
                System.out.println("All data were read.");
                break;
            }
        }

    }
}
