package learning.desing_pattern.adapter_pattern;

public class RemoteFileReaderAdapter implements FileReader {
    private RemoteFileReader remoteFileReader;

    public RemoteFileReaderAdapter(RemoteFileReader remoteFileReader) {
        this.remoteFileReader = remoteFileReader;
    }

    @Override
    public void readFile(String filePath) {
        // Extract the remote file path from the provided file path
        String remoteFilePath = extractRemoteFilePath(filePath);

        // Use the RemoteFileReader to download and read the remote file
        remoteFileReader.downloadFile(remoteFilePath);
        System.out.println("Reading file from remote server: " + remoteFilePath);
        // Implementation to read the downloaded file
    }

    private String extractRemoteFilePath(String filePath) {
        // Extract the remote file path from the provided file path
        // Example logic to extract the remote file path
        return filePath.substring(filePath.indexOf(":") + 1);
    }
}
