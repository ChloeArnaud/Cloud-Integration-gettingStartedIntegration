package test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyRequest {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
