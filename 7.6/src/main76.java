import java.io.*; 
class main76 { 
    public static void main(String[] args) throws IOException 
    { 
        File dir = new File("G:\\New folder"); 
        PrintWriter pw = new PrintWriter("output.txt"); 
        String[] fileNames = dir.list();
        for (String fileName : fileNames) { 
            System.out.println("Reading from " + fileName); 
            File f = new File(dir, fileName); 
            BufferedReader br = new BufferedReader(new FileReader(f)); 
            pw.println("Contents of file " + fileName); 

            String line = br.readLine(); 
            while (line != null) { 

                pw.println(line); 
                line = br.readLine();         
            } 
            pw.flush(); 
        } 

    } 
}