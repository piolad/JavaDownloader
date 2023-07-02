import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length != 0){
            //do stuff with args
        }
        else{
            String urltxt = "https://gosafir.com/mag/wp-content/uploads/2019/12/Tolkien-J.-The-lord-of-the-rings-HarperCollins-ebooks-2010.pdf";
            URL url = new URL(urltxt);







            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setRequestMethod("HEAD");

            long removeFileSize = httpConnection.getContentLengthLong();

            System.out.println("File size: " + removeFileSize);

            String fieldValue = httpConnection.getHeaderField("Content-Disposition");
            if(fieldValue == null || !fieldValue.contains("filename=\"")){

                System.out.println("No file name");
                System.out.println("fieldValue: " + fieldValue);
                System.out.println("substrd: " + fieldValue.substring(fieldValue.indexOf("filename=\"") + 10, fieldValue.length() ));
                return;
            }
            String fileName = fieldValue.substring(fieldValue.indexOf("filename=\"") + 10, fieldValue.length() - 1);

            System.out.println("File name: " + fileName);



            File file = new File("", fileName);
            if(file.exists()){
                System.out.println("File exists");
                System.out.println("File length: " + file.length());
            }


            if(file.length() < removeFileSize) {
                System.out.println("File is not complete");

                OutputStream os = new FileOutputStream("a.png", true);

                BufferedInputStream in = new BufferedInputStream(url.openStream());
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    os.write(dataBuffer, 0, bytesRead);
                }


                in.close();
            }




            System.out.println("File size: " + removeFileSize);
            System.out.println("File name: " + fileName);

        }
    }
}