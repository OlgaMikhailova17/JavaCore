package lesson5;


import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String [] header;
    private Integer[][] data;

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }


    public void readFromFile(String file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            ArrayList<Integer[]> rowslist = new ArrayList<>();
            header = (reader.readLine().split(";"));
            String result;
            while((result = reader.readLine()) !=null){
                String[] str = result.split(";");
                Integer[] i = new Integer[str.length];
                for(int j=0;j<str.length;j++){
                    i[j] = Integer.parseInt(str[j]);
                }
                rowslist.add(i);
            }
            data = rowslist.toArray(new Integer[][]{});
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void writeToCSV(String resultFileName){
        try (BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName)))){
            StringBuffer oneLine = new StringBuffer();
            for( int i=0;i< header.length;i++){
                oneLine.append(header[i]);
                oneLine.append(";");
            }
            bw.write(oneLine.toString());
            bw.newLine();
            for(int i=0;i<data.length;i++){
                Integer[] rowData = data[i];
                oneLine.delete(0, oneLine.length());
                for(int j=0;j<rowData.length;j++){
                    oneLine.append(rowData[j]);
                    oneLine.append(";");
                }
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

