import java.net.URL;

enum STATUS  { DOWNLOADING, PAUSED, STOPPED};


public class Downloader {
    private URL url;

    private STATUS status;
    private long downloaded;

    public Downloader(URL url){
        this.url = url;
        this.status = STATUS.STOPPED;
        this.downloaded = 0;
    }
    public Downloader(URL url, STATUS status, long progress){
        this.url = url;
        this.status = status;
        this.downloaded = progress;
    }

    public void setDownloaded(long downloaded) {
        this.downloaded = downloaded;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }

    public STATUS getStatus() {
        return status;
    }

    public long getDownloaded() {
        return downloaded;
    }


}

