class Url{
    private String url;
    Url(String url){
        this.url = url;
    }

    public String getProtocol(){
        var urlSplit = this.url.split("://");
        return urlSplit[0];
    }
    public String getHost() {
        var urlSplit = this.url.split("://");
        return urlSplit[1];
    }
}