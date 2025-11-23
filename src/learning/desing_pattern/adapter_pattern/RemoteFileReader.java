package learning.desing_pattern.adapter_pattern;

public class   RemoteFileReader {
    public void downloadFile(String remoteFilePath) {
        System.out.println("Downloading file from remote server: " + remoteFilePath);
    }
}
