package cu.uci.cesim.hce_back.ConfigFile;

public class Sender {

    private String name;
    private String address;
    private int port;
    private String facility;
    private boolean hltOverHttp;
    private boolean tls;
    private boolean idis;
    private boolean erp;

    public Sender(String name, String address, int port, String facility, boolean hltOverHttp, boolean tls, boolean idis, boolean erp) {
        this.name = name;
        this.address = address;
        this.port = port;
        this.facility = facility;
        this.hltOverHttp = hltOverHttp;
        this.tls = tls;
        this.idis = idis;
        this.erp = erp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public boolean isHltOverHttp() {
        return hltOverHttp;
    }

    public void setHltOverHttp(boolean hltOverHttp) {
        this.hltOverHttp = hltOverHttp;
    }

    public boolean isTls() {
        return tls;
    }

    public void setTls(boolean tls) {
        this.tls = tls;
    }

    public boolean isIdis() {
        return idis;
    }

    public void setIdis(boolean idis) {
        this.idis = idis;
    }

    public boolean isErp() {
        return erp;
    }

    public void setErp(boolean erp) {
        this.erp = erp;
    }
}
