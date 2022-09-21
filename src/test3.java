import javax.sound.sampled.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test3
{
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        //===================== recherche du fichier avec la classe file =========================
        /*File file = new File("secret_msg.txt");
        if(file.exists())
        {
            System.out.println("le fichier existe...");
            System.out.println("chemin absolue :" + file.getAbsolutePath());
            System.out.println("chemin relatif :" + file.getPath());
        }
        else
        {
            System.out.println("fichier non trouvé... :");

        }
        //========================= ecriture sur le fichier ====================
        try
        {
            FileWriter writer = new FileWriter("secret_msg.txt");
            writer.write("j'ai ete ajoute par l'algo \nmoi aussi");
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //==================== lecture de fichier ========================
        try
        {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1)
            {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/

        //========= lecture d'un audio ==========================
        Scanner scanner = new Scanner(System.in);
        File file = new File("audio1.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response="";
        while(!response.equals("Q"))
        {
            System.out.println("P=play , S=Stop, R= Reset, Q= Quit");
            System.out.print("Que voulez vous faire ?");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response)
            {
                case("P"):clip.start();
                break;
                case("S"):clip.stop();
                break;
                case("Q"):clip.close();
                break;
                case("R"):clip.setMicrosecondPosition(0);
                default:System.out.println("Not a valid response");
            }
        }

    }

}
