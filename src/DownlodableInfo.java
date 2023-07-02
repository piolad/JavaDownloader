import java.net.URL;

enum STATUS  { DOWNLOADING, PAUSED, STOPPED};


public class DownlodableInfo {
    private URL url;
    private STATUS status;
    private double progress;

    public DownlodableInfo(URL url){
        this.url = url;
        this.status = STATUS.STOPPED;
        this.progress = 0;
    }
    public DownlodableInfo(URL url, STATUS status, double progress){
        this.url = url;
        this.status = status;
        this.progress = progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
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

    public double getProgress() {
        return progress;
    }
}

