import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;

public class test {
    public void test(){
        NetworkInterface[] devices = JpcapCaptor.getDeviceList();
    }
}
